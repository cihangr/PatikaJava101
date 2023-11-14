import java.util.Scanner;

public class Main {
    static void besCikar(int a, int b, int i){
        if (b>a) return;
        if (b<1) i*=-1;
        System.out.print(" " + b + " ");
        besCikar(a, b  + i * 5, i);

    }
    public static void main(String[] args) {
        System.out.println("N Sayısı :");
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        besCikar(N,N,-1);
    }
}
