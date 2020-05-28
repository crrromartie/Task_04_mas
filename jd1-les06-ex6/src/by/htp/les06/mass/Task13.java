package by.htp.les06.mass;

public class Task13 {

	public static void task() {
		int z = 5;
		System.out.println("z = " + z);
		int m = 2;
		System.out.println("m = " + m);
		int l = 2;
		System.out.println("l = " + l);
		int n = 10;
		int counter = 0;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] % m == 0 && a[i] > l && a[i] < n) {
				counter++;
			}
		}
		System.out.println();
		System.out.println("Count = " + counter);
	}

}
