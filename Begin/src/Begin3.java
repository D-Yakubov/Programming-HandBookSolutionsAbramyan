/*
English:
Begin3°. Given sides of a rectangle a and b. Find its area S = a*b and perimeter P = 2*(a + b).
Russian:
Begin3°. Даны стороны прямоугольника a и b. Найти его площадь S = a·b и периметр P = 2·(a + b).
Uzbek:
Begin3. To'g'ri to'rtburchakning tomonlari a va b berilgan. Uning yuzasi S = a * b; va P = 2 * (a + b) perimetri aniqiansin.

 */
import java.util.Scanner;
public class Begin3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aNum = in.nextInt();
        int bNum = in.nextInt();
        System.out.println("The area of rectangle = " +aNum * bNum+" and Perimeter = "+2*(aNum+bNum));
    }
}
