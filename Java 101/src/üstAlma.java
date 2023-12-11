import java.util.Scanner;

public class üstAlma {
    //PROJE KONUSU
    //Java ile kullanıcının girdiği değerler ile üs alan programı yazın.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üs Alınacak Sayı : ");
        int sayi = input.nextInt();
        System.out.println("Üs Olacak Sayı : ");
        int üst = input.nextInt();
        int sonuc = (int) Math.pow(sayi, üst);
        System.out.println("Sonuç : " + sonuc);
    }
}
