import java.util.Scanner;
class hipotenus {
    public static void main(String[] args) {

        double a,b,c = 0;

        System.out.print("a kenarini giriniz : ");
        Scanner inpa=new Scanner(System.in);
        a = inpa.nextDouble();

        System.out.print("b kenarini giriniz : ");
        Scanner inpb=new Scanner(System.in);
        b = inpb.nextDouble();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println(c);



    }
}