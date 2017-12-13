package org.java.alagorithams;

import java.util.Scanner;

public class InserstionSort {
	private int n;

	public void sort(int[] arr) {
		n = arr.length;
		for (int i = 1; i < n; i++) {
			int j = i, index = arr[i];
			while (j > 0 && arr[j - 1] > index) {
				int temp = arr[j]; // or arr[j]=arr[j-1];
				arr[j] = arr[j - 1]; // j--;
				arr[j - 1] = temp; // }
				j--; // a[j]=index
			}
		}

	}

	public void print(int[] arr) {
		n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {
		InserstionSort inserstionSort = new InserstionSort();
		int n;
		int arr[];
		System.out.println("Enter How many Numbers :");
		n = new Scanner(System.in).nextInt();
		System.out.println("Enter " + n + " numbers ");
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("Before Sort Array : ");
		inserstionSort.print(arr);
		inserstionSort.sort(arr);
		System.out.println("\nAfter Sort Array : ");
		inserstionSort.print(arr);

	}

}
