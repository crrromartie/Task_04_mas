package by.htp.les06.mass;

public class Task19 {

	public static void task() {

		int n = 10;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		System.out.println();
		int currentCount = 0;
		int mostOftenCount = 0;
		int frequentEl = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					currentCount++;
				}
			}

			if (currentCount == mostOftenCount) {

				if (a[i] < frequentEl) {
					frequentEl = a[i];
				}

			}

			if (currentCount > mostOftenCount) {
				mostOftenCount = currentCount;
				frequentEl = a[i];
			}

			currentCount = 0;
		}

		System.out.println("Element = " + frequentEl);

	}

}
