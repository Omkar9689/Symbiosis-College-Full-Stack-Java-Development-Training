package CollectionExamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortingExample {
	
	
	public static void sort_array() {
		int [] arr = new int[] {5,6,8,3,2,1,4,9,11,56,66,7,88,22,-1,-8,-9,-6};
		System.out.println("Sorting Array......");
		Arrays.sort(arr);
		System.out.println("Array in ascending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	
	public static void sort_withoutMethod() {
		
		int temp,i,j;
		Integer arr[] = {5,6,8,3,2,1,4,9,11,56,66,7,88,22,-1,-8,-9,-6};
		System.out.println("Sorting Array.....");
		
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++)
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		System.out.println("Array in Reverse order");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------Sorting with Sort Method-----------------");
		sort_array();
		System.out.println("--------------Sorting without Method-----------------");
		sort_withoutMethod();

	}

}
