#include <iostream>

using namespace std;

/*





 monolithic vs procedural (functional programming) vs OOP

 - complexity
 - debugging
 - redundancy
 - editing or refactoring the code

 */



// monolithic vs procedural (functional programming)


int Sum(int n1,int n2)
{
    return n1 + n2;
}



//bool IsEven(int arr[],int sz)
//{
//    return n % 2 ? 1 : 0;
//}

void solve(int arr[],int sz)
{
 int sum = 0, avg=0;//garbage value
 for(int i = 0;i<sz;i++)
     sum +=arr[i];

 avg = sum/sz;//3
 cout<<"Sum is :"<<sum<<endl;
 cout<<"avg is :"<<avg<<endl;
}


int main() {
    int sz;
    cin>>sz;
    int arr[sz];
    for(int i = 0;i<sz;i++)
        cin>>arr[i];

    solve(arr,sz);


}

