import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a1, a2, a3;
        System.out.println("Lutfen Siralamak Istediginiz Uc sayiyi giriniz.");
        System.out.println("1: ");
        Scanner inp1 = new Scanner(System.in);
        a1 = inp1.nextDouble();

        System.out.println("2: ");
        Scanner inp2 = new Scanner(System.in);
        a2 = inp2.nextDouble();

        System.out.println("3: ");
        Scanner inp3 = new Scanner(System.in);
        a3 = inp1.nextDouble();

        if(a1>a2 && a1>a3){
            if(a2>a3){
                System.out.println(a1+">"+a2+">"+a3);
            }else{
                System.out.println(a1+">"+a3+">"+a2);
            }
        }
        if(a2>a1 && a2>a3){
            if(a1>a3){
                System.out.println(a2+">"+a1+">"+a3);
            }else{
                System.out.println(a2+">"+a3+">"+a1);
            }
        }
        if(a3>a1 && a3>a2){
            if(a2>a1){
                System.out.println(a3+">"+a2+">"+a1);
            }else{
                System.out.println(a3+">"+a1+">"+a2);
            }
        }

    }
}
