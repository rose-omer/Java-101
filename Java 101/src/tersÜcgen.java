import java.util.Scanner;

public class tersÜcgen {
/*
    Kullanıcıdan alınan sayı kadar satırda yıldızlardan oluşan ters üçgen oluşturulacaktır.
    Örnek Çıktı
    Kaç satır olsun: 5
    *********
     *******
      *****
       ***
        *

*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Satır Olcak ==> ");
        int sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            int yıldızSayısı= (sayi+1)-i;
            for (int k = 0; k <2*yıldızSayısı-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

