package by.htp.les06.mass;

public class Task08 {

	public static void task() {
		int n = 10;
		int countPos = 0;
		int countNeg = 0;
		int countZero = 0;
		double[] a = new double[n];

		Tool.initMasDouble(a);
		Tool.showMasDouble(a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				countPos++;
			} else if (a[i] < 0) {
				countNeg++;
			} else {
				countZero++;
			}
		}
		
		System.out.println();
		System.out.println("Positive = " + countPos);
		System.out.println("Negative = " + countNeg);
		System.out.println("Zero = " + countZero);
	}

}
