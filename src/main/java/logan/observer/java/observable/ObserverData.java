package logan.observer.java.observable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ObserverData {

    private float temperature;
    private float humidity;
    private float pressure;

}
