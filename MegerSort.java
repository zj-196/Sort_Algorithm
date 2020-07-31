package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MegerSort {

	public static void main(String[] args) {
		//int[] arr = {8,4,5,7,1,3,6,2};
		//int[] temp = new int[arr.length];
		//megerSort(arr, 0, arr.length-1, temp);
		//System.out.println(Arrays.toString(arr));
		int[] brr = new int[8000000];
		int[] temp = new int[brr.length];
		for(int i=0;i<brr.length;i++) {
			brr[i] = (int)(Math.random()*8000000);
		}
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str1 = simpleDateFormat.format(date);
		System.out.println(str1);
		megerSort(brr, 0, brr.length-1, temp);
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str2 = simpleDateFormat2.format(date2);
		System.out.println(str2);
	}
	
	public static void megerSort(int[] arr,int left,int right,int[] temp) {
		if(left<right) {
			int mid = (left+right)/2;
			megerSort(arr, left, mid, temp);
			megerSort(arr, mid+1, right, temp);
			meger(arr, left, right, mid, temp);
		}
	}
	
	public static void meger(int[] arr,int left,int right,int mid,int[] temp) {
		int i = left;
		int j = mid + 1;
		int t = 0;
		while(i<=mid&&j<=right) {
			if(arr[i]<=arr[j]) {
				temp[t] = arr[i];
				i++;
				t++;
			}else {
				temp[t] = arr[j];
				j++;
				t++;
			}
		}
		while(i<=mid) {
			temp[t] = arr[i];
			i++;
			t++;
		}
		while(j<=right) {
			temp[t] = arr[j];
			j++;
			t++;
		}
		t=0;
		int tempLeft = left;
		while(tempLeft<=right) {
			arr[tempLeft] = temp[t];
			t++;
			tempLeft++;
		}
	}
	
}
