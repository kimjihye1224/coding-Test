#include <iostream>
using namespace std;
int main(void){
    int n = 0, result=0;
    cin >> n;
    
    for(int i = 1; i <= n; i++){
        result += i;
    }
    cout << result;
    return 0;
}