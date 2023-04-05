//Ahmed Mohamed Yousry
//202201234
#include <iostream>

using namespace std;

/*
 1
 2
 100
 3
 -1
 */

int MyMax(int x,int y)
{
    return x > y ? x : y;//
}
int MyMin(int x,int y)
{
    return x < y ? x : y;// 5 3
}
int main() {

    int a, b, c;
    cin >> a >> b >> c;// 3 1 2 = 6

    int Largest = MyMax(a, MyMax(b, c));//3
    int Smallest = MyMin(a, MyMin(b, c));//1
    int mid = a + b + c - Largest - Smallest;
    cout << Smallest << endl;
    cout << mid << endl;
    cout << Largest << endl;
    cout << endl;
    cout << a << endl;
    cout << b << endl;
    cout << c << endl;

}