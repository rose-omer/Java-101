import java.util.Scanner;

public class basamakSayisi {
    /*Proje Konusu
    Java ile kullanıcı girdiği sayının basamak sayısını bulup ekrana yazdıran programı yazınız.
    Örnek Çıktı
    Bir sayı girin:
    12345
    Basamak sayısı: 5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int sayi = input.nextInt();
        int basamak =0;
        int geciciSayi= sayi;
        while (geciciSayi>0){
            geciciSayi =geciciSayi/10;
            basamak++;
        }
        System.out.println(sayi+"  Sayısının Basamak Sayisi  "+basamak);
    }
}
