#include <iostream>
using namespace std;

int main(){
	int n;
	string s;
	int result = 0;
	
	cin >> n;
	cin >> s;

	for (int i = 0; i < n; i++) {
		result += s[i] - '0';
	}
	cout << result;
	return 0;
}