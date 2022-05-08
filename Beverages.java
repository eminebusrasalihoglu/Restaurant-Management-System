public class Beverages extends Menu{
private int ml;
    public Beverages(double price, String name, int ml) {

        super(price, name);
        this.ml=ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
}
