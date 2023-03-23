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
int GetMinNum() {
    int min = 9999999, n;// min = 1    n = -1
    cin >> n;
    while (n != -1) {
        if (n < min)
            min = n;
        cin >> n;
    }
    return min;
}

int main() {
    int res = GetMinNum();
    cout << "Max number is: " << res;
}