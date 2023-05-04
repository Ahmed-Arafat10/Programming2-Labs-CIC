## Programming 2 - Lab #4
### By `TA Ahmed Arafat` (Ahmed Mohamed Yousry)

### Topics To Be Discussed:
#### 1. Monolithic Vs Procedural (Functional) Programming


## 1. Monolithic Vs Procedural (Functional) Programming
- In old languages like

````cpp
#include <iostream>

using namespace std;

/*
 - complexity
 - debugging
 - redundancy
 - editing or refactoring the code
 */
// function called sum return void
int sum;

int Sum(int n1 , int n2) {
    cout << "Please enter two numbers\n";
    cin >> n1 >> n2;
    sum = n1 + n2;
    cout << "sum is :" << sum<<endl;
    return sum;
}

int main() {
    cout << "before sum ya controller\n";
    int x,y;
    cin>>x>>y;
    Sum(x,y);//Calling  function
    cout<<sum;
    cout << "after sum ya controller\n";
}

/*
5
1 2 3 4 5

1 2 3 4 5
sum is = 15
 */

````


````cpp
#include <iostream>

using namespace std;

/*

    monolithic vs procedural (functional programming) vs OOP

 - complexity
 - debugging
 - redundancy
 - editing or refactoring the code

 */
// function called sum return void
int sum;

int Sum(int n1 , int n2) {
    cout << "Please enter two numbers\n";
    cin >> n1 >> n2;
    sum = n1 + n2;
    cout << "sum is :" << sum<<endl;
    return sum;
}

bool IsEven(int num)
{
    return num % 2 == 0 ? 1 : 0;
    if(num % 2 == 0) return 1;
    return 0;
}

int main() {
    int x;
    cin>>x;
    if(IsEven(x)) cout<<"Even Number\n";
    else cout<<"Odd Number\n";
}

/*
5
1 2 3 4 5

1 2 3 4 5
sum is = 15
 */
````

````cpp
/*
 take about in the documentation
 - global var vs local to sum()
 - if variables passed to func sum(int n1,int n2) having the same name as the var in main() [show them the address of each one]
 */  
````