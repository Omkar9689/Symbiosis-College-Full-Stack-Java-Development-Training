import java.util.*;
public class swapWithout3rdVariable {
	
	int var1,var2;
	swapWithout3rdVariable(int var1,int var2){				//parameterized constructor
		this.var1= var1;
		this.var2= var2;
	}
	
	void swap() {
		
		/* logic for swapping 
		 	1)We store sum of variable 1 and variable 2 in variable 1 i.e v1 = v1 + v2  
		 	2)We subtract variable 2 from variable 1 and stores it in variable i.e  v2 = v1 - v2
		 	3)We subtract variable 2 from variable 1 and stores it in variable 1 i.e v1 = v1 - v2
		 */
		var1 = var1 + var2;
		var2 = var1 - var2;
		var1 = var1 - var2;
	}
	
	void show() {
		
		System.out.println("Variable 1 = "+var1);
		System.out.println("Variable 2 = "+var2);
	}

	public static void main(String[] args) {
		
		int var_1,var_2;
		swapWithout3rdVariable obj1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Variable");
		var_1 = sc.nextInt();
		
		System.out.println("Enter Second Variable");
		var_2 = sc.nextInt();
		
		obj1= new swapWithout3rdVariable(var_1,var_2);
		
		System.out.println("-------------Variables before Swapping-----------");
		obj1.show();
		
		System.out.println("-------------Variables after Swapping-----------");
		obj1.swap();
		obj1.show();
		
	}

}
