#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void fillArray(int ar[], int size, int min, int max);
void printArray(int ar[], int size);
void selectSort(int ar[], int size);
void bubbleSort(int ar[], int size);
void swap(int ar[], int i, int j);

int main() {
	int size = 25;
	int ar[size];
	int min = -23, max = 30;
	fillArray(ar, size, min, max);
	printArray(ar, size);
	//	selectSort(ar, size);
	bubbleSort(ar, size);
	printArray(ar, size);

	return 0;
}

void bubbleSort(int ar[], int size) {
	int i, j, flag;
	for (i = 0; i < size - 1; i++) {
		flag = 1;
		for (j = 0; j < size - 1 - i; j++) {
			if (ar[j] > ar[j + 1]){
				swap(ar, j, j + 1);
				flag = 0;
			}
		}
		if(flag == 1) return;
	}
}

void selectSort(int ar[], int size) {
	int i, j, min, min_i;
	for (i = 0; i < size - 1; i++) {
		min = ar[i];
		min_i = i;
		for (j = i + 1; j < size; j++) {
			if (ar[j] < min) {
				min = ar[j];
				min_i = j;
			}
		}
		if (min_i != i)
			swap(ar, i, min_i);

	}
}

void fillArray(int ar[], int size, int min, int max) {
	srand(time(NULL));
	int i;
	for (i = 0; i < size; i++) {
		ar[i] = min + rand() % (max + 1 - min);
	}
}

void printArray(int ar[], int size) {
	int i;
	for (i = 0; i < size; i++) {
		//		printf("%d - > ", i);
		printf("%d ", ar[i]);
	}
	printf("\n");
}

void swap(int ar[], int i, int j) {
	int temp = ar[i];
	ar[i] = ar[j];
	ar[j] = temp;
}
