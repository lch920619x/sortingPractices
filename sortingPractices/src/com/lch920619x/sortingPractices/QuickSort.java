package com.lch920619x.sortingPractices;

public class QuickSort {
	public static int[] sort(int[] arr) {
		partition(arr, 0 , arr.length-1);
		System.out.println("\nArray sorted using QuickSort.");
		return arr;
	}
	private static void partition(int[]arr, int start, int end){
		if(end<=start) {
			return;
		}
		
		int pIndex= start;
		for(int i=start;i<end;i++) {
			if (arr[i]<arr[end]) {
				int temp = arr[i];
				arr[i]=arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		
		int temp = arr[end];
		arr[end]=arr[pIndex];
		arr[pIndex] = temp;
		
		partition(arr, start, pIndex-1);
		partition(arr, pIndex+1, end);
		
	}

}
