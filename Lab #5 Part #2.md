### Practice Some Problems Using Java:
- Problem #1 : Check if entered number is higher than 21 print adult otherwise print child
````java
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 21)
            System.out.println("Adult");
        else
            System.out.println("Child");
    }
}
````
- Problem #2 : Print hello boss if entered text is ahmed otherwise print I don't know you
````java
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.equals("ahmed"))
            System.out.println("Hello Boss");
        else
            System.out.println("I dont know you");
    }
}
````
- Problem #3 : make a calculator using switch
````java
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 ,n2,res=0;
        char sign;
        n1 = sc.nextInt();
        sign = sc.next().charAt(0);
        n2 = sc.nextInt();
        switch (sign)
        {
            case '+':
                res = n1 +n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '/':
                res = n1 / n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            default:
                System.out.println("Please enter a valid sign");
        }
        System.out.println("Result is: " + res);

    }
}
````
- Problem #4 : print from 1 to n using while loop
````java
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            System.out.println(i++);
        }
    }
}
````
- Problem #5 : print from n to 1 using while loop
````java
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        while (i>=1) {
            System.out.println(i--);
        }
    }
}
````
- Problem #6 : print from 1 to n using for loop
````java
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<n+1;i++)
        {
            System.out.println(i);
        }
    }
}
````
- Problem #7 : print from n to 1 using for loop
````java
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i>0;i--)
        {
            System.out.println(i);
        }
    }
}
````
- Problem #8 : take input from user until he enters -1 then print the summation
````java
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        while(n != -1){
            sum += n;
            n = sc.nextInt();
        }
        System.out.println("Sum is: " + sum);
    }
}
````
- Problem #9 : insert elements in an array then print the sum & average
````java
import java.util.*;

public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int sum = 0, av;

        int[] arr = new int[sz];
        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum is: " + sum);
        av = sum / sz;
        System.out.println("Average is: " + av);
    }
}
````
- Problem #10 : Quiz #1 - insert elements in an array then get max/min element 
````java
import java.util.*;

public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int mx, min;

        int[] arr = new int[sz];
        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
        }
        mx = arr[0]; // 4
        min = arr[0];// 1
        // 3 2 4 1
        for (int i = 1; i < sz; i++) {
            if (arr[i] > mx) mx = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("max number is: " + mx);
        System.out.println("min number is: " + min);
    }
}
````
- Problem #11 : Quiz #1 - enter numbers until the user enter -1 then return max element
````java
import java.util.*;

public class Practicing {
    static int GetMaxNum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mx = -99999;
        while (n != -1) {
            //if(n > mx) mx = n;
            mx = n > mx ? n : mx;
            n = sc.nextInt();
        }
        return mx;
    }

    public static void main(String[] args) {
        System.out.println("max number is: " + GetMaxNum());
    }
}
````
- Problem #12 : Quiz #1 - reverse a string
````java
import java.util.*;

public class Practicing {
    static void Reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }

    static String Reverse2(String str) {
        String temp = "";// ahmed
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Reverse(str);
        System.out.println(Reverse2(str));
    }
}
````
- Problem #13 : Quiz #1 - get area of a circle
````java
import java.util.*;

public class Practicing {
    static double GetArea(int r) {
        if (r % 2 == 0) return 3.14 * r * r;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(GetArea(num));
    }
}
````
- Problem #14 : Quiz #1 - get factorial
````java
import java.util.*;

public class Practicing {
    static int Fact(int n) {
        int fact = 1;// 6
        for (int i = 1; i <= n; i++) {
            fact *= i;//
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial is " + Fact(num));
    }
}
````
- Problem #15 : insert elements in an array then print reverse of elements
````java
import java.util.*;

public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int mx, min;

        int[] arr = new int[sz];
        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = sz - 1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
````
- Problem #16 : check if a number is even or odd
````java
import java.util.*;

public class Practicing {
    static boolean IsEven(int n) {
        return n % 2 == 1 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (!IsEven(x)) System.out.println("Even");
        else System.out.println("Odd");
    }
}
````
- Problem #17 : https://codeforces.com/group/ctwVty4ZXZ/contest/267961/problem/G
````java
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
````
- Problem #18 : Search in an array for specific element
````java
import java.util.*;

public class Practicing {
    static int Search(int[] arr, int sz, int target) {
        for (int i = 0; i < sz; i++)// 1 2 3 4
        {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        for (int i = 0; i < sz; i++)// 1 2 3 4
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = Search(arr, sz, target);
        if (res == -1) System.out.println("Number does not exist in the array");
        else System.out.println("exits at index:" + res);
    }
}
````

<hr>
<hr>

- Problem #19 : create class human with properties [name-age-gender] then create two methods one initialize them with any default value
& the other method takes the input from the user, then create 3 methods that prints the value of these attributes
````java
import java.util.*;

class Human {
    String name;
    int age;
    boolean IsMale;

    Human() {
        name = "Ahmed Arafat";
        age = 23;
        IsMale = true;
    }

    Human(String n, int a, boolean is) {
        name = n;
        age = a;
        IsMale = is;
    }

    void PrintName() {
        System.out.println("Your name is " + name);
    }

    void PrintGender() {
        if (IsMale) System.out.println("Your gender is Male");
        else System.out.println("Your gender is Female");
    }

    void PrintAge() {
        System.out.println("Your Age is " + age);
    }
}

public class Practicing {
    public static void main(String[] args) {
        Human ahmed = new Human();
        ahmed.PrintName();

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);// m f
        sc.nextLine();
        String name = sc.nextLine();
        boolean IsMale = gender == 'm';
        Human arafat = new Human(name, age, IsMale);
        arafat.PrintName();
    }
}
````
- Problem #20 : create a facebook class with properties [name-email-password] then create a method that
initialize them with any default value, then create another method that dynamically initialize them using parameters,
then create a method that check if the password is valid or not [must contains numbers & characters & contains @ character, size of password must not be less than 8 characters],
then create a method that prints the number of created objects from that class
````java
import java.util.*;

class Facebook {
    String name;
    String email;
    String password;// ahmed123
    static int NumOfObj = 0;

    Facebook() {
        name = "Ahmed Arafat";
        email = "ahmed@gmail.com";
        password = "123";
        NumOfObj++;
    }

    Facebook(String n , String e,String p) {
        name = n;
        email = e;
        password = p;
        NumOfObj++;
    }
    void ValidatePassword()
    {
        if(password.length() <= 8) {
            System.out.println("Must be greater than 8 characters");
            return;
        }
        int cnt_num = 0, cnt_alpha = 0 , cnt_char = 0;
        for(int i =0;i<password.length();i++)
        {
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9') cnt_num ++;
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') cnt_alpha ++;
            if(password.charAt(i) == '@') cnt_char ++;
        }
        if(cnt_num == 0)
        {
            System.out.println("Must contains at least one number");
            return;
        }
        if(cnt_alpha == 0)
        {
            System.out.println("Must contains at least one alphabetical character");
            return;
        }
        if(cnt_char == 0)
        {
            System.out.println("Must contains at least @ character");
            return;
        }
        System.out.println("Your Password is valid");
    }
    int NumOfObj()
    {
        return NumOfObj;
    }
}

public class Practicing {
    public static void main(String[] args) {
        Facebook ahmed =new Facebook();//1
        //System.out.println(ahmed.name);

        Facebook Arafat = new Facebook("Arafat","Arafat@gmail.com","ahmeddddddddd1@");
        Arafat.ValidatePassword();
        System.out.println("Number of created objects :" + Facebook.NumOfObj);

    }
}
````
- Problem #21 : create a class circle that has PI value & radius , then create two methods (belongs to the class not the object) that calculate perimeter & area of that circle
````java
import java.util.*;

class Circle {
    final static double PI = 3.14;
    static double radius;

    Circle(double r) {
        radius = r;
    }

    static double Area() {
        return PI * radius * radius;
    }

    static double Perimeter() {
        return 2 * PI * radius;
    }
}

public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circle c1 = new Circle(r);
        System.out.println("Area is " + Circle.Area());
        System.out.println("Perimeter is " + Circle.Perimeter());
    }
}
````