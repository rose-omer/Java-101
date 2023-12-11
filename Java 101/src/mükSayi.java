import java.util.Scanner;

public class mükSayi {
    /*
        Proje Konusu
        Java dilinde mükemmel sayıyı bulan bir program örneği verilmiştir.
        Kullanıcı tarafından girilen sayının mükemmel sayı olup olmadığı kontrol edilecektir.
        Bir sayının mükemmel sayı olması için, kendisi hariç pozitif tam bölenlerinin toplamının kendisine eşit olması gerekmektedir.
        Örnek Çıktı
        Bir sayı giriniz: 28
        28 mükemmel bir sayıdır.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi = input.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.println(sayi + "  Sayısı mükemmel sayıdır. ");
        } else System.out.println(sayi + "   Sayısı mükemmel sayı değildir. ");
    }
}
