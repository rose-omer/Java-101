import java.sql.SQLOutput;
import java.util.Scanner;

public class basitHesapMakine {
    /*
        PROJE KONUSU
        Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz => ");
        int sayı1= input.nextInt();
        System.out.print("2. Sayıyı giriniz => ");
        int sayı2= input.nextInt();
        int işlem ;
        System.out.println("hangi işlemi yapmak istiyorsunuz ");
        System.out.println("TOPLAMA (1)");
        System.out.println("CIKARMA (2)");
        System.out.println("ÇARPMA  (3)");
        System.out.println("BÖLME   (4)");
        işlem=input.nextInt();
        double sonuç =0;
        if (işlem ==1){
            sonuç =sayı1+sayı2;
        } else if (işlem==2) {
            sonuç=sayı1-sayı2;
        } else if (işlem ==3) {
            sonuç =sayı1*sayı2;
        } else if (işlem==4) {
            sonuç= (double) sayı1 / sayı2;
        }
        System.out.println("Sonuç ==>" +sonuç);
    }
}
