#include <iostream>

using namespace std;

int main() {
   int grade;
   string res;
   cin>>grade;
   if(grade >= 90) res = "A+";
   else if (grade >= 85) res = "A";
   else if (grade >= 80) res = "B+";
   else if (grade >= 75) res = "B";
   else if (grade >= 60) res = "C+";
   else if (grade >= 50) res = "C";
   else res = "F";
   cout<<"Your grade is "<<res;
}