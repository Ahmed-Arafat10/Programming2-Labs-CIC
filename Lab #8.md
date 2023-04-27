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

### 2. Polymorphism :

- Polymorphism is one of the principles of Object-oriented-programming,
  polymorphism means one name different actions.
- Poly means ’many’, morphism means ’forms’.
- Polymorphism is achieved using method overriding and overloading.

### 3. Method Overriding & `@override` :

- Method Overriding : Refining the method of the Super Class in the Sub Class.
  Method will be called depending on the object.
  Method overriding is achieved in Inheritance.

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

### 5. Problem: TV class (`SwitchOn()`/`ChangeChannel()`), SmartTV (Extends TV with `Browse()`)

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

### 8. Rules For Overriding

#### Do and Don’t of Method Overriding

- Signature must be same in method overriding.
- If the method name is different the method is not overridden ,but it is overloaded.
- Argument may be different but the parameter must be same.
- Return type must be same, if it is not same then the method is neither overridden nor overloaded.
- Final and static methods cannot be overridden.
- Method can be overridden with same or lenient (public, protected) access modifiers but the stricter(private) access modifiers cannot be used in subclass.  