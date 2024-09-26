
import java.util.*;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[];
		int n,evenCount=0,oddCount=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers");
		n=sc.nextInt();
		
		arr = new int[n];

		for(int i=0;i<n;i++) {
			System.out.println("Enter Element");
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		System.out.println("Even numbers in array is :- "+evenCount);
		System.out.println("Odd numbers in array is :- "+oddCount);
	}

}
