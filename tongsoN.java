import java.util.Scanner;

public class tongsoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            n--;
            long x = sc.nextInt();
            System.out.println(x * (x + 1) / 2);
        }

    }
}