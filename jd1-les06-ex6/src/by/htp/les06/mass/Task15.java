package by.htp.les06.mass;

public class Task15 {

	public static void task() {
		int n = 10;
		double[] a = new double[n];

		Tool.initMasDouble(a);
		Tool.showMasDouble(a);

		System.out.println();
		
		double c = -1.5;
		System.out.println("c = " + c);
		double d = 4;
		System.out.println("d = " + d);
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > c && a[i] < d) {
				System.out.printf("%.2f   ", a[i]);
			}
		}
	}

}
