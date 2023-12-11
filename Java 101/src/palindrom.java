import java.util.Scanner;

public class palindrom {
    /*Proje Konusu
    Java ile kullanıcı girdiği değerin palindrom sayı olup olmadığını bulan programı yazınız.
    Palindromik sayı, sağdan sola okunduğunda da aynı şekilde okunan sayılardır. Yani bir sayının rakamları, ters sırayla yazıldığında aynı sayı oluşuyorsa, o sayı palindromiktir.
    Örneğin, 121, 1221, 12321 gibi sayılar palindromiktir. Ancak, 123, 1234 gibi sayılar palindromik değillerdir.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi  giriniz => ");
        int sayi = input.nextInt();
        int temp =sayi, tersSayi=0, sonSayi;
        while ( temp != 0){
            sonSayi =temp%10;
           // System.out.println(sonSayi);
            tersSayi =tersSayi*10+sonSayi;
           // System.out.println(tersSayi);
            temp/=10;
           // System.out.println(temp);
        }
        if (tersSayi ==sayi ){
            System.out.println(sayi+" Sayısı bir palindrom sayıdır ");
        }else System.out.println(sayi+" Sayısı bir palindrom sayı değildir  ");
    }
}