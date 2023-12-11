import java.util.Scanner;

public class daireAlanıÇevresi {
    /*
    PROJE KONUSU

    Java ile yarı çap değerini kullanıcıdan alınan dairenin alanını ve çevresini hesaplayan programı yazın.
    Daire Alan Formülü : π * r * r
    Daire Çevre Formülü : 2 * π * r
    Bonus Geliştirme
    Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.
    π Sayısını = 3,14 alın.
    Formül : (π  * (r*r) *a) / 360)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çap değerini giriniz ==> ");
        int r = input.nextInt();
        double pi = 3.14;
        double daireAlanı = pi * r * r;
        double daireÇevresi = pi * 2 * r;
        System.out.println("Daire alanı =>" + daireAlanı);
        System.out.println("Daire çevresi =>" + daireÇevresi);
        System.out.println();
        System.out.print("Merkez acı ölcüsü nedir (a)==> ");
        int a = input.nextInt();
        double dilimAlan = (pi * r * r * a) / 360;
        System.out.println(" Daire Dilim Alanı " + dilimAlan);


    }
}
