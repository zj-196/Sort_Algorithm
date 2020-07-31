package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickSort {

	public static void main(String[] args) {
		//int[] arr = new int[] {-2,4,1,-5,9,-7,-20,14,2};
		//quickSort(arr, 0, arr.length-1);
		//System.out.println(Arrays.toString(arr));
		int[] brr = new int[8000000];
		for(int i=0;i<brr.length;i++) {
			brr[i] = (int)(Math.random()*8000000);
		}
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str1 = simpleDateFormat.format(date);
		System.out.println(str1);
		quickSort(brr,0, brr.length-1);
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str2 = simpleDateFormat2.format(date2);
		System.out.println(str2);
	}
	
	public static void quickSort(int[] arr,int left,int right) {
		int l = left;
		int r = right;
		int pivot = arr[(left+right)/2];
		int temp = 0;
		while(l<r) {
			while(arr[l]<pivot) {
				l++;
			}
			while(arr[r]>pivot) {
				r--;
			}
			if(l>=r) {
				break;
			}
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			if(arr[l] == pivot) {
				r--;
			}
			if(arr[r] == pivot) {
				l++;
			}
		}
		if(l == r) {
			l++;
			r--;
		}
		if(left<r) {
			quickSort(arr, left, r);
		}
		if(l<right) {
			quickSort(arr, l, right);
		}
	}
	
}
