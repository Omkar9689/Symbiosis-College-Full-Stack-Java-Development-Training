import java.util.*;
public class arrayExample {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of Array");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Stored Elements are:-");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
