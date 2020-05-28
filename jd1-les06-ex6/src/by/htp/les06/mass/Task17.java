package by.htp.les06.mass;

public class Task17 {

	public static void task() {
		int n = 10;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println();
		System.out.println("Min = " + min);

		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				counter++;
			}
		}

		int m = n - counter;

		int[] b = new int[m];
		int j = 0;
		while (m > 0) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != min) {
					b[j] = a[i];
					j++;
					m--;
				}
			}
		}

		Tool.showMas(b);

	}

}
