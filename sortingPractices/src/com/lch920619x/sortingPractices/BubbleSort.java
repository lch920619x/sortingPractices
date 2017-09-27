package com.lch920619x.sortingPractices;

public class BubbleSort {
	public static int[] sort(int[] arr) {
		
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
