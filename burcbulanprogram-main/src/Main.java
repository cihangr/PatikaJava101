package burcBulanProgram;
import java.util.Scanner;
public class burcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        Boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay .: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün .: ");
        day = input.nextInt();

        /* switch (month) {
            case 1:
                if (day >=1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28){
                    if (day < 20){
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if(day >=1 && day <=31){
                    if (day < 21){
                        burc = "Balık";
                    } else {
                        burc ="Koç";
                    }
                }else {
                    isError=true;
                }
                break;
            case 4:
                if(day >=1 && day <=30){
                    if (day < 21){
                        burc = "Koç";
                    } else {
                        burc ="Boğa";
                    }
                }else {
                    isError=true;
                }
                break;
            case 5:
                if(day >=1 && day <=31){
                    if (day < 22){
                        burc = "Boğa";
                    } else {
                        burc ="ikizler";
                    }
                }else {
                    isError=true;
                }
                break;
            case 6:
                if(day >=1 && day <=30){
                    if (day < 23){
                        burc = "İkizler";
                    } else {
                        burc ="Yengeç";
                    }
                }else {
                    isError=true;
                }
                break;
            case 7:
                if(day >=1 && day <=31){
                    if (day < 23){
                        burc = "Yengeç";
                    } else {
                        burc ="Aslan";
                    }
                }else {
                    isError=true;
                }
                break;
            case 8:
                if(day >=1 && day <=31){
                    if (day < 23){
                        burc = "Aslan";
                    } else {
                        burc ="Başak";
                    }
                }else {
                    isError=true;
                }
                break;
            case 9:
                if(day >=1 && day <=30){
                    if (day < 23){
                        burc = "Başak";
                    } else {
                        burc ="Terazi";
                    }
                }else {
                    isError=true;
                }
                break;
            case 10:
                if(day >=1 && day <=31){
                    if (day < 23){
                        burc = "Terazi";
                    } else {
                        burc ="Akrep";
                    }
                }else {
                    isError=true;
                }
                break;
            case 11:
                if(day >=1 && day <=30){
                    if (day < 22){
                        burc = "Akrep";
                    } else {
                        burc ="Yay";
                    }
                }else {
                    isError=true;
                }
                break;
            case 12:
                if(day >=1 && day <=31){
                    if (day < 22){
                        burc = "Yay";
                    } else {
                        burc ="Oğlak";
                    }
                }else {
                    isError=true;
                }
                break;
            default:
                isError = true;
        } */
        if(1<=month && month<=12) {
            if(month == 1) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 2) {
                if (1 <= month && month <= 28) {
                    if (day <= 19) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 3) {
                if (1 <= month && month <= 31) {
                    if (day <= 20) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 4) {
                if (1 <= day && day <= 30) {
                    if (day <= 20) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 5) {
                if (1 <= day && day <= 31) {
                    if (day <= 20) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 6) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 7) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 8) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 9) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 10) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 11) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                }
                else{
                    isError = true;
                }
            }
            else {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                }else{
                    isError = true;
                }
            }

        }
        else {
            System.out.println("Geçerli bir ay giriniz..");
        }

        if(isError == true){
            System.out.println("Geçerli bir gün giriniz..");
        }
        else{
            System.out.println("Burcunuz: "+burc);
        }
    }
}
