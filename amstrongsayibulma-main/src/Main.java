import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lutfen bir sayi giriniz: ");
        Scanner inpa = new Scanner(System.in);
        int a = inpa.nextInt();
        int gecicisayi=a, basamaksayisi=0, basamakdegeri=0, sonuc=0;

        while (gecicisayi!=0){
            gecicisayi/=10;
            basamaksayisi++;
        }
        System.out.println("Toplam basakamak sayisi: " + basamaksayisi);
        gecicisayi=a;
        while (gecicisayi!=0){
            basamakdegeri = gecicisayi%10;
            sonuc+=basamakdegeri;
            gecicisayi/=10;

        }
        System.out.println("Basamaklarin degerleri toplami:" + sonuc);

    }
}
