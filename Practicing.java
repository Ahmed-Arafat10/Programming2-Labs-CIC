import java.util.*;

public class Practicing {

    static void Solve(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solve(n);
    }
}