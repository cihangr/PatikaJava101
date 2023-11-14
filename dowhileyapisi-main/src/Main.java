import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        do {
            System.out.println("no: "+ a);
            a--;
        } while(a>=0);


    }
}
