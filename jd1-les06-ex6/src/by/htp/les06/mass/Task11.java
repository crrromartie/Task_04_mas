package by.htp.les06.mass;

public class Task11 {

	public static void task() {
		int n = 10;
		int m = 5;
		System.out.println("m = " + m);
		int l = 3;
		System.out.println("l = " + l);
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % m == l) {
				if (l > 0 && l < m - 1) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}

}
