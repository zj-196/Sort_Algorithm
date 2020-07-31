package tree;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HeapSort {

	public static void main(String[] args) {
		//int[] arr = {4,6,8,5,9};
		//heapSort(arr);
		int[] brr = new int[8000000];
		for(int i=0;i<brr.length;i++) {
			brr[i] = (int)(Math.random()*8000000);
		}
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str1 = simpleDateFormat.format(date);
		System.out.println(str1);
		heapSort(brr);
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str2 = simpleDateFormat2.format(date2);
		System.out.println(str2);
	}
	
	public static void heapSort(int[] arr) {
		int temp;
//		adjustHeap(arr, 1, arr.length);
//		System.out.println(Arrays.toString(arr));
//		adjustHeap(arr, 0, arr.length);
//		System.out.println(Arrays.toString(arr));
		for(int i=arr.length/2-1;i>=0;i--) {
			adjustHeap(arr, i, arr.length);
		}
		for(int j=arr.length-1;j>0;j--) {
			temp=arr[j];
			arr[j]=arr[0];
			arr[0]=temp;
			adjustHeap(arr, 0, j);
		}
		//System.out.println(Arrays.toString(arr));
	}
	
	public static void adjustHeap(int[] arr,int i,int len) {
		int temp = arr[i];
		for(int k=2*i+1;k<len;k=k*2+1) {
			if(k+1<len&&arr[k]<arr[k+1]) {
				k++;
			}
			if(arr[k]>temp) {
				arr[i]=arr[k];
				i=k;
			}else {
				break;
			}
		}
		arr[i]=temp;
	}
	
}
