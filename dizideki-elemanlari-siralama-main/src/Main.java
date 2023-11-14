import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println("Dizinin boyutu n : " + n);
        System.out.println("Dizinin elemanlarını giriniz :");
        int[] list = new int[n];
        for (int i=0; i<n; i++){
            int A = inp.nextInt();
            list[i]=A;
        }
        for (int j=0; j<list.length; j++){
            System.out.println(j+". Elemanı : "+list[j]);
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}
