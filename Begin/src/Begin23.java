import java.util.Scanner;

/*
Begin23. A, В va С sonlari berilgan. A ni qiymati В gа, В ni qiymati С ga va С ni qiymati A ga almashtirilsin.
A, В va С ning yangi qiymatilari ekranga chiqarilsin.
 */
public class Begin23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int aNum = in.nextInt();
        System.out.print("B = ");
        int bNum = in.nextInt();
        System.out.print("C = ");
        int cNum = in.nextInt();
        int counterNum1 = 0, counterNum2 = 0;
        counterNum1 = bNum;
        counterNum2 = aNum;
        aNum = cNum;
        bNum = counterNum2;
        cNum = counterNum1;
        System.out.println("A => C:"+aNum);
        System.out.println("B => A: "+bNum);
        System.out.println("C => B: "+cNum);
    }
}
