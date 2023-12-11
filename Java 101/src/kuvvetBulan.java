import java.util.Scanner;

public class kuvvetBulan {
    /*
    *PRJE KONUSU
    *Java ile girilen sayıya kadar olan, n değerininde kullacıdan alındığı n sayısının kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz => ");
        int n = input.nextInt();
        System.out.print("Sınır değeri giriniz =>");
        int sinir = input.nextInt();
        int i =0;

        while (true){
            int değer = (int) Math.pow(n,i);
            if (değer <sinir){
                i++;
                System.out.println(değer);
            }else break;
        }

    }
}