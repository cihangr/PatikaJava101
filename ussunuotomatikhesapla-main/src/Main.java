import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir sayi giriniz: ");
        Scanner inpa = new Scanner(System.in);
        int a = inpa.nextInt();

        System.out.println("Kacinci derece ussunu almak istiyorsunuz: ");
        Scanner inpb = new Scanner(System.in);
        int b = inpa.nextInt();

        double total=1;

        for (int i=1; i<=b; i++){
            total*=a;
        }
        System.out.println("Sonucunuz: "+total);
    }
}
