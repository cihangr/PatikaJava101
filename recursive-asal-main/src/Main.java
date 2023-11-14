import java.util.Scanner;

public class Main {
    static boolean isPrime(int a, int i){
        if (a==2){
            return true;
        }else{
            if (i > 2) {

            if (a%i==0){
                return false;
            }else{
                return isPrime(a,i-1);
            }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sayı Giriniz :");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        if (isPrime(a,a-1)){
            System.out.println(a+" sayısı ASALDIR !");
        }else{
            System.out.println(a+" sayısı ASAL değildir !");
        }

    }
}
