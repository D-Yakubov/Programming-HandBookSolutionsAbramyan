/*
English:
Begin 9. Two non-negative numbers a and b are given. Find their geometric mean, i.e. the square root of their product: √a⋅b
Russian:
Begin9. Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: √a ⋅b .
Uzbek:
Begin9. Ikkita manfiy bo'Imagan son a va b berilgan. Ularning o'rta geometrigi aniqlansin. √(a*b)

 */
import java.util.Scanner;
public class Begin9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aNum = in.nextInt();
        int bNum = in.nextInt();
        System.out.println("Their geometric mean is "+Math.sqrt(aNum*bNum));
    }
}
