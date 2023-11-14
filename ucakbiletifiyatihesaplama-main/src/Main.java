package ucakbiletifiyatinormalTutar;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

    public static void main(String[] args) {
        System.out.println("Uçak Bileti Fiyatı Hesaplama");
        Scanner input = new Scanner(System.in);
        
        int mesafe, yas, yolculukTipi;
        double normalTutar, yasIndirimi, indirimliTutar, gidisDönüsBiletIndirimi, toplamTutar;
        System.out.print("Mesafe(KM) giriniz: ");
        mesafe = input.nextInt();
        
        System.out.print("Lutfen yaşınızı giriniz: ");
        yas = input.nextInt();
        
        System.out.print("Lutfen yolculuk tipi (1-Tek Yön, 2-Gidiş-Dönüş) giriniz: ");
        yolculukTipi = input.nextInt();
        normalTutar = mesafe * 0.10;
                
        if(yas>0 && yolculukTipi>0 && yolculukTipi<3)
        {
            if(yolculukTipi==1 && yas>=0)
        {
            if(yas<=12)
            {
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.print("İndirimli Toplam Fiyat: " + indirimliTutar);
            }
            if(yas>12 && yas<=24)
            {
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.print("İndirimli Toplam Fiyat: " + indirimliTutar);
            }
            if(yas>24)
            {
                System.out.print("Toplam Fiyat: " + normalTutar);
            }
            if(yas>=65)
            {
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.print("İndirimli Toplam Fiyat: " + indirimliTutar);
            }
        }
        if(yas>=0 && yolculukTipi==2)
        {
            if(yas<=12)
            {
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDönüsBiletIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar-gidisDönüsBiletIndirimi)*2;
                System.out.print("İndirimli Toplam Fiyat: " + toplamTutar);
            }
            if(yas>12 && yas<=24)
            {
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDönüsBiletIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar-gidisDönüsBiletIndirimi)*2;
                System.out.print("İndirimli Toplam Fiyat: " + toplamTutar);
            }
            if(yas<35 && yas>24)
            {
                System.out.print("Toplam Fiyat: " + normalTutar);
            }
            if(yas>=65)
            {
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDönüsBiletIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar-gidisDönüsBiletIndirimi)*2;
                System.out.print("İndirimli Toplam Fiyat: " + toplamTutar);
            }
        }
        }
        else
        {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }  
}
