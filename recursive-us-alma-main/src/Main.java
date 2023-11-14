import java.util.Scanner;

public class Main {
    static double us(int a, int b){
        if (b!=0){
            return (a*us(a,b-1));
        }else{
            return 1.0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Taban değeri giriniz :");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        System.out.println("Üs değerini giriniz :");
        int b= inp.nextInt();
        System.out.println(us(a,b));
    }
}
