package by.htp.les06.mass;

public class Task20 {

	public static void task() {
		int n = 10;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		int j = 0;
		for (int i = 0; i < a.length; i = i + 2) {
			a[j] = a[i];
			j++;
		}

		for (int i = j; i < a.length; i++) {
			a[i] = 0;
		}

		System.out.println();
		Tool.showMas(a);
//		int[] b = new int[n];
//		int j = 0;
//		for (int i = 0; i < a.length; i = i + 2) {
//			b[j] = a[i];
//			j++;
//		}
//
//		for (int i = j; i < a.length; i++) {
//			b[i] = 0;
//		}
//		System.out.println();
//
//		Tool.showMas(b);
	}

}
