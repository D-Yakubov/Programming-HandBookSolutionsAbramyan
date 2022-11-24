/*
Begin16. Sonlar o'qida ikkita nuqta orasidagi masofa aniqiansin. |x1-x2|
* */
import java.util.Scanner;
public class Begin16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("X1 = ");
        int aNum = in.nextInt();
        System.out.print("X2 = ");
        int bNum = in.nextInt();
        System.out.println("|"+aNum+"-"+bNum+"|"+" = "+Math.abs(aNum-bNum));
    }
}
