public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            int frekans = 0; // Her elemanın başlangıç frekansı 0'dır

            if (eleman == -99999999) {
                continue; // Bu eleman daha önce işlendi, atlamak için
            }

            for (int j = i; j < dizi.length; j++) {
                if (eleman == dizi[j]) {
                    frekans++;
                    dizi[j] = -99999999; // Elemanı işlendi olarak işaretle
                }
            }

            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}
