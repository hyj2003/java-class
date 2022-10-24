import java.util.Scanner;
public class c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int[] a = new int[4], b = new int[4];
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            for (int i = 0; i < 4; i++) b[i] = sc.nextInt();
            int ans = 0;
            while (sum < 100) {
                int mn = -1;
                for (int i = 0; i < 4; i++)
                    if (a[i] != 30) {
                        if (mn == -1 || b[mn] > b[i]) mn = i;
                    }
                a[mn]++;
                sum++;
                ans += b[mn];
            }
            System.out.printf("%d\n", ans);
        }
    }
}