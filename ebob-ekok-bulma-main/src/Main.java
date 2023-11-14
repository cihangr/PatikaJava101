import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lutfen EBOB ve EKOK degerlerini bulmak istediginiz sayilari giriniz: ");
        System.out.println("a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("b: ");
        int b = input.nextInt();
        int ebob=1, ekok=1, i=1;
        if (a>b) {
            while (i>=a){
                if (a % i == 0 && b%i==0) {
                    ebob=i;
                }
                i++;
            }
        }else{
            while (b>=i){
                if (a % i == 0 && b%i==0) {
                    ebob=i;
                }
                i++;
            }
        }
        System.out.println(ebob);
        ekok=a*b/ebob;
        System.out.println(ekok);
    }
}
