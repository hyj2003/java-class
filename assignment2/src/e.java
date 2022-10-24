import java.util.Scanner;
public class e {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String a = sc.next();
            char[] c = a.toCharArray();
            System.out.printf("%c%c", c[6], c[7]);
            System.out.printf("%c%c", c[4], c[5]);
            System.out.printf("%c%c", c[2], c[3]);
            System.out.printf("%c%c", c[0], c[1]);
            if (i != n) System.out.printf(" ");
        }
    }
}