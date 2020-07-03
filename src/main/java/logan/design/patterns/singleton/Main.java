package logan.design.patterns.singleton;

import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("main <=START");
        testStaticSingleton();
        log.info("main <= END");
    }

    public static void testStaticSingleton() {
        IntStream.range(0, 10).parallel().forEach(i -> {
            log.info("testStaticSingleton <= START [{}]", i);
            StaticSingleton.getInstance();
            log.info("testStaticSingleton <= END [{}]", i);
        });
    }

}
