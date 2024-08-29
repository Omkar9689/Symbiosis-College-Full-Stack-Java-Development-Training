/*Java program to demonstrate method called by reference */


public class callByReference {
	
	int var1, var2;
	public callByReference(int var1, int var2) {				//object variables defined
		this.var1=var1;
		this.var2=var2;
		
	}
	
	static void callByRefrenceMethod(callByReference obj1) {	//method defined
		
		//object variable values are updated or modified permanently
		obj1.var1=10;
		obj1.var2=20;
	}
	
	void show() {
		System.out.println(" Var1 = "+var1+" & Var2 = "+var2);	//displaying the object variables
	}

	public static void main(String[] args) {
		
		int var1=2,var2=4;
		callByReference obj1 = new callByReference(var1, var2);
		
		System.out.println("Displaying initaialized values");
		obj1.show();											//displaying initialized values
		
		System.out.println("------------------Method called by reference-----------------");
		callByRefrenceMethod(obj1);								//method called by reference of class object
		
		System.out.println("---------------------------------------------------");
		System.out.println("Displaying values after calling method");
		obj1.show();											//displaying values after calling the method
	}

}
