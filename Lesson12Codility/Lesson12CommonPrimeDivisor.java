import java.util.ArrayList;

public class Lesson12CommonPrimeDivisor {

	public static int solution(int[] a, int[] b) {
		ArrayList<Integer> primeNum1 = new ArrayList<>();
		ArrayList<Integer> primeNum2 = new ArrayList<>();

		int divCount = 0;
		int c = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a[i]; j++) {
				for (int k = 1; k < j + 1; k++) {
					if (j % k == 0) {
						divCount++;
					}
				}

				if (divCount == 2) {
					if (a[i] % j == 0) {
						primeNum1.add(j);
					}
				}

				divCount = 0;
			}

			for (int j = 1; j < b[i]; j++) {
				for (int k = 1; k < j + 1; k++) {
					if (j % k == 0) {
						divCount++;
					}
				}

				if (divCount == 2) {
					if (b[i] % j == 0) {
						primeNum2.add(j);
					}
				}

				divCount = 0;
			}

			if (primeNum1.size() == primeNum2.size() && primeNum1.size() != 0) {
				int count = 0;
				for (int l = 0; l < primeNum1.size(); l++) {
					if (primeNum1.get(l) == primeNum2.get(l)) {
						count++;
					}
				}

				if (count == primeNum1.size()) {
					c++;
				}
			}

			primeNum1.clear();
			primeNum2.clear();

		}

		return c;
	}

	public static void main(String[] args) {
		int[] a = { 15, 10, 3 };
		int[] b = { 75, 30, 5 };

		System.out.println(solution(a, b));
	}

}
