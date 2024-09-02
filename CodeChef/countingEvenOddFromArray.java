/*Java program to count number of even and odd elements in the array */

import java.util.Scanner;

public class countingEvenOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arraySize,evenCount=0,oddCount=0,i;
		int arr[];
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<2;i++) {
			
			System.out.println("\n-------------------Start-----------------");
			System.out.println("Enter how many Elements");
			arraySize=sc.nextInt();
			
			arr = new int[arraySize];
			
			System.out.println("One by on enter "+arraySize+" elements of array");
			for(int j=0;j<arraySize;j++) {
				
				arr[j]=sc.nextInt();
				if(arr[j]%2==0) {
					evenCount++;
				}
				else{
					oddCount++;
				}
			}
			
			System.out.println("---------------Array------------------");
			for(int j=0;j<arraySize;j++) {
				System.out.println("Element "+(j+1)+" :- "+arr[j]+"\t");
			}
			
			System.out.println("---------------------------------------");
			
			System.out.println();
			System.out.println("Total EVEN elements in array is "+evenCount);
			System.out.println("Total ODD elements in array is "+oddCount);
			
		}
	}
}
