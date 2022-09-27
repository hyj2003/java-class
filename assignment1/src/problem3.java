import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int cas = 1; cas <= T; cas++) {
            int Y = sc.nextInt();
            if ((Y % 100 != 0 && Y % 4 == 0) || (Y % 400 == 0)) {
                System.out.println("Yes");
                int ans = 0;
                for (int i = Y + 1; i <= 1999; i++) {
                    if ((i % 100 != 0 && i % 4 == 0) || (i % 400 == 0)) ans += 366;
                    else ans += 365;
                }
                ans += 1 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                System.out.printf("%d\n", ans);
            } else System.out.println("No");
        }
    }
}