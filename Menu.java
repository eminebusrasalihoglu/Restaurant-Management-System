import java.util.ArrayList;

public class Menu{
    private double fiyat;
    private String isim;
    ArrayList<Yemek> yemek_list= new ArrayList<Yemek>();
    ArrayList<Icecek> icecek_list= new ArrayList<Icecek>();

    public Menu(){
        this(0,"bilgi yok");
    }
    public Menu(double fiyat,String isim){

        this.fiyat = fiyat;
        this.isim = isim;
    }
    void yemekAdd(Yemek a){
        yemek_list.add(a);
    }

    void icecekAdd(Icecek a){
        icecek_list.add(a);
    }



    public void menu_show(){
        System.out.println("   YEMEKLER   ");
        for(int i=0;i<yemek_list.size();i++){
            System.out.println((i+1)+") "+yemek_list.get(i).getAlan()+" "+yemek_list.get(i).getIsim()+" fiyat "+yemek_list.get(i).getFiyat());
        }
        System.out.println("   ICECEKLER ");
        for(int i = yemek_list.size();i<(icecek_list.size()+yemek_list.size());i++){
            System.out.println((i+1)+") "+icecek_list.get(i-yemek_list.size()).getIsim()+" fiyat "+icecek_list.get(i-yemek_list.size()).getFiyat()+"-->"+icecek_list.get(i-yemek_list.size()).getMl()+" ml");
        }
    }





    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
}