import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number :");
            int number = scanner.nextInt();
            double result = 0 ;
        for (int i = 1 ; i <= number ; i++){
            result += ( 1 / i) ;
        }

        System.out.println("Harmonik Sayı : " + result);
    }
}
