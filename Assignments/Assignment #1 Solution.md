- problem #1
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Hello, " + str);
    }
}
````

- problem #2
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x == 0 && y == 0) System.out.print("Origem");
        else if (y == 0) System.out.print("Eixo X");
        else if (x == 0) System.out.print("Eixo Y");
        else if (x > 0 && y > 0) System.out.print("Q1");
        else if (y > 0 && x < 0) System.out.print("Q2");
        else if (x < 0 && y < 0) System.out.print("Q3");
        else if (y < 0 && x > 0) System.out.print("Q4");
    }
}
````

- problem #3
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        long input2 = sc.nextLong();
        char input3 = sc.next().charAt(0);
        float input4 = sc.nextFloat();
        double input5 = sc.nextDouble();

        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4);
        System.out.println(input5);
    }
}
````

- problem #4 method 1
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A + B + C;// 2
        int b1 = Math.max(A, Math.max(B, C));//3
        int b3 = Math.min(A, Math.min(B, C));//-2
        int b2 = sum - b1 - b3;// 2 - 3 - (-2)

        System.out.println(b3);
        System.out.println(b2);
        System.out.println(b1);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
````
- problem #4 method 2
````java
import java.util.Arrays;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[3];// 3 -2 1
        int[] arr2 = new int[3];// 3 -2 1

        for (int i = 0; i < 3; i++)// 0 1 2
        {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        Arrays.sort(arr1);
        for (int i = 0; i < 3; i++)// 0 1 2
        {
            System.out.println(arr1[i]);// Sorted Array
        }
        System.out.println();
        for (int i = 0; i < 3; i++)// 0 1 2
        {
            System.out.println(arr2[i]);
        }

    }
}
````


- problem #5
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        // long long
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " - " + y + " = " + (x - y));

    }
}
````




- problem #6
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 9) {
            x /= 10;
        }
        if(x%2==0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
}
````


- problem #7
````java
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();
        Long D = sc.nextLong();
        System.out.println("Difference = " + ((A * B) - (C * D)));
    }
}
````