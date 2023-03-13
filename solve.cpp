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


void solve(int arr[], int sz) {
    int sum = 0, avg;
    for (int i = 0; i < sz; i++) sum += arr[i];
    cout << "sum is " << sum << endl;
    avg = sum / sz;
    cout << "avg is " << avg << endl;
}

int main() {
    int sz;
    cin >> sz;
    int arr[sz];
    for (int i = 0; i < sz; i++) cin >> arr[i];
    solve(arr, sz);
}

