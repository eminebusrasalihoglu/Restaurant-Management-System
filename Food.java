import java.util.ArrayList;
import java.util.Arrays;

public class Food extends Menu{
    private String category;
    public Food(double price, String name, String category) {
        super(price,name);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category=category;
    }
}
