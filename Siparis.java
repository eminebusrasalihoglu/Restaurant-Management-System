import java.util.ArrayList;

public class Siparis {
    private int masaNo;
    static int toplam = 0;
    ArrayList<String> siparis_list=new ArrayList<>();
    ArrayList<Double> siparis_list1=new ArrayList<>();

    public Siparis(){
        this(0);
    }
    public Siparis(int masaNo) {
        this.masaNo=masaNo;
    }
    public void adisyonGoster(){
        System.out.println("   Siparisleriniz   ");
        for(int i=0;i<siparis_list.size();i++){
            System.out.println( (i+1)+siparis_list.get(i)+ " ----->"+ siparis_list1.get(i));
        }

    }
    void siparisUrun(String b){
        siparis_list.add(b);
    }
    void siparisFiyat(double b){
        siparis_list1.add(b);
    }
    void siparisRemove(int c){
        siparis_list.remove(c);
        siparis_list1.remove(c);
    }
    public void siparisSil(){
        siparis_list1.clear();
        siparis_list.clear();
    }


    public int getMasaNo() {
        return masaNo;
    }

    public void setMasaNo(int masaNo) {
        this.masaNo = masaNo;
    }

    public static int getToplam() {
        return toplam;
    }

    public static void setToplam(int toplam) {
        Siparis.toplam = toplam;
    }

    public int siparisSonuc(double fiyat){
    toplam+=fiyat;
return toplam;
}
}