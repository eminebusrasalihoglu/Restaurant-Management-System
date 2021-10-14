import java.util.ArrayList;
import java.util.Arrays;

public class Yemek extends Menu{
    private String alan;
    public Yemek(double fiyat, String isim,String alan) {
        super(fiyat, isim);
        this.alan = alan;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }
}
