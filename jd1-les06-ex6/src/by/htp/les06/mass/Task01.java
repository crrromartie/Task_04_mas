package by.htp.les06.mass;

public class Task01 {

	public static void task() {

		int n = 10;
		int k = 2;
		System.out.println("k = " + k);
		int sum = 0;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}
		System.out.println();
		if (sum > 0) {
			System.out.println("Sum = " + sum);
		} else {
			System.out.println("No even element");
		}

	}

}
