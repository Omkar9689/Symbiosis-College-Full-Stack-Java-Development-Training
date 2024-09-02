/*Java Program to demostrate various array opetations*/

import java.util.Scanner;

public class arrayAllOperations{
	
	
	static int[] sortedArray(int arr[]) {							//sort method (bubble sort)
		
		int temp;
		int arrSize=arr.length;
		for(int i=0;i<arrSize-1;i++) {
			for(int j=0;j<arrSize-i-1;j++) {
			
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {	//main method
		
		int arrSize,arraySum=0;
		float avgOfArrayElements;
		int[] arr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want to insert in array");
		arrSize = sc.nextInt();
		
		arr=new int[arrSize];
		
		System.out.println("One by one enter "+arrSize+" elments of Array");				
		
		for(int i=0;i<arrSize;i++){
			arr[i]=sc.nextInt();									//storing array elements
		}
		
		
		System.out.println("\n----------------Array Elements-----------");				
		for(int i=0;i<arrSize;i++){
			System.out.print("Element :- "+arr[i]+"\t");						//displaying array
			//arraySum +=arr[i];  we can use this statement to directly calculate sum of elements without using seperate loop
		}
		
		System.out.println();
		System.out.println("\n----------------Array Elements in Reverse Order-----------");
		for(int i=arrSize-1;i>=0;i--){
			System.out.print("Element :- "+arr[i]+"\t");						//displaying array in reverse order
		}

		for(int i=0;i<arrSize;i++){
			arraySum +=arr[i];									//adding array elements
		}
		System.out.println("\n\nSum of all Elements of array is "+arraySum);
		
		avgOfArrayElements = arraySum / arrSize;							//calculating average of array elements
		System.out.println("Average of Elements of array is "+avgOfArrayElements);			//dsiplaying average

		int minElement=arr[0],maxElement=arr[0];
		for(int i=0;i<arrSize-1;i++){
			if(arr[i]>arr[i+1]) {
				minElement=arr[i+1];								//finding minimum element
			}
			if(arr[i]<arr[i+1]) {
				maxElement=arr[i+1];								//finding maximun element
			}
		}
		
		System.out.println("Minimum element of Array is :- "+minElement);
		System.out.println("Maximun element of Array is :- "+maxElement);
		
		
		System.out.println("\n----------------Unsorted(Initial) Array-----------");
		for(int i=0;i<arrSize;i++){
			System.out.print("Element :- "+arr[i]+"\t");						//displaying initial unsorted array
		}

		arr=sortedArray(arr);										//calling sort method
		
		System.out.println("\n---------------------Sorted Array-------------------");
		for(int i=0;i<arrSize;i++){
			System.out.print("Element :- "+arr[i]+"\t");						//displaying sorted array
		}
		
	}

}
