/*
Begin15. Aylananing yuzasi S berilgan. Uning diametri d va radiusi R aniqiansin L = 2* π *R S = π R2 π = 3.14 and d=2R
* */
import java.util.Scanner;
public class Begin15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Aylana yuzasi S = ");
        int aNum = in.nextInt();
        double PI = 3.14;
        int  R = (int) Math.sqrt(aNum/PI);
        System.out.println("Perimeter = "+2*R);
        System.out.println("Radius = "+R);
    }
}
