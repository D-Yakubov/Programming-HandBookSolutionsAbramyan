/*
English:
Begin 7°. Find the circumference L and the area of a circle S of a given radius R: L = 2 π R, S = π R2
Russian:
Begin 7°. Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2
Uzbek:
Begin7. Doiraning radiusi R berilgan. Uning uzunligi L va yuzasi S aniqiansin. L = 2 π R . S = π *R^2
 */
import java.util.Scanner;
public class Begin7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ra = in.nextInt();
        double PI = 3.14;
        System.out.println("The lengh of circumference L = "+2*PI*ra+" and its surface area S = "+PI*ra*ra);
    }
}
