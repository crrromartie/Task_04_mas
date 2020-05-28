package by.htp.les06.mass;

public class Task07 {

	public static void task() {
		int n = 10;
		double z = 4.0;
		System.out.println("Z = " + z);
		int counter = 0;
		double[] a = new double[n];

		Tool.initMasDouble(a);
		Tool.showMasDouble(a);

		System.out.println();

		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				counter++;
			}
		}

		Tool.showMasDouble(a);

		System.out.println();
		System.out.println("Count = " + counter);

	}

}
