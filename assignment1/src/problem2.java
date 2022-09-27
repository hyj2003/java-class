import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int cas = 1; cas <= T; cas++) {
            float x1 = sc.nextFloat(), y1 = sc.nextFloat();
            float x2 = sc.nextFloat(), y2 = sc.nextFloat();
            float x = sc.nextFloat();
            float k = (y2 - y1) / (x2 - x1);
            System.out.printf("%.1f\n", k * x + y1 - k * x1);
        }
    }
}