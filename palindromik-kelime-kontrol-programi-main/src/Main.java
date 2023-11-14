import java.util.Scanner;

public class Main {
    public static boolean isPalindromik (String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
            }
        return true;
        }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Palindromik kelimeyi girin: ");
        String str = inp.nextLine();
        System.out.println(isPalindromik(str));
    }
}
