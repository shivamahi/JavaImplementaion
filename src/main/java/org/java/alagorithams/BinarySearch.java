package org.java.alagorithams;

import java.util.Scanner;

public class BinarySearch {
	
	private int n;
/**
 * Using BubbleSort Logic in Sorting the elements
 */
	public int[] sort(int[] arr) {
		n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++)
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
		}
		return arr;
	}

	public int searchElement(int[] arr, int l, int h, int ser) {
		if (l <= h) {
			int mid = l + (h - l) / 2;
			if (arr[mid] == ser)
				return mid;

			if (arr[mid] > ser)
				return searchElement(arr, l, mid, ser);
			else
				return searchElement(arr, mid + 1, h, ser);
		}
		return -1;
	}	
	public static void main(String[] args) {
		int n,ser;
		int arr[];
		BinarySearch binarySearch = new BinarySearch();
		System.out.println("Enter How many List Numbers :");
		n = new Scanner(System.in).nextInt();
		System.out.println("Enter " + n + " numbers ");
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
		/**
		 * Sorting The List of Elements
		 */
		arr = binarySearch.sort(arr);
		System.out.println("\nEnter which element you want Search  In List: ");
		ser = new Scanner(System.in).nextInt();
		
		/**
		 * Searching The Element
		 */
		int index = binarySearch.searchElement(arr, 0, n - 1, ser);
		if (index == -1)
			System.out.println("Your Searching Element Not Found In List");
		else
			System.out.println("Searching Element Is Found In Position : " + (index + 1));

	}

}
