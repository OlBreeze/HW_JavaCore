#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void fillArray(int ar[], int size, int min, int max);
void printArray(int ar[], int size);
void swap(int ar[], int i, int j);
void sortReverse(int ar[], int size);
void sortInRange(int ar[], int size, int start, int finish);
void evenFirst(int ar[], int size);
void evenFirstAdv(int ar[], int size);

int main() {
	int size = 25;
	int ar[size];
	int min = -20, max = 34;
	fillArray(ar, size, min, max);
	printArray(ar, size);
	sortReverse(ar, size);
	printArray(ar, size);
	int start = 10, finish = 15;
	sortInRange(ar, size, start, finish);
	printArray(ar, size);
//	evenFirst(ar, size);
	evenFirstAdv(ar, size);
	printArray(ar, size);

	return 0;
}

void evenFirstAdv(int ar[], int size) {
	int i, j, flag;
	for (i = 0; i < size - 1; i++) {
		flag = 1;
		for (j = 0; j < size - 1 - i; j++) {
			if ((ar[j]%2!=0 && ar[j+1]%2==0)
					||(ar[j]%2==0 && ar[j+1]%2==0 && ar[j]>ar[j+1])
					||(ar[j]%2!=0 && ar[j+1]%2!=0 && ar[j]<ar[j+1])) {
				swap(ar, j, j + 1);
				flag = 0;
			}
		}
		if (flag == 1)
			return;
	}
}

void evenFirst(int ar[], int size) {
	int i, j, flag;
	for (i = 0; i < size - 1; i++) {
		flag = 1;
		for (j = 0; j < size - 1 - i; j++) {
			if (ar[j] % 2 != 0 && ar[j + 1] % 2 == 0) {
				swap(ar, j, j + 1);
				flag = 0;
			}
		}
		if (flag == 1)
			return;
	}
}
void sortInRange(int ar[], int size, int start, int finish) {
	if (start < 0 || finish >= size || start > finish) {
		printf("Wrong range\n");
		return;
	}
	int i, j, flag;
	for (i = 0; i < size - 1; i++) {
		flag = 1;
		for (j = start; j < finish - i; j++) {
			if (ar[j] > ar[j + 1]) {
				swap(ar, j, j + 1);
				flag = 0;
			}
		}
		if (flag == 1)
			return;
	}
}

void sortReverse(int ar[], int size) {
	int i, j, flag;
	for (i = 0; i < size - 1; i++) {
		flag = 1;
		for (j = 0; j < size - 1 - i; j++) {
			if (ar[j] < ar[j + 1]) {
				swap(ar, j, j + 1);
				flag = 0;
			}
		}
		if (flag == 1)
			return;
	}
}

void bubbleSort(int ar[], int size) {
	int i, j, flag;
	for (i = 0; i < size - 1; i++) {
		flag = 1;
		for (j = 0; j < size - 1 - i; j++) {
			if (ar[j] > ar[j + 1]) {
				swap(ar, j, j + 1);
				flag = 0;
			}
		}
		if (flag == 1)
			return;
	}
}

void swap(int ar[], int i, int j) {
	int temp = ar[i];
	ar[i] = ar[j];
	ar[j] = temp;
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
