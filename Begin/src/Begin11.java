/*
Begin11. Nolga teng bo'Imagan ikkita son berilgan.
Ularning yig'indisini, ko’paytmasini va har birining moduli aniqiansin.
 */
import java.util.Scanner;
public class Begin11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aNum = in.nextInt();
        int bNum = in.nextInt();
        System.out.println(aNum+"+"+bNum+"="+(aNum+bNum));
        System.out.println(aNum+"*"+bNum+"="+(aNum*bNum));
        System.out.println(aNum+" ning moduli: "+Math.abs(aNum));
        System.out.println(bNum+" ning moduli: "+Math.abs(bNum));
    }
}
