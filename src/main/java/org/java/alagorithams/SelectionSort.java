package org.java.alagorithams;

import java.util.Scanner;

public class SelectionSort {

	private int n;

	public void sort(int[] arr) {
		n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int max = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[max] > arr[j]) {
					max = j;
				}
			}
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;

		}

	}

	public void print(int[] arr) {
		n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int n;
		int arr[];
		SelectionSort bs = new SelectionSort();
		System.out.println("Enter How many Numbers :");
		n = new Scanner(System.in).nextInt();
		System.out.println("Enter " + n + " numbers ");
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("Before Sort Array : ");
		bs.print(arr);
		bs.sort(arr);
		System.out.println("\nAfter Sort Array : ");
		bs.print(arr);

	}

}
