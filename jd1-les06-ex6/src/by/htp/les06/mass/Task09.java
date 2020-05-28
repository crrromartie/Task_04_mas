package by.htp.les06.mass;

public class Task09 {

	public static void task() {
		int n = 10;
		double[] a = new double[n];

		Tool.initMasDouble(a);
		Tool.showMasDouble(a);

		double max = a[0];
		int imax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				imax = i;
			}
		}
		System.out.println();
		System.out.printf("Max = %.2f", max);
		
		double min = a[0];
		int imin = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				imin = i;
			}
		}
		System.out.println();
		System.out.printf("Max = %.2f", min);

		double b = a[imax];
		a[imax] = a[imin];
		a[imin] = b;

		System.out.println();
		Tool.showMasDouble(a);
	}

}
