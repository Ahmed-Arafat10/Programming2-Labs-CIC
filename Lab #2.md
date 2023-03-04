## 0. case-sensitive languages, keyword for variable names
## 1. Print on screen (cout / `\n`/endl)
## 2. conditions (if/ else if / else)
## 3. arithmetic operators (+ - * / %)
## 3. assignment & increment operators (+= -= *= /= %= ++ --)
## 4. conditions (if / else if / else)
## 5. comparison operators ( > < >= <= == !=)
## 5. logical operators  (&& || !)
## 7. switch
## 8. while loop
## 9. for loop
## 10. do-while loop

## program 1: Grade GPA (if statement)

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