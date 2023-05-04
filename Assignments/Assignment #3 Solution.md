- problem #1
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;// 2
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            stars += 2;
        }
    }
}
````

- problem #2
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 7
        int fnumber = 0;// 3
        int snumber = 1;// 5
        for (int i = 1; i <= n; i++) // 7 {
            if (i == 1) System.out.print("0 ");
            else if (i == 2) System.out.print("1 ");
            else {
                int res = fnumber + snumber;// 8
                System.out.print(res + " ");
                fnumber = snumber;
                snumber = res;
            }
        /// Output: 0 1 1 2 3 5 8
    }
}
````


- problem #3
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = 1;
        for (int i = 1; i <= n; i++) {
            int temp = cur;
            for (int j = cur; j <= (temp + 2); j++, cur++) {
                System.out.print(j + " ");
            }
            System.out.println("PUM");
            cur++;
        }
    }
}
````


- problem #4
````java
import java.util.Scanner;

public class Solve {
    public static void solve(int x, int y) {
        int sum = 0;
        while (y > 0) {
            if (x % 2 != 0) {
                sum += x;
                y--;
            }
            x++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();//3
        while (t > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            solve(x, y);
            t--;
        }
    }
}
````



- problem #5
````java
import java.util.Scanner;

public class Solve {
    public static void solve(int x, int y) {
        int sum = 0;
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();//10
            int y = sc.nextInt();// 4
            solve(Math.min(x, y), Math.max(x, y));
            t--;
        }
    }
}
````