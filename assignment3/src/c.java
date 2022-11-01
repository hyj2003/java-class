import java.util.Scanner;
public class c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), shift = 105;
        int[][] a = new int [210][210];
        int[][][] b = new int [210][210][4];
        for (int i = 0; i < n; i++) {
            int op = sc.nextInt(), x = sc.nextInt() + shift, y = sc.nextInt() + shift;
            if (op == 2) {
                for (int j = 0; j < 2; j++)
                    for (int k = 0; k < 2; k++)
                        a[x + j][y + k] = 1;
            }
            if (op == 1) {
                b[x][y][1] = 1;
                b[x][y + 1][2] = 1;
                b[x + 1][y][0] = 1;
                b[x + 1][y + 1][3] = 1;
            }
        }
        double ans = 0;
        for (int i = 0; i < 210; i++) {
            for (int j = 0; j < 210; j++) {
                if (a[i][j] == 1) ans += 1.0;
                else {
                    int op = b[i][j][0] + b[i][j][1] + b[i][j][2] + b[i][j][3];
                    if (op >= 1) {
                        if (op == 1) ans += Math.PI / 4;
                        else if (op == 2) {
                            if (b[i][j][0] + b[i][j][2] == 2 || b[i][j][1] + b[i][j][3] == 2) ans += 1.0;
                            else ans += Math.sqrt(3.0) / 4 + Math.PI / 6;
                        } else ans += 1.0;
                    }
                }
            }
        }
        System.out.printf("%.5f\n", ans);
    }
}