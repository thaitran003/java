import java.util.Scanner;

public class snt {
    public static boolean snt(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            if (snt(a)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
