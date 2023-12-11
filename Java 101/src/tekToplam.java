import java.util.Scanner;

public class tekToplam {
    /*
     *PROJE KONUSU
     *Java ile kullanıcı negatif bir değer girene kadar kullanıcıdan sayı girişini kabul eden ve girilen sayılardan tek sayıları toplayıp ekrana basan programı yazın.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Neagatif girene kadar sayı girişi yapabilirsiniz ");
        System.out.println("Tek sayılar toplanacak ");
        int[] sayilar = new int[32];
        int toplam = 0;
        int i = 0;
        do {
            System.out.print("Sayı giriniz => ");
            sayilar[i] = input.nextInt();
            i++;
        } while (sayilar[i - 1] >= 0);
        for (int j = 0; j < sayilar.length; j++) {
            if (sayilar[j] % 2 == 1) {
                toplam += sayilar[j];
            }
        }
        System.out.println("Tek Sayıların Toplamı => " + toplam);
    }
}
