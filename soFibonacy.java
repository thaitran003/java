import java.util.Scanner;

public class soFibonacy {
    public static long[] f = new long[100];

    public static void sofibo() {
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < 93; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sofibo();
            long n = sc.nextLong();
            for (int i = 0; i < 93; i++) {
                if (f[i] == n) {
                    System.out.println("YES");
                    break;
                } else if (f[i] > n) {
                    System.out.println("NO");
                    break;
                }
            }

        }

    }
}
