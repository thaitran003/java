import java.util.Scanner;

public class pttsnt {
    public static void ptts(int n) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.printf("Test %d: ", n);
        for (int i = 2; i < Math.sqrt(x); i++) {
            int cnt = 0;
            while (x % i == 0) {
                cnt++;
                x = x / i;
            }
            if (cnt != 0) {
                System.out.printf("%d(%d) ", i, cnt);
            }
        }
        if (x != 1) {
            System.out.printf("%d(%d) ", x, 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            ptts(i);
        }
    }
}
