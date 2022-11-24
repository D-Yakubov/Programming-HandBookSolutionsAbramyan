/*
Begin19. To'g'ri to'rtburchakning qarama-qarshi uchlari koordinatlari berilgan.
Uning tomonlari koordinata o'qiga parallel. To'g'ri to'rtburchakning perimetri va yuzasi aniqiansin.
* */
import java.util.Scanner;
public class Begin19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A(x1,y1) = ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("B(x2,y2) = ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int A = (x2-x1);
        int B = (y2-y1);
        System.out.println("P = "+(2*(A+B))+" S = "+A*B);

    }
}
