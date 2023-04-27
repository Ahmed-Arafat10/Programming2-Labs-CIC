## Programming 2 - Lab #8 : Polymorphism

### By `TA Ahmed Arafat` (Ahmed Mohamed Yousry)

### Topics To Be Discussed:

1. Problem: Circle & Cylinder (Practicing on Inheritance)
2. Polymorphism In OOP
3. Method Overriding & `@override`
4. super class reference of subclass object ( `Parent obj = new Child()` )
5. Problem: TV class (`SwitchOn()`/`ChangeChannel()`), SmartTV (Extends TV with `Browse()`)
6. Dynamic Method Dispatch
7. Real Life Case of Dynamic Method Dispatch
8. Rules For Overriding

### 1. Problem: Circle & Cylinder (Practicing on Inheritance)
````java
class Circle {
    public static final double PI = 3.14;
    private double radius;

    public Circle() {
        radius = 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return PI * radius * radius;
    }

    public double Parameter() {
        return 2 * PI * radius;
    }
}

// PI R^2 H         
class Cylinder extends Circle {
    private double height;

    Cylinder() {
        height = 0;
    }
}

/*
myC
private double radius; -- super     VIP Note: Available But Not Accessible
public Circle(); -- super
public void setRadius(double radius) -- super
public double Parameter() -- super

private double height;
Cylinder();
 */
public class Solve {
    public static void main(String[] args) {
        Cylinder myC = new Cylinder();
    }
}
````


### 2. Polymorphism :

- Polymorphism is one of the principles of Object-oriented-programming,
  polymorphism means one name different actions.
- Poly means ’many’, morphism means ’forms’.
- Polymorphism is achieved using method `Overriding` and `Overloading`.

### 3. Method Overriding & `@override` :

- Method Overriding : Refining the method of the Super Class in the Sub Class.
- Method will be called depending on the object.
- Method overriding is achieved in Inheritance.

````java
class Super {
    public void display() {
        System.out.println("Hello");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Hello Welcome");
    }
} 
````
- Practicing
````java

class Super {
    public void Test1(int abc) {
        System.out.println("Test1 hello from Super");
    }
}

class Sub extends Super {
    @Override
    public void Test1(int xyz) {
        int n1 = 10, n2 = 20, sum = n1 + n2;
        System.out.println("Sum is:" + sum);
    }

    public void Test2() {
        System.out.println("Test2 hello from Super");
    }
}

public class Solve {
    public static void main(String[] args) {
        Sub myobj = new Sub();
        myobj.Test1(342);
    }
}
````

> - When the subclass object is called then the display method inherited
    from the super class is shadowed and the subclass display method is
    executed.
> - Super Class method never be called upon the object of SubClass.
    In the given example program the super class have a method called
    display which is saying hello and another class subclass is taken where it
    inherits the display method from super class and redefined the method.
> - When a super class reference holding the object of subclass and
    overridden method is called then method of object will be called it is
    `Dynamic Method Dispatch`.

### 4. super class reference of subclass object ( `Parent obj = new Child()` )
`````java
class Super {
    public void Test1(int abc) {
        System.out.println("Test1 hello from Super");
    }

    public void Print() {
        System.out.println("Test1 hello from Super");
    }
}

class Sub extends Super {
    public int x = 10;

    @Override
    public void Test1(int xyz) {
        int n1 = 10, n2 = 20, sum = n1 + n2;
        System.out.println("Sum is:" + sum);
    }

    public void Test2() {
        System.out.println("Test2 hello from Super");
    }
}

public class Solve {
    public static void main(String[] args) {
        Super obj = new Sub();
        obj.Test1(432);// Dynamic Method Dispatch (Run Time Polymorphism)
        obj.Print();
    }
}
`````
### 5. Problem: TV class (`SwitchOn()`/`ChangeChannel()`), SmartTV (Extends TV with `Browse()`)

````java
class TV {
    public void SwitchOn() {
        System.out.println("Switching On My Tv Manually");
    }

    public void ChangeChannel() {
        System.out.println("Changing My Channel On My Tv Manually");
    }
}

class SmartTV extends TV {
    @Override
    public void SwitchOn() {
        System.out.println("Switching On My SmartTV Automatically");
    }

    @Override
    public void ChangeChannel() {
        System.out.println("Changing My Channel On My SmartTV Automatically");
    }

    public void BrowseYoutube() {
        System.out.println("Browsing Youtube Currently");
    }
}

public class Solve {
    public static void main(String[] args) {
        TV mytv = new SmartTV();
        //SmartTV mytv2 = new TV(); [Not Valid]
        //Vehicle mytv = new Car(); [Valid]
        //Car mytv = new Vehicle(); [Not Valid]
        mytv.SwitchOn();
        mytv.ChangeChannel();
        //mytv.BrowseYoutube(); [Not Valid]
    }
}
````

### 6. Dynamic Method Dispatch

- Dynamic Method Dispatch :It is useful for achieving Runtime Polymorphism.
  Example Program

````java
class Super {
    Void meth1() {
        System.out.println("meth1");
    }

    Void meth2() {
        System.out.println("super meth2");
    }
}

class Sub extends Super {
    Void meth2() {
        System.out.println("sub meth2");
    }

    Void meth3() {
        System.out.println("meth3");
    }
}

class test {
    public static void main() {
        Super s = new Sub();
    }
}
````

- In the given example `meth2()` is redefined in the subclass.
- Super Class reference can have Object of Sub Class but a SubClass reference cannot have Super Class Object.
- A Super Class Reference can hold the Object of Sub Class, but it can call only those methods which are present in
  super class.
- Methods are called depending on the object not the reference then the overridden object is called it
  is `Runtime Polymorphism`.
- Dynamic Method Dispatch means calling a Method dynamically because program make the decision at runtime for which
  object to be called.

### 7. Real Life Case of Dynamic Method Dispatch
````java
class Animal {
    public void MakeSound() {
        System.out.println("Iam an Animal And this is my sound");
    }
}

class Dog extends Animal {
    @Override
    public void MakeSound() {
        System.out.println("Haw Haw");
    }
}

class Cat extends Animal {
    @Override
    public void MakeSound() {
        System.out.println("Meow Meow");
    }
}

class Bird extends Animal {
    @Override
    public void MakeSound() {
        System.out.println("Sew Sew");
    }
}


public class Solve {
//    public static void FunForDog(Dog dog)
//    {
//        dog.MakeSound();
//    }
//    public static void FunForCat(Cat cat)
//    {
//        cat.MakeSound();
//    }
//    public static void FunForBird(Bird bird)
//    {
//        bird.MakeSound();
//    }

    // Good Practicing To Follow To Achieve Clean Code
    public static void Generic(Animal animal) {
        animal.MakeSound();
    }

    public static void main(String[] args) {
        Generic(new Bird()); // Anonymous Object
        Generic(new Cat()); // Anonymous Object
        Generic(new Bird()); // Anonymous Object
        Generic(new Animal()); // Anonymous Object
    }
}
````

### 8. Rules For Overriding

#### Do and Don’t of Method Overriding

- Signature must be same in method overriding.
- If the method name is different the method is not overridden ,but it is overloaded.
- Argument may be different but the parameter must be same.
- Return type must be same, if it is not same then the method is neither overridden nor overloaded.
- Final and static methods cannot be overridden.
- Method can be overridden with same or lenient (public, protected) access modifiers but the stricter(private) access modifiers cannot be used in subclass.  


### References
- ChatGPT
- Abdul Bari