package by.htp.les06.mass;

public class Task03 {

	public static void task() {

		int n = 10;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		System.out.println();
		if (a[0] > 0) {
			System.out.println("Positive");
		} else if (a[0] < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

}
