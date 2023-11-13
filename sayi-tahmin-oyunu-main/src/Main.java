import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int N = rand.nextInt(100);
        int[] deneme = new int[5];
        boolean yanlisdeneme = true;
        boolean kazanamadiniz = true;
        System.out.println(N);
        System.out.println("Tuttugum sayiyi tahmin et!");
//=================================5 can hakki tanimladik====================//
        for (int right =5; right>0; right--){
            System.out.println("Dogru sayiyi tahmin edebilmek icin "+right+" kadar hakki kaldi.");
            int A = inp.nextInt();
            if (A>100 || A<0){
                if (yanlisdeneme) {
                    System.out.println("Yanlis bir deger girdiniz. Tekrar yanlis girerseniz deneme hakkiniz azalir.");
                    right++;
                    yanlisdeneme = false;
                    continue;
                } else {
                    if (right==1){
                        break;
                    }
                    System.out.println("Ikinci kez yanlis girdiniz. 1 Deneme hakkiniz azaldi.");
                    continue;
                }
            }
            if (A>N){
                if (right==1){
                    break;
                }
                System.out.println("Iyi deneme biraz daha kucuk sayi secmelisin.");
                deneme[right-1]=A;
                continue;
            } else if (A<N){
                if (right==1){
                    break;
                }
                System.out.println("Iyi deneme biraz daha buyuk sayi secmelisin");
                deneme[right-1]=A;
                continue;
            } else if (A==N){
                System.out.println("Bravo dogru sayiyi buldun.");
                kazanamadiniz=false;
                break;
            }

        }
        if (kazanamadiniz){
            System.out.println("Malesef dogru sayi "+N+" idi.");
        }
        System.out.println("["+Arrays.toString(deneme)+"]");














    }
}