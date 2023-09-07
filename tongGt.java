import java.util.Scanner;

public class tongGt {
    static long[] tgt = new long[21];

    public static int gt(int n) {
        if (n == 1) {
            return 1;
        } else {
            return gt(n - 1) * n;
        }
    }

    public static void test() {
        tgt[1] = gt(1);
        for (int i = 2; i <= 20; i++) {
            tgt[i] = tgt[i - 1] + gt(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        test();
        System.out.print(tgt[n]);
    }
}
