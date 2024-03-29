## Programming 2 - Lab #9 : Continue Polymorphism (Method Overloading) & Abstraction (Abstract Class)
### By `TA Ahmed Arafat` (Ahmed Mohamed Yousry)

### Topics To Be Discussed:
1. Method Overloading
2. Abstract Class 
3. Solving On Abstract Class (Problem #1 & Problem #2)
4. Some Rules Of Abstract Class
5. Assignment On Abstract Class (MacDonald's Problem)
6. `HAS-A` relationship
7. Array of Objects

### 1. Method Overloading
- Method Overloading is a feature in Java that allows you to define multiple methods in a class with the same name but with different parameters. The methods must differ in the number, type, or order of their parameters.
- It's also known as `Compile Time Polymorphism`
Here is an example of method overloading in Java:

```java
public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}
```

In this example, the `Calculator` class has three `add` methods with the same name but with different parameters. The first `add` method takes two integer parameters, the second `add` method takes two double parameters, and the third `add` method takes three integer parameters.

When you call the `add` method with different arguments, the compiler selects the appropriate method to call based on the number and types of the arguments. For example:

```java
Calculator calculator = new Calculator();

int sum1 = calculator.add(1, 2); // calls the first add method with two integer arguments
double sum2 = calculator.add(2.5, 3.5); // calls the second add method with two double arguments
int sum3 = calculator.add(1, 2, 3); // calls the third add method with three integer arguments
```
> In this example, the appropriate `add` method is called based on the type of arguments passed to it. The first `add` method is called with two integer arguments, the second `add` method is called with two double arguments, and the third `add` method is called with three integer arguments.

- The rules of method overloading in Java:
  1. The methods must have the same name.
  2. The methods must have different parameters. The parameters can differ in the number, type, or order of their parameters.
  3. The methods can have different return types. However, the return type alone is not sufficient to overload a method.
  4. The methods can have different access modifiers (e.g., public, private, protected, or default).
  5. The methods can throw different checked or unchecked exceptions.
  6. The methods can be static or non-static.

### 2. Abstract Class
- There	are	two	types of classes Abstract class and	Concrete class
- If abstract keyword is used before the class	then it	is an Abstract Class if nothing	is written before class	then it	is	a Concrete class
- Object of an Abstract class cannot be created but object of Concrete class can be	created
- Method which is not having a body	is known as Abstract method, the method must be	declared as abstract
- The abstract method is undefined method
- A class is Abstract class if at least one of the methods is abstract
- If any other class inherits abstract class then that class also becomes abstract class but to become a concrete class the subclass must override the undefined method
- A class becomes useful if	it overrides all the methods of	abstract class
- Abstract classes are used	for	imposing standards and sharing methods
- Subclasses are meant for following standards

### 3. Solving On Abstract Class
#### Problem #1 : 
- Create a class `Human` with name attribute and constructor that initialize it
and print text `an object is created from Human`, then add method `Speak()` that print text `Hello Everyone`, then create a method called `PrintYourJob()` that define a STANDARD for each subclass, each HAS HIS OWN WAY of implementing it
- Then create `Student` Class that implements the `PrintYourJob()` method and create another method in it called `Study()` that print any text
- Finally, create another class called `Programmer` that extends from `Human` and define its body
- Now create Two objects one from `Student` & the other from `Programmer`

#### Solution:
````java
abstract class Human {
    public String Name;

    public Human() {
        System.out.println("an object is created from Human");
    }

    public final void Speak() {
        System.out.println("Hello Everyone");
    }

    public abstract void PrintYourJob();

    public abstract void PrintYourStatus();
}

class Student extends Human {
    @Override
    public void PrintYourJob() {
        System.out.println("I'm Student");
    }

    @Override
    public void PrintYourStatus() {
        System.out.println("I'm Single");
    }
}

class Programmer extends Human {
    @Override
    public void PrintYourJob() {
        System.out.println("I'm Programmer");
    }

    @Override
    public void PrintYourStatus() {
        System.out.println("I'm Married");
    }
}

public class Solve {

    public static void main(String[] args) {
        // Human arafat  = new Human(); [ERROR]
        Student Mina = new Student();
        Mina.PrintYourJob();
        Mina.PrintYourStatus();
        Mina.Speak();
        
        Student Arafat = new Student();
        Arafat.PrintYourJob();
        Arafat.PrintYourStatus();
        Arafat.Speak();
    }
}
````

#### Problem #2 (Solve It With Yourself):
- Create a class called `Shape` that contains a default constructor that prints `Hi I'm a Shape`, then create to abstract methods `Area()`/`Primeter()` 
- Then create two classes called `Circle` & `Rectangle` that inherit from Shape
- Then create two objects from `Circle` & `Rectangle`

### 4. Some Rules Of Abstract Class
1. You cannot create an object from an abstract class
2. If I wrote a function without a body, then I have to use keyword
abstract, or I will get an error
3. If there is a function abstract in a class that is not abstract (abstract keyword is not used)
then I will get an error
4. If I have a class that is abstract then I cannot make it `final`
5. Same as above an abstract function cannot be `final`
6. Abstract function cannot be `static` : static functions must have its body
7. Subclass must override abstract function, or it will be an abstract class,
and then I should write `abstract` keyword to subclass
8. Abstract class is partially abstract, while interface is fully (100%) abstract
9. It achieves `inheritance` & `polymorphism`


### 5. Assignment On Abstract Class (MacDonald's Problem)
- Assume you want to open a branch of McDonalds in Egypt
  then you will have to create a class called `EgyMcdonalds`
  this class MUST have a standards that are already set by `McDonalds`
  class that set rules
  where all other branches of McDonalds must follow
  in `McDonalds` class:
  when a branch is created that have McDonalds brand, automatically print
  `"One of McDonalds branches is opened"`
  also in this class you must have `MakeBigMac()`/`MakeBigTasty()` functions
  that have their own body set by `McDonalds` class
  printing how to make MakeBigMac & MakeBigTasty according to McDonalds Standards
  also each branch of McDonalds MUST have a `Billing()` function,
  but each branch HAS HIS OWN WAY
  of calculating this bills, for example here in Egypt we have VAT which is 14% tax rate paid on all orders
- Also create another function called `Offers()` that print offers available set by McDonalds class itself
also create another function called `Offers(string offer)`		
that is used for printing offers available for each specific branch, each branch has his own way of printing the offer

#### Solution:
````java
abstract class McDonalds {
    public McDonalds() {
        System.out.println("One of McDonalds branches is opened");
    }
    public final void MakeBigMac() {
        System.out.println("Making of Big Mac");
    }
    public final void MakeBigTasty() {
        System.out.println("Making of Big Tasty");
    }
    public abstract void Billing();
    public abstract void Offers(String offer);
    public void Offers() {
        System.out.println("ths is an offer from MAC brand");
    }
}

class EgyMcdonalds extends McDonalds {
    @Override
    public void Billing() {
        System.out.println("14% VAT in Egypt");
    }
    @Override
    public void Offers(String offer) {
        System.out.println("Offers in Egypt: " + offer);
    }
}

public class Solve {
    public static void main(String[] args) {
        EgyMcdonalds Zamalek = new EgyMcdonalds();
        Zamalek.MakeBigTasty();
        Zamalek.MakeBigMac();
        Zamalek.Offers();
        Zamalek.Offers("10 Big Mac only Pay 100 L.E");
        Zamalek.Billing();
    }
}
````

### 6. `HAS-A` relationship
- In Java, the HAS-A relationship refers to a type of association where one object "has" another object as one of its properties or attributes. This relationship is also known as composition.
#### Example:
````java
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
        Human arafat = new Human("Ahmed Arafat", 23, 12340101, 10000);
        System.out.println(arafat.Age); // 23
        System.out.println(arafat.Name); // Ahmed Arafat
        System.out.println(arafat.myAcc.balance);// 12340101
        System.out.println(arafat.myAcc.balance);// 10000
        arafat.myAcc.BackAccData();
        arafat.HumanData();
    }
}
````

### 7. Array of Objects

In Java, an array of objects is simply an array where each element is an object of a particular class type. This allows for the creation of collections of objects, similar to how an array of primitive types (`int`/`double`/'string`) allows for the creation of collections of values.
````java
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
````

### References
- ChatGPT
- Abdul Bari
