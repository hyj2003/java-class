import java.util.Scanner;
public class d {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] a = new char [5];
        int [] b = new int [5];
        int [] c = new int [14];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.next().charAt(0);
            b[i] = sc.nextInt();
            if (b[i] < 1 || b[i] > 13) {
                System.out.println("?");
                return ;
            }
            c[b[i]]++;
        }
        boolean flg = true;
        for (int i = 1; i < 5; i++)
            if (a[0] != a[i]) flg = false;
        if (flg) {
            for (int i = 1; i <= 9; i++)
                if (c[i] == 1 && c[i + 1] == 1 && c[i + 2] == 1 && c[i + 3] == 1 && c[i + 4] == 1) {
                    System.out.println("Straight Flush");
                    return ;
                }
            System.out.println("Flush");
        } else {
            for (int i = 1; i <= 9; i++)
                if (c[i] == 1 && c[i + 1] == 1 && c[i + 2] == 1 && c[i + 3] == 1 && c[i + 4] == 1) {
                    System.out.println("Straight");
                    return ;
                }
            int mx = 0;
            for (int i = 1; i <= 13; i++)
                mx = Math.max(mx, c[i]);
            if (mx >= 3) System.out.println("Three of a Kind");
            else if (mx == 2) System.out.println("Pair");
            else System.out.println("High Card");
        }
    }
}