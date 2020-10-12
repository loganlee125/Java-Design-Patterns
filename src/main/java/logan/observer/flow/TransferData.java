package logan.observer.flow;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransferData {

    private float temperature;
    private float humidity;
    private float pressure;

}
