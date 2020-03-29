package by.htp.lesX.sort;

public class Bubble {

	public static void main(String[] args) {
		int[] mas = { 2, 8, 3, 4, 9, 7, 6, 5, 3, 4 };
		for (int a : mas) {
			System.out.print(a + " ");
		}

			for (int i = 0; i < mas.length - 1; i++) {
				for (int j = (mas.length - 1); j >= (i + 1); j--) {
					if (mas[j] < mas[j - 1]) {
						int temp = mas[j];
						mas[j] = mas[j - 1];
						mas[j - 1] = temp;
					}
				}
			}
		System.out.println();
		for (int a : mas) {
			System.out.print(a + " ");
		}
	}
}