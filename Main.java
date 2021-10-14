import java.util.Scanner;
/**
 * Intellijde yazilmistir
 *
 * @author EmineBüşraSalihoğlu


 */
public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu();//menuye eklecek olan nesneler
        Menu yemek1 = new Yemek(40,"Tas kebabı","Osmanlı Mutfagı");
        Menu yemek2 = new Yemek(40,"Kuzu guvec","Osmanlı Mutfagı");
        Menu yemek3 = new Yemek(40,"Dana haslama","Osmanlı Mutfagı");
        Menu yemek4 = new Yemek(30,"Akdeniz Salatası","Salata");
        Menu yemek5 = new Yemek(30,"Sezar Salata","Salata");
        Menu yemek6 = new Yemek(30,"Spagetti Blonez","Dünya Mutfagı");
        Menu yemek7 = new Yemek(40,"Beff Tagliatelli","Dünya Mutfagı");
        Menu yemek8 = new Yemek(30,"Kori soslu Tavuk","Dünya Mutfagı");
        Menu icecek1 = new Icecek(3,"Su",200);
        Menu icecek2 = new Icecek(5,"Cola",250);
        Menu icecek3 = new Icecek(5,"Soda",200);
        Menu icecek4 = new Icecek(5,"Salgam suyu",300);
        Siparis siparis1 = new Siparis(0);
        Odeme odeme1 = new Odeme();
        //menuye yemek ve icecekler eklenir
        menu1.yemekAdd((Yemek) yemek1);
        menu1.yemekAdd((Yemek) yemek2);
        menu1.yemekAdd((Yemek) yemek3);
        menu1.yemekAdd((Yemek) yemek4);
        menu1.yemekAdd((Yemek) yemek5);
        menu1.yemekAdd((Yemek) yemek6);
        menu1.yemekAdd((Yemek) yemek7);
        menu1.yemekAdd((Yemek) yemek8);
        menu1.icecekAdd((Icecek) icecek1);
        menu1.icecekAdd((Icecek) icecek2);
        menu1.icecekAdd((Icecek) icecek3);
        menu1.icecekAdd((Icecek) icecek4);
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        boolean flagOne = true;
         while(flagOne){//bu while dondusu sistemden cikis icindir
        System.out.println("Masa eklemek icin 1 e \nMasa cikartmak icin 2'ye\nMasaları goruntulemek icin 3'e basiniz\nCikmak icin 0 a basiniz");
        int giris = input.nextInt();
       if(giris == 1){
        System.out.println("Masa numarasisini giriniz ==>");
        int masam = input.nextInt();
        siparis1.setMasaNo(masam);//odeme classındaki masaNo yu bizim istedigimiz olarak alır
        int secim;
        int secim2;
        int secim3;
        menu1.menu_show();//menu gosterilir
        System.out.println("Istenen urun numarasi=\nCikmak icin 0'a basiniz");
        flag = true;
        while(flag){//bu while dongusu urun eklemeyi sonlandırmak icindir
            System.out.println("Urun numarasi ==>");
            secim = input.nextInt();
           if(secim == 0){
                flag = false;
            }
            else if (secim>12){
                System.out.println("gecersiz sayi girdiniz");
            }
            else{//yazdigimiz urun numarasina gore yemek secilir ve siparis listelerine eklenir
                if(secim == 1){
                    siparis1.siparisSonuc(yemek1.getFiyat());
                    siparis1.siparisUrun(yemek1.getIsim());
                    siparis1.siparisFiyat(yemek1.getFiyat());
                }
                else if(secim == 2){
                    siparis1.siparisSonuc(yemek2.getFiyat());
                  siparis1.siparisUrun(yemek2.getIsim());
                   siparis1.siparisFiyat(yemek2.getFiyat());
                }
                else if(secim == 3){
                    siparis1.siparisSonuc(yemek3.getFiyat());
                    siparis1.siparisUrun(yemek3.getIsim());
                    siparis1.siparisFiyat(yemek3.getFiyat());
                }
                else if(secim == 4){
                    siparis1.siparisSonuc(yemek4.getFiyat());
                    siparis1.siparisUrun(yemek4.getIsim());
                    siparis1.siparisFiyat(yemek4.getFiyat());
                }
                else if(secim == 5){
                    siparis1.siparisSonuc(yemek5.getFiyat());
                    siparis1.siparisUrun(yemek5.getIsim());
                    siparis1.siparisFiyat(yemek5.getFiyat());
                }
                else if(secim == 6){
                    siparis1.siparisSonuc(yemek6.getFiyat());
                   siparis1.siparisUrun(yemek6.getIsim());
                   siparis1.siparisFiyat(yemek6.getFiyat());
                }
                else if(secim == 7){
                    siparis1.siparisSonuc(yemek7.getFiyat());
                    siparis1.siparisUrun(yemek7.getIsim());
                    siparis1.siparisFiyat(yemek7.getFiyat());
                }
                else if(secim == 8){
                    siparis1.siparisSonuc(yemek8.getFiyat());
                   siparis1.siparisUrun(yemek8.getIsim());
                    siparis1.siparisFiyat(yemek8.getFiyat());
                }
                else if(secim == 9){
                    siparis1.siparisSonuc(icecek1.getFiyat());
                    siparis1.siparisUrun(icecek1.getIsim());
                    siparis1.siparisFiyat(icecek1.getFiyat());
                }
                else if(secim == 10){
                    siparis1.siparisSonuc(icecek2.getFiyat());
                    siparis1.siparisUrun(icecek2.getIsim());
                    siparis1.siparisFiyat(icecek2.getFiyat());
                }
                else if(secim == 11){
                    siparis1.siparisSonuc(icecek3.getFiyat());
                    siparis1.siparisUrun(icecek3.getIsim());
                    siparis1.siparisFiyat(icecek3.getFiyat());
                }
                else if(secim == 12){
                    siparis1.siparisSonuc(icecek4.getFiyat());
                    siparis1.siparisUrun(icecek4.getIsim());
                    siparis1.siparisFiyat(icecek4.getFiyat());
                }
        }
      }

        siparis1.adisyonGoster();//siparis ettigimiz urunler fiyatlariyla beraber gosterilir
        System.out.println(siparis1.getMasaNo()+".masanın toplam hesabı "+siparis1.getToplam());
        System.out.println("Urun kaldırmak istiyorsaniz 1'e devam etmek icin 0'a basiniz");
         secim2=input.nextInt();
        if(secim2 == 1) {//urun kaldırmak istiyorsak 1 e bastigimizda bu if blogunun icine girer
            flag = true;

            while (flag) {//bu while urun kaldırmayi bitirmek icindir
                System.out.println("Siparis listenizden kaldirmak istediginiz urunun numarasini giriniz.\nÇıkmak istediginizde 0 a basiniz");
                secim3 = input.nextInt();
                if (secim3 == 0) {
                    flag = false;
                } else {
                    siparis1.siparisSonuc(-(siparis1.siparis_list1.get(secim3 - 1)));
                    siparis1.siparisRemove((secim3 - 1));
                }
            }
        }
        siparis1.adisyonGoster();//urun kaldırmıssak diye adisyon tekrar gosterilir

        System.out.println(siparis1.getMasaNo() + ".MASANIN TOPLAM HESABI " + siparis1.getToplam());
        odeme1.Gunluk(siparis1.getToplam());//masadan elde edilen mikta gunluk hasilat kısmına gonderilğir ve restoran toplam hasilatini gorur
        odeme1.masaEkle(siparis1.getMasaNo(),siparis1.getToplam());//masa numarasi ve hesabı eklenir
        siparis1.setToplam(0);//static degisken oldugu icin ifin sonunda set komutuyla 0 yapariz
        siparis1.siparisSil();
        }

        else if(giris==2){//masa silip hesasın odenmesi icin gereken blogtur
           System.out.println("ODENECEK MASA NUMARASINI GIRINIZ==>");
           int secim4 = input.nextInt();
           int a = odeme1.masalist.indexOf(secim4);//masa numarasinin indexi bulunur
           System.out.println("ODENMESI GEREKEN TUTAR==>"+odeme1.masalist2.get(a));
            System.out.println("ODENEN TUTAR==>");
            double butce=input.nextDouble();
            odeme1.odemes(butce,odeme1.masalist2.get(a));
           odeme1.masaSil(a);
    }
        else if(giris==3){
            odeme1.masalarıGoruntule();
            //o gun kazanılan hasilat goruntulenir
           System.out.println("TOPLAM HASILAT-->"+odeme1.getGunlukKazanc());
           System.out.println("\n");
        }
        else{
            flagOne=false;//sistemden cikilmak icin bayrak false yapilir
        }


        }
    }
}