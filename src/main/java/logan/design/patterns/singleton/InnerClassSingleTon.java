package logan.design.patterns.singleton;

import logan.design.patterns.common.Constants;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class InnerClassSingleTon {

    private InnerClassSingleTon() {
        log.info("InnerClassSingleTon <==== START");
        try {
            Thread.sleep(Constants.SINGLETON_DELAY_INIT);
        } catch (Exception e) {
            log.error("Sleep fail", e);
        }
        log.info("InnerClassSingleTon <==== END");
    }

    public static InnerClassSingleTon getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static InnerClassSingleTon instance = new InnerClassSingleTon();
    }
}
