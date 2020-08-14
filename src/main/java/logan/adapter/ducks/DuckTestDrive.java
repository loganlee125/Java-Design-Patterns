package logan.adapter.ducks;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        log.info("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        log.info("The Duck says...");
        testDuck(duck);

        log.info("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
