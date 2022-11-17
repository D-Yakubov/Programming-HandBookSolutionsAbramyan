/*
English:
Begin10. Two non-zero numbers are given. Find the sum, difference, product and quotient of their squares
Russian:
Begin10. Даны два ненулевых числа. Найти сумму, разность, произведение и частное их квадратов.
Uzbek:
Begin10. Nolga teng bo'Imagan ikkita son berilgan. Ularning yig'indisini, ko’paytmasini va har birining kvadrati aniqiansin.

 */
import java.util.Scanner;
public class Begin10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aNum = in.nextInt();
        int bNum = in.nextInt();
        System.out.println("The sum: "+(aNum+bNum)+", multiplication: "+aNum*bNum+" and Num1^2: "+aNum*aNum+", Num2^2: "+bNum*bNum);
    }
}
