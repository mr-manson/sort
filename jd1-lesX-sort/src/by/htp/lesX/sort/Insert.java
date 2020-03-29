package by.htp.lesX.sort;

public class Insert {

	public static void main(String[] args) {
		int[] mas = { 2, 8, 3, 4, 9, 7, 6, 5, 3, 4 };
		for (int a : mas) {
			System.out.print(a + " ");
		}
		
		int key = 0;
		int i = 0;
		for(int j = 1; j < mas.length; j++) {
			key = mas[j];
			i = j - 1;
			while(i >= 0 && mas[i] > key) {
				mas[i + 1] = mas[i];
				i = i - 1;
				mas[i + 1] = key;
			}
		}
		System.out.println();
		for (int a : mas) {
		System.out.print(a + " ");
		}
	}

}
