import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;


		int k = Integer.parseInt(br.readLine());
		int[] n = new int[8001];

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;
		int mode = 1000;

		for (int i = 0; i < k; i++) {
			int number = Integer.parseInt(br.readLine());
			sum += number;
			n[number + 4000]++;

			if (max < number)
				max = number;
			if (min > number)
				min = number;

		}

		int count = 0; // 중앙값 빈도 누적 수
		int mode_max = 0; // 최빈값의 최댓값
		boolean flag = false; // 이전에 동일한 최빈값이 1번만 등장한 경우 true

		for (int i = min + 4000; i <= max + 4000; i++) {
			if (n[i] > 0) { // 숫자 존재하면

				if (count < (k + 1) / 2) {
					count += n[i];
					median = i - 4000;
				}

				if (mode_max < n[i]) {
					mode_max = n[i];
					mode = i - 4000;
					flag = true;
				} else if (mode_max == n[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}

			}
		}

		System.out.println((int) Math.round((double) sum / k)); // 산술평균
		System.out.println(median); // 중앙값
		System.out.println(mode); // 최빈값
		System.out.println(max - min); // 범위

	}

}
