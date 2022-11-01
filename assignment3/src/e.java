import java.util.Scanner;
public class e {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int n;
    static int[][] a = new int [105][105];
    static boolean check(int x, int y) {
        for (int i = 0; i < 8; i++) {
            boolean flg = true;
            for (int j = 0; j < 5 && flg; j++) {
                int nx = x + dx[i] * j, ny = y + dy[i] * j;
                if (nx < 1 || nx > n || ny < 1 || ny > n || a[nx][ny] == 0) flg = false;
            }
            if (flg) return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++) a[i][j] = sc.nextInt();
        boolean flg = true;
        for (int x = 1; x <= n; x++)
            for (int y = 1; y <= n; y++) {
                if (a[x][y] != 0) continue;
                a[x][y] = 1;
                int Lx = Math.max(1, x - 4), Rx = Math.min(n, x + 4);
                int Ly = Math.max(1, y - 4), Ry = Math.min(n, y + 4);
                boolean f = false;
                for (int i = Lx; i <= Rx && !f; i++)
                    for (int j = Ly; j <= Ry && !f; j++)
                        if (check(i, j)) f = true;
                if (f) {
                    System.out.println(x + " " + y);
                    flg = false;
                }
                a[x][y] = 0;
            }
        if (flg) System.out.println("-1");
    }
}