/*
English:
Begin8. Two numbers a and b are given. Find their arithmetic mean: (a + b)/2.
Russian:
Begin8. Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.
Uzbek:
Begin8. Ikkita son a va b berilgan. Ularning o’rta arifmetigi aniqiansin. (a+b)/2

 */
import java.util.Scanner;
public class Begin8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aNum = in.nextInt();
        int bNum = in.nextInt();
        System.out.println("Their arithmetic mean is "+(aNum+bNum)/2);
    }
}
