#include<stdio.h>
void up(int size);
void middle(int size);
void down(int size);
void drawStar(int size);


int main() {

	int size = 5;
	drawStar(size);

	return 0;
}

void drawStar(int size) {
	if (size % 2 == 0) {
		printf("Введите нечетное число (для красивых уголков в звезде)");
		return;
	}

	up(size);
	middle(size);
	down(size);
}

void up(int size) {
	int i, j;
	for (i = size / 2 + 1; i <= size; i++) {
		for (j = 1; j <= 2 * size; j++) {
			if (size + i == j || i == (2 * size - j + 1)) {
				printf("* ");
			} else
				printf("  ");
		}
		printf("\n");
	}
}
void middle(int size) {
	int i, j;
	for (i = 1; i <= size; i++) {
		for (j = 1; j <= size * 3; j++) {
			if (i == 1 || i == size || i == j || i == (size - j + 1) || j
					== (size - i + 1) || j == (3 * size - i + 1) || 2 * size
					+ i == j) {
				printf("* ");
			} else
				printf("  ");
		}
		printf("\n");
	}
}

void down(int size) {
	int i, j;
	for (i = size / 2 + 1; i <= size; i++) {
		for (j = 1; j <= 2 * size; j++) {
			if (j == (size / 2 + i + 1) || i == (2 * size - j + size / 2 + 1)) {
				printf("* ");
			} else
				printf("  ");
		}
		printf("\n");
	}
}
