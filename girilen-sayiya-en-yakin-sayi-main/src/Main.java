import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int A = 5, number = 0;
        int[] list= {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        int closebig=number;
        int closesmall=number;

        for (int i: list){
            if (i<number){
                closebig=i;
                break;
            }
            }

        for (int i=list.length-1; i<=0; --i){
            if (list[i]<number){
                closesmall=list[i];
            }
        }
        System.out.println("Dizi: "+ Arrays.toString(list));
        System.out.println("Girilen Sayı : "+A);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ closesmall);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+ closebig);
        }
    }
