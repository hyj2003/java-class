import java.util.Scanner;
public class b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int [n + 2][n + 2];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                a[i][j] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++) {
                ans += a[i][j] ^ a[i][j + 1];
                ans += a[i][j] ^ a[i + 1][j];
            }
        System.out.println(ans);
    }
}