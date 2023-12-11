import java.util.Scanner;

public class faktoriyelHesaplama {
    //PROJE KONUSU
    //Java ile kullanıcını girdiği değerinin faktöriyelini hesaplayan programı yazın.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyel hesabı yapılacak sayı :  ");
        int fak = input.nextInt();
        int toplam = 1;
        for (int i = 1; i <= fak; i++) {
            toplam *= i;
        }
        System.out.println("Sonuç : " + toplam);
    }
}

