
class Human {
    public String name;
    protected String email;

    public Human(String name, String email) {
        this.name = name;
        this.email = email;
    }

    private void Sleeping() {
        System.out.println("Iam sleeping now");
    }

}

class Employee extends Human {
    public String email;
    protected String Department;
    protected float Salary;

    public Employee(String name, String personal_email, String work_email, String Dep, float Sal) {
        super(name, personal_email);
        email = work_email;
        Department = Dep;
        Salary = Sal;
    }

    public void PrintPersonalEmail() {
        System.out.println("My Personal Email is : " + super.email);
    }

    public void PrintFormalEmail() {
        System.out.println("My Formal Email is : " + this.email);
    }

}

final class Manager extends Employee {
    public String ManagingTeam;

    public Manager(String name,
                   String personal_email,
                   String work_email,
                   String Dep,
                   float Sal) {
        super(name, personal_email, work_email, Dep, Sal);
    }

    public String getMangingTeam() {
        return ManagingTeam;
    }

    public void setMangingTeam(String mangingTeam) {
        ManagingTeam = mangingTeam;
    }

    public float getSalary() {
        return Salary;
    }

}

public class Solve {
    public static void main(String[] args) {
        Manager arafat = new Manager(
                "ahmed arafat",
                "ahmed@gmail.com",
                "ahmed@cic-cairo.com",
                "IT",
                1000);
        arafat.setMangingTeam("Back-End");
        arafat.PrintPersonalEmail();
        arafat.PrintFormalEmail();
        System.out.println(arafat.getSalary());
        System.out.println(arafat.getMangingTeam());
    }
}
/*
Human
Employee (inherit from Human)
Manager (inherit from Employee, so it also inherits Manager)
 */