import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), a = 0, b = 0, c = 0, d = 0;
        for (int cas = 1; cas <= T; cas++) {
            int Y = sc.nextInt();
            if (Y >= 90) a++;
            else if (Y >= 80) b++;
            else if (Y >= 70) c++;
            else if (Y >= 60) d++;
        }
        System.out.printf("A: %d\nB: %d\nC: %d\nD: %d\n", a, b, c, d);
    }
}