import java.util.Arrays;
import java.util.Scanner;

public class Solve {

    public static void solve(int[] arr, int n) {
        int res = 99999999;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i] + arr[j] + (j + 1) - (i + 1);
                res = Math.min(temp, res);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            solve(arr, n);
            t--;
        }
    }
}