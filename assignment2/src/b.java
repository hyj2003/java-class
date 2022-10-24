import java.util.Scanner;
public class b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1], b = new int [n];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            a[x]++;
        }
        for (int i = 1; i <= n; i++)
            if (a[i] == 0) b[cnt++] = i;
        if (cnt == 0) System.out.println("NULL");
        else {
            for (int i = 0; i < cnt; i++)
                System.out.printf("%d%c", b[i], i == cnt - 1 ? '\n' : ' ');
        }
    }
}