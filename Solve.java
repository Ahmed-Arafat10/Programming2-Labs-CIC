class BackAcc {
    public int AccNum;
    public double balance;

    public BackAcc(int accNum, double balance) {
        AccNum = accNum;
        this.balance = balance;
    }
    public void BackAccData() {
        System.out.println("Ny acc number is:" + AccNum + ", my balance is :" + balance);
    }
}

class Human {
    public String Name;
    public int Age;
    public BackAcc myAcc;
    public Human(String name, int age, int acc, double balance) {
        Name = name;
        Age = age;
        myAcc = new BackAcc(acc, balance);
    }

    public void HumanData() {
        System.out.println("Ny name is:" + Name + ", my Age is :" + Age);
    }
}

public class Solve {

    public static void main(String[] args) {

        // Create an array of objects of class BankAcc
        BackAcc[] ClientAccounts = new BackAcc[3];
        ClientAccounts[0] = new BackAcc(111,1000);
        ClientAccounts[1] = new BackAcc(222,2000);
        ClientAccounts[2] = new BackAcc(333,3000);

        System.out.println(ClientAccounts[0].balance); // 1000
        System.out.println(ClientAccounts[1].balance); // 2000
        System.out.println(ClientAccounts[0].AccNum); // 111
        System.out.println(ClientAccounts[1].AccNum); // 222
        ClientAccounts[1].BackAccData();

        Human[] Persons = new Human[3];
        Persons[0] = new Human("Ahmed", 23, 999, 99999);
        Persons[1] = new Human("Mohamed", 46, 888, 99999);
        Persons[2] = new Human("Yousry", 70, 777, 99999);

        System.out.println(Persons[0].myAcc.AccNum);// 999
        System.out.println(Persons[1].myAcc.AccNum);// 888
        System.out.println(Persons[2].myAcc.AccNum);// 777

        Persons[2].HumanData();
        Persons[2].myAcc.BackAccData();
    }
}



