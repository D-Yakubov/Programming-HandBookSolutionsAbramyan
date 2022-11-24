/*
Begin17. Sonlar o'qida А, В, С nuqtalar berilgan.
AC va BC kesmalarning uzunligini va kesmalar uzunligining yig'indisini topuvchi programma tuzilsin.
AC = ?
BC = ?
AC+BC = ?
* */
import java.util.Scanner;
public class Begin17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int aNum = in.nextInt();
        System.out.print("B = ");
        int bNum = in.nextInt();
        System.out.print("C = ");
        int cNum = in.nextInt();
        int ac = (int)Math.abs(aNum-cNum);
        int bc = (int)Math.abs(bNum-cNum);
        System.out.println("AC = "+ac);
        System.out.println("BC = "+bc);
        System.out.println("AC+BC = "+(ac+bc));
    }
}
