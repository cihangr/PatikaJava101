import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i , N;
        do {
            System.out.print("Kaç sayı gireceksiniz: -> ");
            N = scanner.nextInt();
            if(N < 2) {
                System.out.print("İki sayı karşılaştırmak için, en az iki sayı giriniz!\n");
            }
        } while (N < 2);
        int[] dizi = new int[N];
        for(i = 0; i<dizi.length;i++) {
            System.out.print(i+1 +". Sayınızı giriniz: ");
            dizi[i] = scanner.nextInt();
        }
        int max = dizi[0];
        for(int j = 0;j<dizi.length;j++) {
            if(max < dizi[j]) {
                max = dizi[j];
            }
        }
        int min = dizi[0];
        for(int k = 0;k<dizi.length;k++) {
            if(dizi[0] > dizi[k]) {
                min = dizi[k];
            }
        }
        System.out.println("\nEn büyük sayınız: "+max);
        System.out.println("En küçük sayınız: "+min);

    }

}
