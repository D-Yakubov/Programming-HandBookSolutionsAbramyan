/*
English:
Begin6. Given the lengths of edges a, b, c of a cuboid. Find him volume V = a*b*c and surface area S = 2*(a*b + b*c + a*c).
Russian:
Begin6. Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
Uzbek:
Begin6. Paralelepepidning tomonlari a, b, с berilgan. Uning hajmini V = a*b*c  va to’la sirti S = 2*(a*b+b*c+a*c) aniqlansin.
 */
import java.util.Scanner;
public class Begin6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aNum = in.nextInt();
        int bNum = in.nextInt();
        int cNum = in.nextInt();
        System.out.println("The volume of the cuboid V= "+aNum*bNum*cNum+" and its surface area S = "+2*(aNum*bNum + cNum*(aNum+bNum)));
    }
}
