import java.util.Scanner;

public class diziOrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz:");
        int diziboy= input.nextInt();
        int[] dizi =new int[diziboy];
        for (int i = 0; i <diziboy ; i++) {
            System.out.print(i+1+". Sayıyı gir => ");
            dizi[i]=input.nextInt();
        }
        double toplam =0;
        for (int i = 0; i <diziboy ; i++) {
            toplam += dizi[i];
        }
        toplam =toplam/diziboy;

        System.out.println("Dizideki elemanların ortalaması:"+toplam);
    }
}