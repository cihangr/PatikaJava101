import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutKilo , elmaKilo , domatesKilo, patlicanKilo;

        double armutfiyat = 2.14;
        double elmafiyat = 3.67;
        double domatesfiyat = 1.11;
        double patlicanfiyat = 5.00;

        double toplamFiyat ;

        Scanner kg = new Scanner(System.in);

        System.out.println("Armutun Kilosunu Giriniz :");
        armutKilo = kg.nextInt();

        System.out.println("Elmanın Kilosunu Giriniz :");
        elmaKilo = kg.nextInt();

        System.out.println("Domatesin Kilosunu Giriniz :");
        domatesKilo = kg.nextInt();

        System.out.println("Patlıcanın Kilosunu Giriniz :");
        patlicanKilo = kg.nextInt();

        toplamFiyat = (armutKilo * armutfiyat) + (elmaKilo * elmafiyat) + (domatesKilo * domatesfiyat) +
                (patlicanfiyat * patlicanKilo) ;

        System.out.println("Toplam Fiyat : " + toplamFiyat);
    }
}
