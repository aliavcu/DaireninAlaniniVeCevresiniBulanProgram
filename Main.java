import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r, alfa;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();
        
        System.out.print("Merkez açısını giriniz :");
        alfa = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double diliminAlani = (alan * alfa) / 360;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Daire Diliminin Alanı :  " + diliminAlani );



    }
}
