package CollectionExamples;

import java.util.*;

public class UserDefinedList {
	
	public static void main(String[] args) {
		
		int choice,num;
		Scanner sc = new Scanner(System.in);
		List<Integer> list  = new ArrayList<Integer>();
		do {
			System.out.println("-----Menu----");
			System.out.println("1)Add More");
			System.out.println("2)Display All");
			System.out.println("3)Display Even");
			System.out.println("4)Display Odd");
			System.out.println("5)Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			ListIterator<Integer> li =list.listIterator();
			switch(choice){
				case 1:System.out.println("\nEnter Integer");
						list.add(sc.nextInt());
						break;
						
				case 2:System.out.println("\nDisplaying All Records");
						while(li.hasNext()) {
							System.out.println(li.next());
						}
						break;
						
				case 3:System.out.println("\nDsiplaying Even Numbers");
						while(li.hasNext()) {
							num=li.next();
							if(num%2==0)
								System.out.println(num);
						}
						break;
						
				case 4:System.out.println("\nDsiplaying Even Numbers");
						while(li.hasNext()) {
							num=li.next();
							if(num%2!=0)
								System.out.println(num);
						}
						break;
					
				default:System.out.println("Invalid Input or Exited");
			}
		}while(choice!=5);
	}
}
