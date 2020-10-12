package logan.observer.flow.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import logan.observer.flow.TransferData;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class CurrentConditionsDisplay implements Subscriber<TransferData>, DisplayElement {

    private Subscription subscription;
    private float temperature;
    private float humidity;

    @Override
    public void display() {
        log.info("Current conditions: {}F degrees and {}% humidity", temperature, humidity);
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        log.info("onSubscribe");
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(TransferData weatherData) {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        log.error("onError", throwable);
    }

    @Override
    public void onComplete() {
        log.info("onComplete");
    }

}
