/*
Begin18. Sonlar o'qida А, В, С nuqtalar berilgan. С nuqta A va В nuqtalar orasida joylashgan.
        AC va BC kesmalar uzunligining ko'paytmasini toping.
* */
import java.util.Scanner;
public class Begin18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int aNum = in.nextInt();
        System.out.print("B = ");
        int bNum = in.nextInt();
        System.out.print("C = ");
        int cNum = in.nextInt();
        System.out.println("AB*BC = "+(Math.abs(cNum-aNum)*Math.abs(cNum-bNum)));
    }
}
