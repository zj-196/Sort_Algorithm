package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {

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
		bubbleSort(brr);
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str2 = simpleDateFormat2.format(date2);
		System.out.println(str2);
	}
	
	public static void bubbleSort(int[] arr) {
		int temp;
		boolean flag = false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!flag) {
				break;
			}else {
				flag = false;
			}
			//System.out.println(Arrays.toString(arr));
		}
	}
	
}
