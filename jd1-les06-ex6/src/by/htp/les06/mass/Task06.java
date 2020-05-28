package by.htp.les06.mass;

public class Task06 {

	public static void task() {
		int n = 10;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println();
		System.out.println("Max = " + max);
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min = " + min);

		int d = 0;

		if (min >= 0 && max >= 0) {
			d = max - min;
		}
		if (min < 0 && max >= 0) {
			d = max + (int) Math.abs(min);
		}
		if (min < 0 && max < 0) {
			d = (int) Math.abs(min) - (int) Math.abs(max);
		}
		System.out.println("Rez = " + d);

	}

}
