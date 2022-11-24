/*
Begin21. Uchburchakning uchta tomoni uchlari koordinatlari berilgan (x1,y1), (x2,y2), (x3,y3)
ikki nuqta orasidagi masofani topish Begin20 da berilgan.
Uchburchakning yuzasini va perimatrini toping. S=√(p(p-a)(p-b)(p-c)) p=(a+b+c)/2
* */
import java.util.Scanner;
public class Begin21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A(x1,y1) = ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("B(x2,y2) = ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.print("C(x3,y3) = ");
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        int ab = (int)(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
        int bc = (int)(Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)));
        int ca = (int)(Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)));
        int p = (ab+bc+ca)/2;
        System.out.println("Perimeter = "+p);
        System.out.println("S = "+Math.sqrt(p*(p-ab)*(p-bc)*(p-ca)));

    }
}
