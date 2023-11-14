import java.util.Scanner;
public class Main {
    static boolean isPalindrom (int a){
        int givenNumber=a, reverseNumber=0;
        while(givenNumber!=0){
            reverseNumber = (givenNumber%10)+reverseNumber*10;
            givenNumber/=10;
        }
        if (reverseNumber==givenNumber)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        System.out.println("Lutfen bir sayi giriniz: ");
        Scanner inp = new Scanner(System.in);
        int enteredNumber = inp.nextInt();
        System.out.println(isPalindrom(enteredNumber));

    }
}
