/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı
yazınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lutfen bir sayi giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int toplam=0;

        for (int i=0; i<=a; i++){
            if (i%3==0 && i%4==0){
            }
            toplam += i;
        }
        System.out.println(toplam);


    }
}
