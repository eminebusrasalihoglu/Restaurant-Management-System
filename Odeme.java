import java.util.ArrayList;

public class Odeme {
    private static double gunlukKazanc=0;
    ArrayList<Integer> masalist = new ArrayList<Integer>();
    ArrayList<Double> masalist2 = new ArrayList<Double>();
    public Odeme() {

    }
    public void odemes(double butce, double hesap){
        if(butce<hesap){
            System.out.println("Odenecek miktar yetersiz");
        }
       else{
           double kalan = butce = butce-hesap;
            System.out.println("Kalan miktar"+ kalan);
    }}
    public void Gunluk(double hasilat){
        gunlukKazanc+=hasilat;
    }

    public double getGunlukKazanc(){
        return gunlukKazanc;
    }

    public void setGunlukKazanc(double gunlukKazanc) {
        this.gunlukKazanc = gunlukKazanc;
    }
    void masaEkle(int masam,double hesabım){
        masalist.add(masam);
        masalist2.add(hesabım);
    }
    void masaSil(int masam){
        masalist.remove(masam);
        masalist2.remove(masam);

    }
    void masalarıGoruntule(){
        if(masalist.size()==0){
            System.out.println("Dolu masa yok");
        }
        else{
            for(int i=0;i<masalist.size();i++){
                System.out.println("MASA "+masalist.get(i)+" = "+masalist2.get(i));
            }}
    }
}
