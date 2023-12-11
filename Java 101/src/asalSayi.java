import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi gir : ");
        int sayi= input.nextInt();
        boolean asalMi= true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi %i==0){
                asalMi =false;
            }
        }
        if (asalMi){
            System.out.println(sayi+" : Sayısı Asal Sayidir.");
        }else System.out.println(sayi+" : Sayısı Asal Sayi Değildir.");
    }
}