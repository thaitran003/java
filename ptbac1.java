import java.util.Scanner;

public class ptbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        Float b = sc.nextFloat();
        if (a == 0) {
            if (b == 0)
                System.out.println("VSN");
            else
                System.out.println("VN");
        }
        if (a != 0) {
            if (b == 0)
                System.out.println(0);
            else
                System.out.println(String.format("%.2f", -b / a));
        }
    }
}
