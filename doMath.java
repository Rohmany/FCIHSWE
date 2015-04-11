import java.lang.Math;

public class doMath {
	public static boolean isPrime(int Number) {
		int x = (int) Math.sqrt(Number);
		for (int i = 2; i < x; i++) {
			if (Number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isOdd(int Number) {
		if (Number % 2 == 0) {
			return false;
		}
		return true;
	}
	public static boolean isEven(int Number) {
		if (Number % 2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isSortedA(int[] a, int size) {
		for (int i = 0; i < size - 1; i++) {
			if (a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean isSortedD(int[] a, int size) {
		for (int i = 0; i < size -1; i++) {
			if (a[i] < a[i+1]) {
				return false;
			}
		}
		return true;
	}
}
