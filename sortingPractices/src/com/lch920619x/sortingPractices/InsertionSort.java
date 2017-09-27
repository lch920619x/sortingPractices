package com.lch920619x.sortingPractices;

public class InsertionSort {
	public static int[] sort(int[] arr) {
		
		for (int i=1; i< arr.length; i++) {
			while (arr[i]<arr[i-1]) {
				int temp = arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
				i--;
				if (i==0) break;
			}
		}
		return arr;
	}
}
