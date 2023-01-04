#include <iostream>
using namespace std;

int main() {
    int a;
    cin >> a;

      int j;
    for (int i = a; i >0; i--) {
        for (j = 1; j < i; j++) {
            cout << " ";
        }
        for (int k = 0; k <= a - j; k++) {
            cout << "*";
        }
        cout << endl;
    }


}