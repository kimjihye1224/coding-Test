#include <iostream>
using namespace std;

int main() {
	int h, m;
	int time;
	cin >> h >> m;
	cin >> time;

	int pastH = m + time;

	if (pastH < 60)
		cout << h << " " << pastH;
	else {
		h += pastH / 60;
		m = pastH % 60;

		if (h >= 24)
			h -= 24;

		cout << h << " " << m;
	}
	return 0;
}