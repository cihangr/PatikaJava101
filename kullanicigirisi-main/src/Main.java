//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
// sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği
// şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
// şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
// sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, check, newpassword;

        System.out.print("Lütfen Kullanıcı Adınızı ve Şifrenizi Giriniz: \n");
        System.out.print("Adınız: \n");
        Scanner entername = new Scanner(System.in);
        userName = entername.nextLine();

        System.out.print("Şifreniz: \n");
        Scanner enterpassword = new Scanner(System.in);
        password = enterpassword.nextLine();

        if(userName.equals("Cihan123") && (password.equals("123123"))) {
            System.out.print("Başarılı Giriş.");
        } else {
            System.out.print("Başarısız Giriş. \n");
            System.out.print("Kullanıcı Şifrenizi değiştirmek ister misiniz?e-Evet,h-Hayır. \n");
            Scanner ask = new Scanner(System.in);
            check = ask.nextLine();
            if (check.equals("e")){
                System.out.print("Yeni Şifrenizi Giriniz: ");
                Scanner newentry = new Scanner(System.in);
                newpassword = newentry.nextLine();
                if (newpassword.equals(password)){
                    System.out.print("Şifre Oluşturulamadı!");
                }else {
                    System.out.print("Şifre Başarıyla Değiştirildi. \n");
                }}
                else {
                    System.out.print("Şifrenizi Tekrar Giriniz: ");
                }

            }


        }
    }
