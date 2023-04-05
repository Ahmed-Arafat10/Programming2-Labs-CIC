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
