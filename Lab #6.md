## Programming 2 - Lab #6
### By `TA Ahmed Arafat` (Ahmed Mohamed Yousry)

### Topics To Be Discussed:
1. Encapsulation
   1. Access Modifiers for attributes (`public`/`private`/`protected`/`default`)
   2. Access Modifiers for classes (`public`/`default`)
   2. Package & SubPackage
   3. Getter & Setter 
   4. Types Of Packages (Built-in/User-defined)
2. `this` Operator
3. Solving 3 `OOP` Programs

<hr>
<hr>
<hr>

1. `Encapsulation`: mean that all important information is contained inside an object. (`Data security`)
- Practicing Time :
````java
import java.util.Scanner;
import SocialMedia.*;

public class Account {
        // getter & setter methods
    //null // false // 0
    private String username;// ahmed
    public String Password;
    private double Balance;// -1
    Account(String u)
    {
        Balance = 0;
        username = u;
    }

    public double getBalance()
    {
       // return this.Balance - (this.Balance * 0.1);// 100 - 10 = 90
        return this.Balance ;
    }

    public String getUsername()
    {
        return username + "@facebook.com";///1234
    }
    public void setBalance(int b)
    {
            if(b < 0)
            {
                System.out.println("Please Enter a balance greater than or equal to zero");
                return;
            }
            this.Balance = b;
    }
}


class Lab6 {
    public static void main(String[] args) {
        Account obj = new Account("ahmed");
            //  username -> ahmed @facebook.com
       System.out.println(obj.getBalance());
       System.out.println(obj.getUsername());
            obj.setBalance(100);
        System.out.println(obj.getBalance());

    }
}
````


### `Problem #1` : 
Create a class called `BankSystem.BankAcc` in a package called `BankSystem`, 
with properties [name-age-email-password-balance], where each of
[name-age] are accessible everywhere while [email] is only accessible inside that package,
while [password-balance] are accessible only inside that class,
then create an initialization method that is called automatically when an object is created from that class that
initialize both [name-age-balance] with any value from the user (take an input from him)
and then in this initialization method call a setter method that set the value of [email] attribute,
this method checks if the email contains `@` & `.` characters
then if the email does not contain one of them it still takes input from the user till the email contains both of them
,then create another setter method that set the [password] attribute,
- this method takes the password form the user and then store it encrypted (using `Caesar` cipher)
then create two getter methods that just print value of email and encrypted password
finally create a LogIn(email,password) method that takes an email & password from the user then check if they are matched with values in that object or not
if yes then print text "welcome back" + Name of that user
finally print the number of created Accounts from that class

- `BackAcc.java` file
````java
package BankSystem;

import java.util.Scanner;

public class BankAcc {
    static int NumOfAcc = 0;
    // attributes of our class BankAcc
    public String name;
    String email; // ahmed@gmail.com
    private String password;// cb
    public int age;
    private double balance;

    // Parametrized Constructor for class BankAcc
    public BankAcc(String name, int age, double balance, String Password) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        setPassword(Password);
        setEmail();
        NumOfAcc++;
    }

    private boolean IsEmailValid(String em) {
        int cnt_at = 0, cnt_dot = 0;//ahmed@gmail.com
        for (int i = 0; i < em.length(); i++) {
            if (em.charAt(i) == '@') cnt_at++;
            if (em.charAt(i) == '.') cnt_dot++;
        }
        if (cnt_at == 1 && cnt_dot == 1) return true;
        return false;
    }

    public void setEmail()// @ .
    {
        System.out.println("please enter a valid email");
        Scanner sc = new Scanner(System.in);
        String temp_email = sc.next();
        while (!IsEmailValid(temp_email)) {
            System.out.println("This Email is not valid, Please enter another email");
            temp_email = sc.next();
        }
        this.email = temp_email;
    }

    private String Encryption(String PlainText)//ahmed
    {
        String CipherText = "";
        // aaa ->> ddd   fff -> iii
        // hi -> kl -> hi
        // plaintext : zy123 -> ciphertext -> cb123
        // ahmed ASCII Table   104 > 97
        // a -> z
        // "ahmed123"        '1' -> 49
        // ahmed     'a' - 'a' = 0 + 3 = 3
        // 'a' + 3 = 97 + 3 = 100
        for (int i = 0; i < PlainText.length(); i++) {
            if (PlainText.charAt(i) >= 'a' && PlainText.charAt(i) <= 'z')//ahmed
            {
                int CurCharInNumberAfterShifting = ((PlainText.charAt(i) - 'a') + 3) % 26;//28 % 26
                int cipher = 'a' + CurCharInNumberAfterShifting;//97 + 28 = 125
                CipherText += (char) cipher;//Casting
            } else CipherText += PlainText.charAt(i);
        }
        return CipherText;
    }

    public void setPassword(String Password) {
        String CipherText = this.Encryption(Password);
        this.password = CipherText;/// ghtf15
    }

    public void LogIn(String em, String Pass)//login("ahmed@gmail.com","zy")
    {
        String EncryptedText = this.Encryption(Pass);
        if (this.email.equals(em) && this.password.equals(EncryptedText)) {
            System.out.println("Welcome Back," + this.name);
        } else {
            System.out.println("Not Authorized, Please Try Again");
        }
    }

    public int getNumOfAcc()
    {
        return NumOfAcc;
    }
}
````
- `Main.java` file
````java
import BankSystem.BankAcc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inputs from the user
        String name = sc.next();
        int age = sc.nextInt();
        double balance = sc.nextDouble();
        String Password = sc.next();

        BankAcc Ahmed = new BankAcc(name, age, balance, Password);
        Ahmed.LogIn("ahmed@gmail.com", "ahmed123");// Authorized
        Ahmed.LogIn("ahmed@gmail.com", "ahmed12");// Not Authorized
        System.out.println("Num Of Created Accounts : " + Ahmed.getNumOfAcc());
    }
}
/*
arafat
23
1000
ahmed123

ahmed@gmail.com
 */
````


### `Problem #2` : 
create a class called `Calculator` that has three attributes [num1-num2-sign] where 
they are all inaccessible outside that class, then create a constructor that initialize them
then create 4 methods each calculate the `sum()`/`min()`/`div()`/`multi()`, they are all private.
Then create another method called `Calc()` which contains a switch statement that check value of [sign] 
then returns the value, then create another method that prints the value along the text

### `Problem #3` (Enhanced `Problem #2`) :
create a class called `Calculator` that has three attributes [num1-num2-sign] where
they are all inaccessible outside that class, then create a constructor that initialize them
then create 4 methods each calculate the `sum()`/`min()`/`div()`/`multi()`, they are all private.
Then create another method called `Calc()` which contains a switch statement that check value of [sign]
then returns the value, then create another method that prints the value along the text
