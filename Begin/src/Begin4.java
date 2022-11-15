/*
English:
Begin4. Given the diameter of the circle d. Find its length L = π·d. Use 3.14 as the value of π.
Russian:
Begin4. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14.
Uzbek:
Begin4. Aylananing diametri d berilgan. Uning uzunligi aniqiansin L=π*d. π = 3.14
 */
import java.util.Scanner;
public class Begin4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diameter = in.nextInt();
        double PI = 3.14;
        System.out.println("its length L = "+PI*diameter);
    }
}
