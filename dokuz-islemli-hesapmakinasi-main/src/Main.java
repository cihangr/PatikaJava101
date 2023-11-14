import java.util.Scanner;

public class Main {

    static int topla(){
        System.out.println("toplamak istediginiz degerleri sirayla giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int sonuc = a+b;
        System.out.println("toplama islemi sonucu: "+sonuc);
        return sonuc;}

    static int cikar(){
        System.out.println("cikarma yapmak istediginiz degerleri sirayla giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int sonuc = a-b;
        System.out.println("cikarma islemi sonucu: "+sonuc);
        return sonuc;}

    static int carp(){
        System.out.println("carpma istediginiz degerleri sirayla giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int sonuc = a*b;
        System.out.println("carpma islemi sonucu: "+sonuc);
        return sonuc;}

    static int bol(){
        System.out.println("bolme istediginiz degerleri sirayla giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        System.out.println("bolunecek sayiyi 0'dan farkli bir deger giriniz!");
        int b= inp.nextInt();
        if(b==0){
            System.out.println("yanlis bir deger girdiniz.");
            return 0;
        }
        int sonuc = a/b;
        System.out.println("bolme islemi sonucu: "+sonuc);
        return sonuc;}

    static int usal(){
        System.out.println("us almak istediginiz degeri ve ussunu sirayla giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int sonuc=1;
        for (int i=1; i<=b; i++){
            sonuc *= a;
        }
        System.out.println(a+" sayisinin "+b+ " ussunun degeri "+sonuc+"dir.");
        return sonuc;}

    static int fakt(){
        System.out.println("faktoriyel almak istediginiz degeri giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int sonuc=1;
        for (int i=a; i>0; i--){
            sonuc *= i;
        }
        System.out.println(a+" sayisinin faktoriyel degeri "+ sonuc+ " dir");
        return sonuc;}

    static int mod(){
        System.out.println("mod almak istediginiz degeri ve bolunecek degeri sirayla giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int sonuc = a%b;
        System.out.println("Modunun degeri "+sonuc);
        return sonuc;}

    static int cevre(){
        System.out.println("cevresini hesaplamak istediginiz dikdortgen kenarlarini sirayla giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int sonuc = 2*(a+b);
        System.out.println("kenarlarina ait dikdortgenin cevresi "+sonuc+" dir.");
        return sonuc;}

    static int alan(){
        System.out.println("alanini hesaplamak istediginiz dikdortgenin kenarlarini sirayla giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int sonuc = a*b;
        System.out.println("kenarlarina ait dikdortgenin alani "+sonuc+" dir.");
        return sonuc;}

    public static void main(String[] args) {
        String menu = "1+,2-,3x,4/,5üs^,6fakt!,7mod%,8cev[],9alan[],0son";
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    usal();
                    break;
                case 6:
                    fakt();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    cevre();
                    break;
                case 9:
                    alan();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("yanlis bir deger girdiniz!");
            }
        }            while (select != 0) ;

    }
}
