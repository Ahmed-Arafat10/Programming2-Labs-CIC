## Programming 2 - Lab #7 : Inheritance
### By `TA Ahmed Arafat` (Ahmed Mohamed Yousry)

### Topics To Be Discussed:
1. Inheritance
2. Protected Access Modifier (accessed in the same package & for subclasses)
3. Multiple Inheritance (`NOT SUPPORTED IN JAVA`)
4. Multi-Level Inheritance
5. Final classes
6. Super keyword to access parent class's attributes
7. Super() to call parent class's constructor


<hr>
<hr>


- `Inheritance` is a mechanism in which one object acquires all the properties and behaviors of a parent object.

- The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.

- When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

- Advantage : `Re-usability of code` is a mechanism which helps you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.



### Super Class and Sub Class

1. Super Class (Base class or parent class) : The class whose features are inherited.

2. Sub Class (Derived class, extended class, or child class) : The class that inherits from other class.

Syntax:
````java
class SubclassName extends SuperclassName{
    
}
````

> `VIP Note`: Java does not support multiple inheritances with classes. A superclass can have any number of subclasses. But a subclass can have only one superclass.

- A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.

- A subclass does not inherit the `private` members of its parent class. 
However, if the superclass has `public` or `protected` methods (like 
`getters` and `setters`) for accessing its `private` fields, these can also 
be used by the subclass.


### Super()
- If a constructor does not explicitly invoke a superclass constructor
by using `super()`, the Java compiler automatically inserts a call to
the no-argument constructor of the superclass.
`super()` can be used to call parent class constructors only.
Call to `super()` must be first statement in Derived Class constructor.



### Problem #1
- create a class called `Human` with attributes `name` which is accessible anywhere
& `email` which is accessible only in the same package or subclasses inherit from it
- Then create a parametrized contractor 
- Then create a method called `Sleeping()` that print text `"I am sleeping now"`,
this method only accessible within that class

  
- Then create another class called `Employee` with attributes `email` which is accessible anywhere
& protected attributes `Department` & `Salary` 
- This class has same attributes/methods as class `Human`
- Then create a parametrized constructor that initialize both attributes of
  class `Human` & `Employee`
- Then create two functions `PrintPersonalEmail()`/`PrintFormalEmail()`,
one prints the personal email (email of class `Human`)
& the other prints the work email (email of class `Employee`)


- Finally, create a class called `Manager` that inherits from `Employee` class
- This class cannot be inherited at any circumstances
- This class has attribute `ManagingTeam` which is public
- Then create a `getter()` & `setter()` methods for above attribute
- Then create a parametrized constructor that initialize both attributes of
  class `Human` & `Employee` & this class `Manager`
- Create a `getter()` method to return the `Salary`
- Finally, in main() create an object of class `Manager` 
, then call all available methods
### Solution:
````java
class Human {
    public String name;
    protected String email;

    public Human(String name, String email) {
      System.out.println("Human Constructor");
        this.name = name;
        this.email = email;
    }

    private void Sleeping() {
        System.out.println("I am sleeping now");
    }
}

class Employee extends Human {
    public String email;
    protected String Department;
    protected float Salary;

    public Employee(String name, String personal_email, String work_email, String Dep, float Sal) {
        super(name, personal_email);
        System.out.println("Employee Constructor");
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
    private String ManagingTeam;

    public Manager(String name,
                   String personal_email,
                   String work_email,
                   String Dep,
                   float Sal) {
        super(name, personal_email, work_email, Dep, Sal);
        System.out.println("Manager Constructor");
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
````
