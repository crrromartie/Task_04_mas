package by.htp.les06.mass;

public class Tool {

	public static void initMas(int mas[]) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 21 - 10);
		}
	}

	public static void showMas(int mas[]) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static void initMasDouble(double mas[]) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (Math.random() * 21 - 10);
		}
	}

	public static void showMasDouble(double mas[]) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%.2f   ", mas[i]);
		}
	}

}
