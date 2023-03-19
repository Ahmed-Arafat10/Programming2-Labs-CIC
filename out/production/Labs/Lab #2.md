## Programming 2 - Lab #2
### By `TA Ahmed Arafat` (Ahmed Mohamed Yousry)

### Topics To Be Discussed:

#### 1. Case-Sensitivity in C++
#### 2. Printing on Screen (`Cout`)
#### 3. Taking An Input  (`Cin`)
#### 4. Arithmetic Operators (`+` `-` `*` `/` `%`)
#### 5. Assignment Operators (`+=` `-=` `*=` `/=` `%=`)
#### 6. Increment Operators (Postfix & Prefix `++` `--`)
#### 7. Conditions (`if`/`else`/`else if`)
#### 8. Comparison Operators ( `==` `!=` `>` `<` `>=` `<=`)
#### 9. Logical operators (`&&` `||` `!`)
#### 10. Switch Statement
#### program 1: Grade GPA (if statement)

<hr>
<hr>
<hr>






## 1. Case-Sensitivity in C++
- `Case-Sensitivity` : Means that writing in upper case is different from writing in lower case
- For Example, if I write the following code:
````cpp
#include <bits/stdc++.h>
using namespace std;

int main()
{
    INT x;
}
````
> This will generate a compilation error (error in the syntax) as you typed `INT` not `int` <br>
> so `Keywords` `*`: like `for`/`while`/`int`/`using`/`namesapce`/`do`/`if`/`else`/`break`/`continue`/`switch`/`class` and so on should be named in lowercase not upper one

- Again, `*Keywords`: is a predefined or reserved word in C++ library with a fixed meaning and used to perform an internal operation. C++ Language supports more than 64 keywords.

- This means that `C++` programming language is case-sensitive (`java` is also a case-sensitive)
- Languages like `HTML` (markup language not a programming one) & `SQL` (used for `Databases`) are case-insensitive languages, you can write in `SQL` both words `SELECT`/`select`
- Also note the following
````cpp
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x;
    int X;
}
````
> This code will run perfectly as I have named two variables one `x` & `X`, one is uppercase and the other is lowercase 


## 2. Printing on Screen (`Cout`)
- The syntax of printing a message in the terminal is by using `cout`
- Let's see the following examples:
``````cpp
int main()
{
    cout<<"Hello World";// print a message
    cout<<"Hello World"<<" My Name Is Ahmed"; // print two messages
    string name = "Ahmed Arafat";
    cout<<"Hello,"<<name;// print a message + value stored in the variable `name`
    cout<<"Hello World\n";// to print `hello` then end the line (the next text will be printed on the next line)
    cout<<"Hello World"<<endl;// another method to end a line using endl
    cout<<"Hello\tAhmed";// `t` stands for tab, the output will be `Hello    Ahmed`
}
``````
> Note: `1` tab = `4-8` spaces

#### 3. Taking An Input  (`Cin`)
- Let's observe the following code :
````cpp
int main()
{
    string name;
    cin>>name;
    cout<<"Hello, "<<name;
}
````
> `cin>>name` means that the terminal will ask the user to enter a value & this value will be stored in the variable `name`

#### 4. Arithmetic Operators (`+` `-` `*` `/` `%`)
- Arithmetic operators means mathematical operators
- Let's observe the following code :
````cpp
int main()
{
  int x1 = 10 + 2;//12
  int x2 = 10 - 2;//8
  int x3 = 10 * 2;//20
  int x4 = 10 / 2;//5
  int x5 = 10 % 2;//0
}
````
> Note: for Arithmetic operators the must be an `operator` (`+` `-` `*` `/` `%`) & two `operand` (numbers) <br>
> So we type `2 + 2` we cannot say `2 +` only or `+ 2` (means that it is a positive number) we must have two numbers (`operand`)
- Let's take about the operator `%` which is called reminder or Modulo
- It produces the remainder of an integer division
- Let's observe the following expression `10 % 2`, the  output will be `ZERO`, why because we subtract the value on the right side of `%` from the 
value on the left side of `%`, let's see. First we subtract `2` from `8`, the result will be `6` then again
subtract `2` then the result will be `4`, continue this process `10`-`8`-`6`-`4`-`2`-`0`. NOTE : once the number of the left become less than the number of the right `0 % 2` the result will be the number on the left (which is `0`)
- Can we say that we want to subtract `2` from `0`, or `100` from `5`, its meaningless so that the number on the left side will be the result
- Another important note: let's say that `1234 % 5` and the `5` is the `n`. In this case the result will be from `0` to `4`
- The result will be and MUST be from `0` to `n-1`, so the result will be one of the following values (`0`,`1`,`2`,`3`,`4`)

#### 5. Assignment Operators (`+=` `-=` `*=` `/=` `%=`)
- Let's observe the following code :
````cpp
int main()
{
    int x = 10;
    // The compiler will convert the following lint to
    // x = x + 2  , and so on for the rest
    x += 2;//x will be 12
    // x = x - 2 
    x -= 2;//x will be again 10
    // x = x * 2 
    x *= 2;//x will be 20
    // x = x / 2 
    x /= 2;//x will be again 10
    // x = x % 2 
    x %= 2;//x will be again 0
}
````
#### 6. Increment Operators (Postfix & Prefix `++` `--`)
- Postfix means `x++` or `x--` (whether it is increment or decrement)
> Post word means after (like saying post-war)

- Prefix means `++x` or `--x` (whether it is increment or decrement)
> Pre word means before (like saying prepaid)

#### 7. Conditions (`if`/`else`/`else if`)
#### 8. Comparison Operators ( `==` `!=` `>` `<` `>=` `<=`)
#### 9. Logical operators (`&&` `||` `!`)
#### 10. Switch Statement

````cpp
#include <iostream>
using namespace std;

int main()
{
    int grade;
    string res;
    cin>>grade;
    if(grade >= 90) res = "A+";
    else if(grade >= 85) res = "A";
    else if(grade >= 75) res = "B+";
    else if(grade >= 70) res = "B";
    else if(grade >= 60) res = "C+";
    else if(grade >= 55) res = "C";
    else if(grade >= 50) res = "D";
    else res = "F";

    cout<<"Your Result Is: "<<res;

}
````

## program 2: check drink (switch)
## program 4: sum input from users if n != -1 (while)
## program 5: sum of numbers from 1 to N (for loop)
## program 6: https://codeforces.com/group/ctwVty4ZXZ/contest/267232/problem/Q