/* Java program to demonstrate swap without 3rd Variable using call by value and call by reference */

public class swapWithout3rdVar {
	int var_1,var_2;
	
	public swapWithout3rdVar(int var_1, int var_2) {
		super();
		this.var_1 = var_1;
		this.var_2 = var_2;
	}
	
	void show() {
		System.out.println("Variable 1 :- "+var_1);
		System.out.println("Variable 2 :- "+var_2);
	}
	
	static void swapCallByReference(swapWithout3rdVar obj) {
		obj.var_1 = obj.var_1 + obj.var_2;
		obj.var_2 = obj.var_1 - obj.var_2;
		obj.var_1 = obj.var_1 - obj.var_2;
		
	}
	
	static void swapCallByValue(int var1,int var2) {
		var1=var1+var2;
		var2=var1-var2;
		var1=var1-var2;
		System.out.println("Method called by value, therefore scope of swapped variables is valid till this method");
		System.out.println("Variable 1 :- "+var1);
		System.out.println("Variable 2 :- "+var2);
		return;
	}
	public static void main(String args[]) {
		
		int var1=10,var2=20;
		
		System.out.println("Calling swap method by using call by value");
		swapCallByValue(var1, var2);
		
		System.out.println("\n----------------------------------------------------------------------\n");
		
		System.out.println("After calling swap method the value of variables remained unchanged in main method");
		System.out.println("Variable 1 :- "+var1);
		System.out.println("Variable 2 :- "+var2);
		
		System.out.println("\n----------------------------------------------------------------------\n");
		
		swapWithout3rdVar obj = new swapWithout3rdVar(var1, var2);
		System.out.println("Before Swapping , Values ");
		obj.show();
		System.out.println("Calling swap method by using call by reference of object");
		swapCallByReference(obj);
		System.out.println("After calling swap method the value of variables got swapped for the object");
		obj.show();
		
	}

}
