//Java Program for Two Sum
/* We have an array and we have given a target value
we have to find 2 index in the array of which the taregt is accheived by adding the values at that index */

import java.util.*;

public class twoSum {

	public static void main(String[] args) {
		int arr[] = new int[] {2,7,11,15};
		int index1=0,index2=0,target;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Target");
		target=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if((arr[i]+arr[j])==target) {
					index1=i;
					index2=j;
				}
			}
		}
		
		if(index1 == 0 && index2==0) {
			System.out.println("Does not Exists");
		}
		else {
			System.out.println("Index 1 :- "+index1);
			System.out.println("Index 2 :- "+index2);
		}

	}

}
