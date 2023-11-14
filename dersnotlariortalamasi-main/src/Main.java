package ortalamaHesaplama;
import java.util.Scanner;

public class ortalamaHesaplama {
    public  static void main(String[] args) {
        int mat, fizik, kimya, tarih, muzik, turkce;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Ders Notunu Griniz .: ");
        mat = inp.nextInt();

        System.out.print("Fizik Ders Notunu Griniz .: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Ders Notunu Griniz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih Ders Notunu Griniz .: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Ders Notunu Griniz .: ");
        muzik = inp.nextInt();

        System.out.print("Türkçe Ders Notunu Griniz .: ");
        turkce = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik + turkce);
        double sonuc = (toplam / 6.0);

        System.out.println("Ders ORTALAMANIZ .: " + sonuc);
        System.out.println(sonuc < 60 ? "UZGUNUM KALDINIZ :(" : "TEBRIKLER GECTINIZ");


    }
}
