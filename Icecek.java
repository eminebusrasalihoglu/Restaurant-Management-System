public class Icecek extends Menu{
private int ml;
    public Icecek(double fiyat, String isim,int ml) {

        super(fiyat, isim);
        this.ml=ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
}
