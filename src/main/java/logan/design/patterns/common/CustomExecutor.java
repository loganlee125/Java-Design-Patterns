package logan.design.patterns.common;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public final class CustomExecutor {

    private ExecutorService executorService;

    public CustomExecutor(String name) {
        executorService = Executors.newFixedThreadPool(Constants.THREAD_POOL_SIZE, new SimpleThreadFactory(name));
    }

    public void execute(Runnable command) {
        executorService.execute(command);
    }

    public <T> Future<T> submit(Callable<T> task) {
        return executorService.submit(task);
    }

    public void shutdown() throws InterruptedException {
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
        if (!executorService.isTerminated()) {
            var isTerminated = executorService.awaitTermination(Constants.SHUTDOWN_AWAIT_TIME, TimeUnit.MILLISECONDS);
            if (!isTerminated) {
                var runables = executorService.shutdownNow();
                log.warn("", runables.size());
            }
        }
    }

    private static final class SimpleThreadFactory implements ThreadFactory {
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private final String namePrefix;

        private SimpleThreadFactory(String namePrefix) {
            this.namePrefix = namePrefix + '-';
        }

        public Thread newThread(Runnable r) {
            return new Thread(r, namePrefix + threadNumber.getAndIncrement());
        }

    }
}
