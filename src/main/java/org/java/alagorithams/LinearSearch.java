package org.java.alagorithams;

import java.util.Scanner;

public class LinearSearch {
	int n;

	public int searchElement(int arr[], int ser) {
		n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == ser)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int n, ser;
		int arr[];
		LinearSearch linearSearch = new LinearSearch();
		System.out.println("Enter How many List Numbers :");
		n = new Scanner(System.in).nextInt();
		System.out.println("Enter " + n + " numbers ");
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("\nEnter which element you want Search : ");
		ser = new Scanner(System.in).nextInt();
		int index = linearSearch.searchElement(arr, ser);
		if (index == -1)
			System.out.println("Your Searching Element Not Found in  List");
		else
			System.out.println("Searching Elemnt Is Found In Position : " + (index+1));

	}

}
