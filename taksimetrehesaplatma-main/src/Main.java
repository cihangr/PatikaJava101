import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20;
        double tutar=10 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi Giriniz :");
        km = input.nextInt();
        tutar += (km * perKm) ;
        tutar = (tutar < 20) ? 20 : tutar ;
        System.out.println("Toplam tutar : " + tutar);

    }
}
