import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik ;
        Scanner hava = new Scanner(System.in);

        System.out.println("Hava durumunu Giriniz : ");
        sicaklik = hava.nextInt();

        if (sicaklik < 5){
            System.out.println("Hava Durumu Kayak Yapmaya Uygundur.");
        } else if (sicaklik >= 5 && sicaklik<15) {
            System.out.println("Hava Durumu Sinemaya Gitmek İçin Uygundur.");
        } else if (sicaklik >= 15 && sicaklik <25) {
            System.out.println("Hava Durumu Piknik Yapmak İçin Uygundur.");
        } else if (sicaklik >= 25 ) {
            System.out.println("Hava Yüzmek İçin Uygundur.");
        }
    }
}
