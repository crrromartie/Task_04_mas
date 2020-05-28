package by.htp.les06.mass;

public class Task02 {

	public static void task() {

		int n = 10;
		int amount = 0;
		int[] a = new int[n];

		Tool.initMas(a);
		Tool.showMas(a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				amount++;
			}
		}
		
		System.out.println();
		if (amount == 0) {
			System.out.println("No zero");
			return;
		}

		int[] b = new int[amount];
		int j = 0;
		while (amount > 0) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 0) {
					b[j] = i + 1;
					j++;
					amount--;
				}
			}
		}

		Tool.showMas(b);

	}

}
