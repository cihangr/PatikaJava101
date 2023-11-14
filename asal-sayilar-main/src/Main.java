
public class Main {
    public static int isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return -1;
            }
        }
        return 1;
    }
    public static void main(String args[]) {
        int lower_bound = 2, upper_bound=100;
        for (int i = lower_bound; i <= upper_bound; i++) {
            if (isprime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
