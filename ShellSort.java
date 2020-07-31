package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ShellSort {

	public static void main(String[] args) {
		//int[] arr = new int[] {-2,4,1,-5,9,7,3,-6};
		//shellSort(arr);
		int[] brr = new int[80000];
		for(int i=0;i<brr.length;i++) {
			brr[i] = (int)(Math.random()*80000);
		}
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str1 = simpleDateFormat.format(date);
		System.out.println(str1);
		shellSort2(brr);
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str2 = simpleDateFormat2.format(date2);
		System.out.println(str2);
	}
	
	public static void shellSort(int[] arr) {
		int temp = 0;
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i++) {
				for(int j=i-gap;j>=0;j-=gap) {
					if(arr[j]>arr[j+gap]) {
						temp = arr[j];
						arr[j] = arr[j+gap];
						arr[j+gap] = temp;
					}
				}
			}
			//System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void shellSort2(int[] arr) {
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i++) {
				int j = i;
				int temp = arr[j];
				if(arr[j]<arr[j-gap]) {
					while(j-gap>=0&&temp<arr[j-gap]) {
						arr[j] = arr[j-gap];
						j -= gap;
					}
					arr[j] = temp;
				} 
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
	
}
