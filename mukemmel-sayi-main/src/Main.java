import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir sayi giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int toplam=0;
        for (int i=1; i<a; i++){
            if (a%i==0){
                toplam+=i;
                System.out.println(i);
            }
        }
        if (a==toplam){
            System.out.println(a+" mukemmel bir sayidir.");
        }else{
            System.out.println(a+" mukemmel bir sayi degildir.");
        }

    }
}
