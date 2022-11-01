import java.util.Scanner;
public class d {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] a = new int [m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) a[i][j] = -1;
        int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
        int x = 0, y = 0, o = 0;
        for (int i = 0; i < m * n; i++) {
            a[x][y] = sc.nextInt();
            x += dx[o];
            y += dy[o];
            if (x >= m || x < 0 || y >= n || y < 0 || a[x][y] != -1) {
                x -= dx[o];
                y -= dy[o];
                o = (o + 1) % 4;
                x += dx[o];
                y += dy[o];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%d ", a[i][j]);
            System.out.printf("\n");
        }
    }
}