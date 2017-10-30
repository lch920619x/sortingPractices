package com.lch920619x.sortingPractices;

import java.util.Scanner;

public class SortingPractices {
//add a comment 123
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter your array size: ");
		int arraySize = scanner.nextInt();	
		System.out.println("Enter your array range: ");
		int arrayRange = scanner.nextInt();
		
		int[] numbers= new int[arraySize];
		populateArray(numbers, arrayRange);
		
		
		
		System.out.println("Array before sorting:");
		for (int i=0; i< numbers.length; i++) {
			System.out.print(numbers[i]+",");
		}
		
		System.out.println("\nChoose your sorting method: ");
		
		int sortingMethod = 0;
		while (sortingMethod<1||sortingMethod>5) {
			System.out.println("1:Bubble 2:Insertion 3:Merge 4:Quick 5:Selection");

			sortingMethod = scanner.nextInt();
		}
		
		switch(sortingMethod) {
			case 1:
				BubbleSort.sort(numbers);
				break;
			case 2:
				InsertionSort.sort(numbers);
				break;
			case 3:
				numbers = MergeSort.sort(numbers);
				break;
			case 4:
				QuickSort.sort(numbers);
				break;
			case 5:
				SelectionSort.sort(numbers);
				break;
		}
		
		
		System.out.println("\nafter sorting:");
		
		for (int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]+",");
		}

	}
	
	public static void populateArray(int[]arr, int range) {
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*range);
		}
	}
	
}
