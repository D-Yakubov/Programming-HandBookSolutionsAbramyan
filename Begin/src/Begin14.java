/*
Begin14. Aylananing uzunligi L berilgan. Uning radiusi R va yuzasi S aniqiansin L = 2* π *R S = π R2 π = 3.14
* */
import java.util.Scanner;
public class Begin14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Aylana uzunligi L = ");
        int aNum = in.nextInt();
        double PI = 3.14;
        int  R = (int) (aNum/2*PI);
        System.out.println("R = "+R);
        System.out.println("S = "+PI*R*R);
    }
}
