- problem #1
````java
import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++)//1 2 0 1 1
        {
            if (arr[i] > 0) arr[i] = 1;
            else if (arr[i] < 0) arr[i] = 2;
            System.out.print(arr[i] + " ");
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
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++)//1 2 0 1 1
        {
            if (arr[i] <= 10) System.out.println("A[" + i + "] = " + arr[i]);
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

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
````



- problem #4
````java
import java.util.Arrays;
import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
````



- problem #5
````java
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
````