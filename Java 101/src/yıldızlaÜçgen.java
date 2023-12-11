import java.util.Scanner;

public class yıldızlaÜçgen {
    /*
        Proje Konusu
        Java ile kullanıcı girdiği değer kadar yıldızlar ile eşkenar üçgen oluşturan programı yazın
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("* kaç katman olsun : ");
        int n = input.nextInt();
        int i,j,k;//Değişekenlerimizi tanımladık.
        for (i=1; i<=n; i++) {//Döngümüzün ne kadar döneceğini belirtir.
            for (j = i; j <= n; j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (k = 1; k <= i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }}}