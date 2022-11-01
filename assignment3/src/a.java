import java.util.Scanner;
class Matrix {
    int n, m;
    int[][] a;
    Matrix (int n, int m) {
        this.n = n;
        this.m = m;
        a = new int [n][m];
    }
    Matrix trans() {
        Matrix res = new Matrix(m, n);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) res.a[j][i] = a[i][j];
        return res;
    }
    Matrix neg() {
        Matrix res = new Matrix(n, m);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) res.a[i][j] = -a[i][j];
        return res;
    }
}
public class a {
    static Matrix add(Matrix a, Matrix b) {
        Matrix c = new Matrix(a.n, b.m);
        for (int i = 0; i < a.n; i++)
            for (int j = 0; j < a.m; j++) c.a[i][j] = a.a[i][j] + b.a[i][j];
        return c;
    }
    static Matrix mul(Matrix a, Matrix b) {
        Matrix c = new Matrix(a.n, b.m);
        for (int i = 0; i < a.n; i++)
            for (int j = 0; j < b.m; j++)
                for (int k = 0; k < a.m; k++)
                   c.a[i][j] += a.a[i][k] * b.a[k][j];
        return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
        Matrix[][] A = new Matrix [2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                A[i][j] = new Matrix(n / 2, n / 2);
                for (int k = 0; k < n / 2; k++)
                    for (int l = 0; l < n / 2; l++)
                        A[i][j].a[k][l] = a[k + i * n / 2][l + j * n / 2];
            }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
        Matrix[][] B = new Matrix [2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                B[i][j] = new Matrix(n / 2, n / 2);
                for (int k = 0; k < n / 2; k++)
                    for (int l = 0; l < n / 2; l++)
                        B[i][j].a[k][l] = a[k + i * n / 2][l + j * n / 2];
            }
        Matrix[][] C = new Matrix [2][2];
        C[0][0] = add(A[0][0], B[0][0]);
        C[0][1] = mul(A[0][1], B[0][1].trans());
        C[1][0] = mul(B[1][0], A[1][0].trans());
        C[1][1] = add(A[1][1], B[1][1].neg());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = i / (n / 2), y = j / (n / 2);
                System.out.printf("%d ", C[x][y].a[i - x * n / 2][j - y * n / 2]);
            }
            System.out.printf("\n");
        }
    }
}