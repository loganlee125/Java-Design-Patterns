package logan.observer.flow;

import java.util.concurrent.SubmissionPublisher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData extends SubmissionPublisher<TransferData> {

    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        submit(new TransferData(temperature, humidity, pressure));
    }

    @Override
    public int submit(TransferData item) {
        int submit = super.submit(item);
        log.info("submit [{}] {}", submit, item);
        return submit;
    }

}
