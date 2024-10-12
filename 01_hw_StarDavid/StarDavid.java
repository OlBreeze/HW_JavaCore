package lesson1;

public class StarDavid {

	public static void main(String[] args) {
		int size = 3;
		drawStar(size);

		

	}
	static void drawStar(int size) {
		if (size % 2 == 0) {
			System.out.println("Enter an odd number (for beautiful corners in the star)"); //Введите нечетное число (для красивых уголков в звезде)
			return;
		}

		up(size);
		middle(size);
		down(size);
	}

	static void up(int size) {
		int i, j;
		for (i = size / 2 + 1; i <= size; i++) {
			for (j = 1; j <= 2 * size; j++) {
				if (size + i == j || i == (2 * size - j + 1)) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
	static void middle(int size) {
		int i, j;
		for (i = 1; i <= size; i++) {
			for (j = 1; j <= size * 3; j++) {
				if (i == 1 || i == size || i == j || i == (size - j + 1) || j
						== (size - i + 1) || j == (3 * size - i + 1) || 2 * size
						+ i == j) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}

	static void down(int size) {
		int i, j;
		for (i = size / 2 + 1; i <= size; i++) {
			for (j = 1; j <= 2 * size; j++) {
				if (j == (size / 2 + i + 1) || i == (2 * size - j + size / 2 + 1)) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
}
