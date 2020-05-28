package by.htp.les06.mass;

public class Task10 {

	public static void task() {
		int n = 10;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);
		
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i + 1) {
				System.out.print(a[i] + " ");
			}

		}
	}

}
