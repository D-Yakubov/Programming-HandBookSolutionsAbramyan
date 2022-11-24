/*
Begin13. Umumiy markazga ega bo'lgan ikkita aylana radiusi berilgan.
R1,R2 (R1>R2).Ularnig yuzalari S1 va S2, ularning ayirmasi S3 aniqiansin. Sl = π R1,  S2= π R2,  S3 = π (R1-R1).
*/
import java.util.Scanner;
public class Begin13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Aylana radiusi R1 =");
        int aNum = in.nextInt();
        System.out.print("Aylana radiusi R2 =");
        int bNum = in.nextInt();
        double PI = 3.14;
        System.out.println("S1 = "+PI*aNum);
        System.out.println("S2 = "+PI*bNum);
        System.out.println("S3 = "+PI*Math.abs(aNum-bNum));
    }
}
