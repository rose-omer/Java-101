import java.util.Scanner;

public class harmonikSayılar {
    /*
     *PROJE KONUSU
     *Java ile girilen sayının harmonik serisini bulan programı yazınız.
     *Harmonik ortalama= n / (1/a + 1/b + 1/c + ...) şeklindedir.
     *Burada a, b, c, ... değerlerin n sayısının kaç olacağını belirtmektedir.
     *Bir sayının tersi matematikte 1/değer olarak ifade edilmektedir.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz : ");
        int n = input.nextInt();
        double toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += (double) 1 / i;
        }
        System.out.println("Toplam : " + toplam);
    }
}