import java.util.Scanner;

public class soFibonacy {
    public static long sofibo(int n) {
        long[] f = {};
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < 93; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(sofibo(n));
        }

    }
}