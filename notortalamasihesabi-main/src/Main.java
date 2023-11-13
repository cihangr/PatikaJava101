import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int turkce,matematik,fizik,kimya,tarih,muzik;

        System.out.print("Turkce Notunuzu Giriniz:");
        turkce = inp.nextInt();
        System.out.print("Matematik Notunuzu Giriniz:");
        matematik = inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = inp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = inp.nextInt();
        System.out.print("Muzik Notunuzu Giriniz:");
        muzik = inp.nextInt();
        double sonuc = (double) (turkce+matematik+fizik+kimya+tarih+muzik)/6;
        System.out.println("Ortalamaniz :"+ sonuc);
        String s = sonuc >= 60 ? "Gecti":"Kaldi";
        System.out.print(s);

    }
}