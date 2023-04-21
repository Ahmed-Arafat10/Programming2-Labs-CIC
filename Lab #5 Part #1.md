### Brief history of Object oriented in real life

### What is OOP ?
- Object-Oriented Programming (OOP) is a programming model for building the software programs.
It is used to divide a software program into simple and reusable pieces of code.
OOP is based on the concept of classes and objects.
- It is considered to be a paradigm shift
There are many OOP languages including JavaScript,C++,Java



### Advantage Of OOP
1. OOP is faster and easier to implement (Development).
2. OOP gives the programs a clear, clean & **proper structure**.
3. OOP easy in **modification** and **debugging** of code.
4. OOP allows you to create fully **reusable** applications with **less code and less time**.


### Principles of OOP

1. `Encapsulation`: mean that all important information is contained inside an object. (`Data security`);
2. `Abstraction`: hide unnecessary details from the user. This concept can help to easily make additional changes or additions over time. (`Hide complexity`)
3. `Inheritance`: Classes can reuse code from other classes. (`Code Re-usability`)
4. `Polymorphism`: Objects are designed to share behaviors and they can take more than one form. (`Code Re-usability`)



### What is Class?

- `Class`: is a blueprint or logical design or container or template that describes characteristics of objects and the operations that can be performed by object.

- Class Contains:
  1. `Data members` (called instances, variables, or `attributes`)
  2. `Operations` (called `methods`) : A function is a block of code which only runs when it is called.



Example :
A Person is a class. The person has attributes, such as email and address, and methods, such as verify and sent mail.


### What is Object?
- Object: is an element (or instance) of a class and has the behavior of its class.
When an object is created, it inherits all the variables and methods of its class.
The object is the actual component of programs, while the class specifies how instances are created and how they behave.
To create an object of class, specify the class name, followed by the object name, and use the keyword new
````java
Person P1 = new Person();
````

- Multiple Objects
````java
public static void main(String[] args) {
//Create multiple object of Class
Person p1 = new Person();
Person p2 = new Person();

System.out.println(p1.name);
System.out.println(p2.name);
}
````


### Variables
- `Variables:` are containers for storing data values.
````java
Type VariableName = value;
````
> Type: is the data type of the variable <br>
> VariableName: is the name of the variable <br>
> Equal sign : is to assign value to the variable <br>
Example :
````java
int x = 3;
````
Variable is called attribute or field.

Class attributes are variables declared within the class.
``
public class Person {
String name;
int age;
}
``
To access attributes by creating an object of the class, and by using the dot syntax (.)
ClassName.attributeName;




Access the class attributes
````java
public class Person {



public static void main(String[] args) {
//Create object of Class
Person p1 = new Person();

System.out.println(p1.name);
System.out.println(p1.age);
}
}
````

Set class attributes
````java
public class Person {
String name;
public static void main(String[] args) {
//Create object of Class
Person p1 = new Person();
//Assign value to the variable
p1.name = "arafat";

System.out.println(p1.name);
}
}
````

### Class Methods
- Class methods are declared within a class, and they are used to perform certain actions.
To define a method
ReturnType MethodName (Type input);
ReturnType: Data type of the returned variable from the function
MethodName: Name of the function
Type: Input data type
Input: Input parameters to the functions
To call a method, write the method's name followed by two parentheses () and a semicolon;
MethodName (inputs);
A method can be called multiple times.

````java
public class Person {
static void Print()
{
System.out.println("Hello");
}
public static void main(String[] args) {
Print();
}
}
````


## Constructors
Constructor is a special method that is used to initialize objects.

Constructors must have the same name as the class.

Each time the constructor is called when an object is created using the “new” keyword.

It can be used to set initial values for object attributes.

Constructors do not return any type.


#### Types of Constructors

There are two types of constructors: 
No-argument constructor
Parameterized Constructor
No-argument constructor: A constructor that has no parameter is known as the default constructor.
Parameterized Constructor: A constructor that has parameters used  to initialize fields of the class with specific values.
Compiler creates a default constructor (with no arguments) for the class if your class doesn’t have any
If there is constructor with arguments or no arguments in the class, then the compiler does not create a default constructor. 

Default Constructor
````java
public class Rectangle
{
int width;
int length;
int area;
public Rectangle()
{
width = 5;
length = 4;
area = width * length;
}
````

Parameterized Constructor
````java
public class Rectangle
{
int width;
int length;
int area;
public Rectangle(int wid, int len)
{
width = wid;
length = len;
area = width * length;
}

````

### Static Variable
If you declare any variable as static, it is known as a static variable.
The static variable can be used to refer to the common property of all objects (which is not unique for each object). For example, the company name of employees, college name of students, etc.

To declare static object
Static Type VariableName;
Type: is the data type of the variable
VariableName: is the name of the variable


Static VS Non-static Members
Static data member
Acts as a global object, part of a class, not part of an object of that class
One copy per class type, not one copy per object

Non-static data member
Each class object has its own copy
Can be initialized with member function, or class constructor


Static Functions
Like static member variable, we can also have static member functions.
A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.


Static Functions
To declare static function
Static ReturnType FunctionName(Type input);
ReturnType: data type of the return variable from the function
FunctionName: Name of the function
Type: Input data type
Input : input parameters to the function

````java
class Calculate{  
static int cube(int x){  
return x*x*x;  
}

public static void main(String args[]){  
int result = Calculate.cube(5);  
System.out.println(result);  
}  
}
````

