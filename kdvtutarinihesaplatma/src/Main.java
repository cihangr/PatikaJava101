import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int A = inp.nextInt();
        double B;
        System.out.println("KDV'siz Fiyat = " + A);
        if(A<=0){
            System.out.println("Yanlis Bir deger girdiniz.");
        }
        if (A>0 && A<=1000){
            B = A+(A*0.18);
            System.out.println("KDV'li Fiyat = " + B);
        }else {
            B = A+(A*0.08);
            System.out.println("KDV'li Fiyat = " + B);
        }
        double C=B-A;
        System.out.println("KDV Tutari = " + C);
    }
}