import java.util.Scanner;
public class a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mx = Math.max(n, m);
            int[] a = new int[mx + 1];
            int[] b = new int[mx + 1];
            for (int i = n - 1; i >= 0; i--) a[i] = sc.nextInt();
            for (int i = m - 1; i >= 0; i--) b[i] = sc.nextInt();
            for (int i = 0; i < mx; i++) {
                a[i] += b[i];
                if (a[i] >= 10) {
                    a[i + 1]++;
                    a[i] -= 10;
                }
            }
            if (a[mx] != 0) System.out.printf("%d", a[mx]);
            for (int i = mx - 1; i >= 0; i--) System.out.printf("%d", a[i]);
            System.out.printf("\n");
        }
    }
}