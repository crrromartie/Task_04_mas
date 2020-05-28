package by.htp.les06.mass;

public class Task18 {

	public static void task() {
		int[] a = { 1, 4, 0, 0, 0, 0, 0, 0, 0, 0 };
		Tool.showMas(a);
		boolean flag = false;
		System.out.println();
		for (int i = 2; i < a.length; i++) {
			if (10 - a[i - 1] - a[i - 2] > 6 || 10 - a[i - 1] - a[i - 2] < 1) {
				flag = true;
			} else {
				a[i] = 10 - a[i - 1] - a[i - 2];
			}
		}
		if (flag == true) {
			System.out.println("No solutions");
		} else {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
