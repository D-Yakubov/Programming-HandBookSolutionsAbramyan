import java.util.Scanner;

/*
Begin22. Berilgan A va В sonlarining qiymatlarini almashtiring. A va В ning yangi qiymati ekranga chiqarilsin.
 */
public class Begin22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int aNum = in.nextInt();
        System.out.print("B = ");
        int bNum = in.nextInt();
        aNum = aNum + bNum;
        bNum = aNum - bNum;
        aNum = aNum - bNum;
        System.out.println("A = "+aNum);
        System.out.println("B = "+bNum);
    }
}
