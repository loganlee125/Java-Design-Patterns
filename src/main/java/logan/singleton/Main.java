package logan.singleton;

import logan.common.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) throws InterruptedException {
        log.info("main <=START");
        testStaticSingleton();
        testInnerClassSingleTon();
        log.info("main <= END");
    }

    public static void testStaticSingleton() throws InterruptedException {
        Utility.testWrapper("Static", StaticSingleton::getInstance);
    }

    public static void testInnerClassSingleTon() throws InterruptedException {
        Utility.testWrapper("InnerClass", InnerClassSingleTon::getInstance);
    }

}
