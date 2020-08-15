package logan.template.sort;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)};

        log.info("Before sorting: {}", (Object) ducks);

        Arrays.sort(ducks);

        log.info("After sorting: {}", (Object) ducks);
    }
}
