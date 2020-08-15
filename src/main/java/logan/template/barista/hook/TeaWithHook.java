package logan.template.barista.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeaWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        log.info("Steeping the tea");
    }

    public void addCondiments() {
        log.info("Adding Lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        return getUserInput().toLowerCase().startsWith("y");
    }

    private static String getUserInput() {
        String answer = "no";

        log.info("Would you like lemon with your tea (y/n)? ");

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        try {
            answer = in.readLine();
            log.info("Answer {}", answer);
        } catch (IOException ioe) {
            log.error("IO error trying to read your answer", ioe);
        }
        return answer;
    }
}
