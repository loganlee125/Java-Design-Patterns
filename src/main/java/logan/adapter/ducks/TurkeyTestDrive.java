package logan.adapter.ducks;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TurkeyTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            log.info("The DuckAdapter says... {}", i);
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
