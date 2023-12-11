import java.util.Scanner;

public class transpoz {
    //Java ile bir matrisin transpozunu bulan programı
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi sutun sayısı : ");
        int sutun = input.nextInt();
        System.out.print("Dizi satır sayısı : ");
        int satır = input.nextInt();
        int[][] martis = new int[satır][sutun];
        int[][] transpoz = new int[sutun][satır];
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println(i+"sutunun "+j+"satırı ");
                martis[i][j] = input.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(martis[i][j]+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satır; j++) {
                transpoz[i][j] = martis[j][i];
            }
        }


        System.out.println("Transpose Matrix:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satır; j++) {
                System.out.print(transpoz[i][j]+" ");
            }
            System.out.println();
        }


    }
}
