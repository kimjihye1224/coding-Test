#include <iostream>
using namespace std;

int main(){
    int a,b,c =0;
    cin >> a;
    
    for(int i = 1; i <= a; i++){
        cin >> b >> c;
        cout << "Case #" << i << ": " << b << " + " << c << " = " << b+c <<endl;
    }
    return 0;
}