package com.lch920619x.sortingPractices;

public class sortingPractices {

	public static void main(String[] args) {
		int[] numbers= new int[50000];
		populateArray(numbers);
		
		System.out.println("before sorting:");
		for (int i=0; i< numbers.length; i++) {
			System.out.print(numbers[i]+",");
		}
		
		numbers = bubbleSort(numbers);
		
		System.out.println("\nafter sorting:");
		
		for (int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]+",");
		}

	}
	
	public static void populateArray(int[]arr) {
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*1000);
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		int isChangeMade = 1;
		
		while (isChangeMade == 1) {
			isChangeMade = 0;
		for (int i=0; i< arr.length-1; i++) {
			
			if (arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				isChangeMade = 1;
			}
			
		}
		}
		return arr;
	}
}
