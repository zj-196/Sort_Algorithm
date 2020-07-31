package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertSort {

	public static void main(String[] args) {
		//int[] arr = new int[] {-2,4,1,-5,9};
		//insertSort(arr);
		int[] brr = new int[80000];
		for(int i=0;i<brr.length;i++) {
			brr[i] = (int)(Math.random()*80000);
		}
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str1 = simpleDateFormat.format(date);
		System.out.println(str1);
		insertSort(brr);
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str2 = simpleDateFormat2.format(date2);
		System.out.println(str2);
	}
	
	public static void insertSort(int[] arr) {
		int insertValue;
		int insertIndex;
		for(int i=1;i<arr.length;i++) {
			insertValue = arr[i];
			insertIndex = i-1;
			while(insertIndex>=0&&insertValue<arr[insertIndex]) {
				arr[insertIndex+1] = arr[insertIndex];
				insertIndex--;
			}
			arr[insertIndex+1] = insertValue;
		}
		//System.out.println(Arrays.toString(arr));
	}
	
}
