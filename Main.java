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