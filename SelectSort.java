package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SelectSort {

	public static void main(String[] args) {
		int[] arr = new int[] {-2,4,1,-5,9};
		int[] brr = new int[80000];
		for(int i=0;i<brr.length;i++) {
			brr[i] = (int)(Math.random()*80000);
		}
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str1 = simpleDateFormat.format(date);
		System.out.println(str1);
		selectSort(brr);
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str2 = simpleDateFormat2.format(date2);
		System.out.println(str2);
	}
	
	public static void selectSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			int min = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
	
}
