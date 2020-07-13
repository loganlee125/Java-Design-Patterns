package logan.design.patterns.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Constants {

    public static final long SINGLETON_DELAY_INIT = 5000L;
    public static final long SHUTDOWN_AWAIT_TIME = SINGLETON_DELAY_INIT + 1000;
    public static final int THREAD_POOL_SIZE = 20;

}
