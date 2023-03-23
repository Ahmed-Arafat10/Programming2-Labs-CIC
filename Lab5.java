class lab5 {
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(float amt) {
        amount += amt;
        System.out.println(amt + " deposited");
    }

    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
    }

    void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    void display() {
        System.out.println(acc_no + " " + name + " "+ amount);
    }
}

class TestAccount{
    public static void main(String[] args) {
        String str ="ahmed123";
        int cnt_char = 0 , cnt_num = 0 , cnt_at = 0;
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') cnt_num++;
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') cnt_char++;
            if(str.charAt(i) == '@') cnt_at++;
        }
        if(cnt_num == 0)
        {
            System.out.println("the password must contains numbers");
            return;
        }
        if(cnt_char == 0)
        {
            System.out.println("the password must contains characters");
            return;
        }
        if(cnt_at == 0)
        {
            System.out.println("the password must contains @ character");
            return;
        }
        System.out.println("This Password is valid");
    }
}