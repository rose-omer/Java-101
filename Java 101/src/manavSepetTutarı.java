import java.util.Scanner;

public class manavSepetTutarı {
    /*
        PROJE KONUSU

        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        Ürün Kg Fiyatları
        Salatalık : 3,14 TL
        Elma : 4,11 TL
        Kabak : 2,22 TL
        Domates: 0,95 TL
        Patlıcan : 7,00 TL
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kaç kilo salatalık =>");
        int salata = input.nextInt();
        System.out.print("kaç kilo elma =>");
        int elma = input.nextInt();
        System.out.print("kaç kilo kabak =>");
        int kabak = input.nextInt();
        System.out.print("kaç kilo domates =>");
        int domates = input.nextInt();
        System.out.print("kaç kilo patlıcan =>");
        int patlıcan = input.nextInt();
        double toplam =0;
        toplam =salata*3.14 +elma*4.11+kabak*2.22+domates*0.95+patlıcan*7;
        System.out.println(toplam);
    }
}
