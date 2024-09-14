package CollectionExamples;
import java.util.*;

public class CollectionBasicOperations {

	public static void main(String[] args) {
		
		int choice,num;
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list  = new LinkedList<Integer>();
		do {
			System.out.println("-----Menu----");
			System.out.println("1)Add Element");
			System.out.println("2)Remove Element");
			System.out.println("3)Search List");
			System.out.println("4)Sort");
			System.out.println("5)Display List");
			System.out.println("6)Display List(Reverse Order)");
			System.out.println("7)Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			ListIterator<Integer> li =list.listIterator();
			
			switch(choice){
				case 1:System.out.println("\nEnter Integer");
						list.add(sc.nextInt());
						break;
						
				case 2:System.out.println("Enter index to Remove Element");
						num=sc.nextInt();
						list.remove(num);
						System.out.println("Removed");
						System.out.println(list);
						break;
					
				case 3:for(int i=0;i<list.size();i++) {
						
					}
						
				
						
				case 4:System.out.println("\nDsiplaying Even Numbers");
						while(li.hasNext()) {
							num=li.next();
							if(num%2!=0)
								System.out.println(num);
						}
						break;
					
				default:System.out.println("Invalid Input or Exited");
			}
		}while(choice>0);

	}

}
