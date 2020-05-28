package by.htp.les06.mass;

public class Task16 {

	public static void task() {
		int n = 10;
		double[] a = new double[n];
		
		Tool.initMasDouble(a);
		Tool.showMasDouble(a);
		
		System.out.println();
		double max = a[0] + a[n - 1];
		int imax = 0;
		int jmax = n - 1;
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			if (a[i] + a[j] > max) {
				max = a[i] + a[j];
				imax = i;
				jmax = j;
			}
		}
		System.out.printf("Max = %.2f\nFirst number = %.2f\nSecond namber = %.2f\n", max, a[imax], a[jmax]);
		System.out.println("Serial number first = " + (imax + 1));
		System.out.println("Serial number first = " + (jmax + 1));
	}

}
