package logan.observer.flow.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import logan.observer.flow.TransferData;
import logan.observer.pattern.observer.DisplayElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class StatisticsDisplay implements Subscriber<TransferData>, DisplayElement {

    private Subscription subscription;
    private float min = 1000;
    private float max;
    private float avg;
    private float sum;
    private int size;

    @Override
    public void display() {
        log.info("Avg/Max/Min temperature = {}/{}/{}", avg, max, min);
    }

    public void update(float temperature) {
        if (temperature < min) {
            this.min = temperature;
        }
        if (temperature > max) {
            this.max = temperature;
        }
        sum += temperature;
        size++;
        this.avg = sum / size;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        log.info("onSubscribe");
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(TransferData weatherData) {
        update(weatherData.getTemperature());
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
