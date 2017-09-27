package com.lch920619x.sortingPractices;

public class sortingPractices {

	public static void main(String[] args) {
		int[] numbers= new int[50000];
		populateArray(numbers);
		
		System.out.println("before sorting:");
		for (int i=0; i< numbers.length; i++) {
			System.out.print(numbers[i]+",");
		}
		
		bubbleSort sort1 = new bubbleSort();
		numbers = sort1.sort(numbers);
		
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
	
}