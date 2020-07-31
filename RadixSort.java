package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class RadixSort {

	public static void main(String[] args) {
		//int[] arr = {8,4,5,7,1,3,6,2};
		//radixSort(arr);
		int[] brr = new int[20000000];
		for(int i=0;i<brr.length;i++) {
			brr[i] = (int)(Math.random()*20000000);
		}
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str1 = simpleDateFormat.format(date);
		System.out.println(str1);
		radixSort(brr);
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str2 = simpleDateFormat2.format(date2);
		System.out.println(str2);
	}
	
	public static void radixSort(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int len = String.valueOf(max).length();
		int[][] bucket = new int[10][arr.length];
		int[] bucketCount = new int[10];
		for(int i=0,k=1;i<len;i++,k*=10) {
			for(int j=0;j<arr.length;j++) {
				int digit = arr[j]/k%10;
				bucket[digit][bucketCount[digit]] = arr[j];
				bucketCount[digit]++;
			}
			int index = 0;
			for(int j=0;j<bucket.length;j++) {
				if(bucketCount[j] != 0) {
					for(int s=0;s<bucketCount[j];s++) {
						arr[index] = bucket[j][s];
						index++;
					}
				}
				bucketCount[j] = 0;
			}
			//System.out.println(Arrays.toString(arr));
		}
	}
	
}
