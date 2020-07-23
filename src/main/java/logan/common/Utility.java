package logan.common;

import java.util.stream.IntStream;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Utility {

    public static void testWrapper(String name, Runnable runnable) throws InterruptedException {
        var executor = new CustomExecutor(name);
        IntStream.range(0, Constants.THREAD_POOL_SIZE).forEach(i -> executor.execute(() -> {
            log.info("{} <= START [{}]", name, i);
            runnable.run();
            log.info("{} <= END [{}]", name, i);
        }));
        executor.shutdown();
    }

}
