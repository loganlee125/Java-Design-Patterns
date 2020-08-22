package logan.iterator.transition;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MenuItem {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    @Override
    public String toString() {
        return name + ", " + price + " -- " + description;
    }
}
