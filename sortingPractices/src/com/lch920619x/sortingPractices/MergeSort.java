package com.lch920619x.sortingPractices;

public class MergeSort {
	public static int[] sort(int[] arr) {
		
		if (arr.length<=1) {
			return arr;
		}
		int []left = new int [arr.length/2];
		int []right = new int [arr.length-arr.length/2];
		for (int i=0; i<arr.length/2; i++) {
			left[i] = arr[i];
		}
		for (int i=0; i<arr.length-arr.length/2; i++) {
			right[i] = arr[i+arr.length/2];
		}
		arr = merge(sort(left),sort(right));
		
		System.out.println("\nArray sorted using MergeSort.");
		return arr;
	}
	
	public static int[] merge(int[] left, int [] right){
		int [] result = new int [left.length+right.length];
		int leftPointer = 0;
		int rightPointer = 0;
		for (int i=0; i<result.length; i++) {
			if (leftPointer>=left.length && rightPointer>=right.length) {
				break;
			}
			if (leftPointer>=left.length) {
				result[i]=	right[rightPointer];
				rightPointer++;
			}else if (rightPointer>=right.length) {
				result[i]=	left[leftPointer];
				leftPointer++;
			}
			else if (left[leftPointer] <= right[rightPointer]) {
				result[i]=	left[leftPointer];
				leftPointer++;
			}
			else{
				result[i]=	right[rightPointer];
				rightPointer++;
				//System.out.print("debug");
			}
		}

		return result;
		
	}
}
