/*
English:
Begin1. Given the side of a square a. Find its perimeter P = 4·a.
Russian:
Begin1. Дана сторона квадрата a. Найти его периметр P = 4·a.
Uzbek:
Begin1. Kvadratning tomoni a berilgan. Uning perimetri aniqlansin. P=4*a
 */
import java.util.Scanner;
public class Begin1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Perimeter = " +4*number);
    }
}
