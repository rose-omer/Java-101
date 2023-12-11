import java.util.Scanner;

public class ciftSayı {
    /*
        Java ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazın.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz => ");
        int sayi = input.nextInt();
        int toplam = 0;
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println("Çift Sayıların Toplamı => " + toplam);
    }
}