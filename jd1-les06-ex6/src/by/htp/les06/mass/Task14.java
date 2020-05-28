package by.htp.les06.mass;

public class Task14 {

	public static void task() {
		int n = 10;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);
		
		System.out.println();
		int max = a[1];
		for (int i = 1; i < a.length; i = i + 2) {
			System.out.print(a[i] + " ");
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println();
		int min = a[0];
		for (int i = 0; i < a.length; i = i + 2) {
			System.out.print(a[i] + " ");
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println();
		System.out.println("Rez = " + (max + min));
	}

}
