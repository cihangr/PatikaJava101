import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lutfen Matrisin buyuklugunu giriniz M(k x j)");
        System.out.print("k: ");
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        System.out.print("j: ");
        int j = inp.nextInt();
        int[][] A = new int[k][j];
        int[][] T = new int[j][k];

        for (int row = 0; row < A.length; row++) {
            for (int column = 0; column < A[row].length; column++) {
                A[row][column] = inp.nextInt();
                T[column][row] = A[row][column];
            }
        }
        for (int i=0; i<A.length; i++){
            for (int m=0; m<A[i].length; m++){
                System.out.print(A[i][m]+" ");
            }
            System.out.println();
        }
        System.out.println("=====TRANSPOZE=====");

        for (int i=0; i<T.length; i++) {
            for (int m = 0; m < T[i].length; m++) {
                System.out.print(T[i][m] + " ");
            }
            System.out.println();
        }
    }
}
