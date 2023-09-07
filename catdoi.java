import java.util.Scanner;

public class catdoi {
    public static void cat(String x) {
        boolean a = true;
        StringBuilder sb = new StringBuilder(x);
        for (int i = 0; i < x.length(); i++) {
            if (sb.charAt(i) == '0' || sb.charAt(i) == '9' || sb.charAt(i) == '8') {
                sb.setCharAt(i, '0');
            } else if (sb.charAt(i) == '1')
                sb.setCharAt(i, '1');
            else {
                a = false;
            }
        }
        x = sb.toString();
        if (a) {
            long ans = Long.parseLong(x);
            if (ans == 0) {
                System.out.println("INVALID");
            } else
                System.out.println(ans);
        } else {
            System.out.println("INVALID");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String cd = sc.next();
            cat(cd);

        }
    }
}
