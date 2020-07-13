package logan.design.patterns.singleton;

import logan.design.patterns.common.Constants;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class StaticSingleton {

    private static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton() {
        log.info("StaticSingleton <==== START");
        try {
            Thread.sleep(Constants.SINGLETON_DELAY_INIT);
        } catch (Exception e) {
            log.error("Sleep fail", e);
        }
        log.info("StaticSingleton <==== END");
    }

    public static StaticSingleton getInstance() {
        return instance;
    }
}
