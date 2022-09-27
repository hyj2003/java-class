import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int cas = 1; cas <= T; cas++) {
            int x = sc.nextInt();
            if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12)
                System.out.println("yes");
            else System.out.println("no");
        }
    }
}