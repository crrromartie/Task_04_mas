package by.htp.les06.mass;

public class Task12 {

	public static void task() {
		int n = 10;
		double sum = 0.0;
		double[] a = new double[n];
		
		Tool.initMasDouble(a);
		Tool.showMasDouble(a);
		
		for (int i = 0; i < a.length; i++) {
			if (isPrime(i + 1)) {
				sum += a[i];
			}
		}
		
		System.out.println();
		System.out.printf("Sum = %.2f", sum);

	}

	public static boolean isPrime(int x) {
		if (x == 1) {
			return false;
		}
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
