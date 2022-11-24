/*
Begin20. Tekislikdagi berilgan ikki nuqta (x1,y1) va (x2,y2) orasidagi masofa topilsin. √(〖(x2-x1)〗^2+〖(y2-y1)〗^2 )
* */
import java.util.Scanner;
public class Begin20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A(x1,y1) = ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("B(x2,y2) = ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("Ikki nuqta orasidagi masofa: L = "+(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))));

    }
}
