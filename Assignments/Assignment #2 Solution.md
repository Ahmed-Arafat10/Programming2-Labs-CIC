-problem #1
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
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
        int n = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
````

- problem #3
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        int k = 1;// 4
        /*
             *
             **
             ***
             ****
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
            k++;
        }
    }
}
````

- problem #4
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        int k = n;// 4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
            k--;
        }
    }
}
````

- problem #5
````java
import java.util.Scanner;

public class Solve {
    public static String IsPrime(int x) {
        int cnt = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) cnt++;
        }
        if (cnt == 2) return "Prime";
        else return "Not";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(IsPrime(n));
            t--;
        }
    }
}
````