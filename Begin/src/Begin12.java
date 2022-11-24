/*
Begin12. To'gri uchburchakning katetlari a va b berilgan.
Uning gipotenuzasi с va perimetri P aniqiansin. C=√(a^2+b^2 ), P=a+b+c
*/
import java.util.Scanner;
public class Begin12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aNum = in.nextInt();
        int bNum = in.nextInt();
        int cNum = (int) Math.sqrt(aNum*aNum+bNum*bNum);
        System.out.println("Gipotenuza: C="+cNum);
        System.out.println("Perimeter: : P="+(aNum+bNum+cNum));
    }
}
