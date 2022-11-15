/*
English:
Begin5. Given the length of a cube edge a. Find the volume of the cube V = a^3 and its surface area S = 6*a^2
Russian:
Begin5. Дана длина ребра куба a. Найти объем куба V = a^3 и площадь его поверхности S = 6·a^2
Uzbek:
Begin5. Kubning yon tomoni a berilgan. Uning hajmini V = a^3  va to`la sirti S=6*a2 aniqiansin.
 */
import java.util.Scanner;
public class Begin5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aNum = in.nextInt();
        System.out.println("The volume of the cube V= "+aNum*aNum*aNum+" and its surface area S = "+6*aNum*aNum);
    }
}
