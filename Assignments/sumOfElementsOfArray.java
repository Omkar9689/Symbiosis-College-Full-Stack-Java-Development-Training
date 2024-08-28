import java.util.Scanner;

public class sumOfElementsOfArray {

	public static void main(String[] args) {
		int[] arr=new int[5];
		int arraySum=0,arr_max=0;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the elements of Array");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter element for Array");
			arr[i]=sc.nextInt();
		}
		System.out.println("\n----------------Stored Elements-----------");
		for(int i=0;i<5;i++)
		{
			System.out.print("Element :- "+arr[i]+"\t");
			arraySum +=arr[i];
		}
		
		System.out.println("\n\nSum of all Elements of array is "+arraySum);
		
		System.out.println("\n----------------Stored Elements in Reverse Order-----------");
		for(int i=4;i>=0;i--)
		{
			System.out.print("Element :- "+arr[i]+"\t");
		}
		
		for(int i=0;i>5;i++)
		{
			if(arr_max<arr[i])
			{
				arr_max=arr[i];
			}
		}
		

	}

}
