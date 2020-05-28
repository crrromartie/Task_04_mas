package by.htp.les06.mass;

public class Task04 {

	public static void task() {
		int counter = 0;
		int n = 4;
		double[] a = new double[n];

		Tool.initMasDouble(a);
		Tool.showMasDouble(a);

		System.out.println();
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] >= a[i + 1]) {
				counter++;
			}
		}
	
		if (counter == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
