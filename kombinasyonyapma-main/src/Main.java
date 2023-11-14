import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kume Sayisini Giriniz: ");
        Scanner inp1 = new Scanner(System.in);
        int a = inp1.nextInt();

        System.out.println("Alt Kumenin eleman sayisini giriniz: ");
        Scanner inp2 = new Scanner(System.in);
        int b = inp1.nextInt();
        double faktoriyel1 = 1;
        double faktoriyel2 = 1;
        double faktoriyel3 = 1;
        double sonuc, z;
        z = a - b;

        if (a > 0 && a>b) {
            for (int i = 1; i <= a; i++) {
                faktoriyel1 = faktoriyel1 * i;
            }
            for (int j = 1; j <= b; j++) {
                faktoriyel2 = faktoriyel2 * j;
            }
            for (int k = 1; k <= z; k++) {
                faktoriyel3 = faktoriyel3 * k;
            }
        }else{
            System.out.println("Yanlis bir veri girdiniz.");
        }
            sonuc = faktoriyel1 / (faktoriyel2 * faktoriyel3);
            System.out.println("Olusturulabilecek alt kume sayisi " + sonuc);

        }
    }
