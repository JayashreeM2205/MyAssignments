package Week1.day2;

public class fibonacciSeries {
	public static void main(String[] args) {
		int n = 8, temp = 0, i = 1;
		System.out.println(temp);
		System.out.println(i);

		for (int j = 2; j < n; j++) {
			int next;
			next = temp + i;
			System.out.println(next);
			temp = i;
			i = next;

		}
	}
}


