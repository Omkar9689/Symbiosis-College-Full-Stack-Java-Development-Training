
public class Call {
	public static void main(String args[])
	{
		Myclass a=new Myclass();
		Myclass b= new Myclass();
		example(x,y);
	}
}

class Myclass{
	 int a;
	 int b;
	 int c;
	 Myclass()//default constructed
	 {
		a=10;    
		b=20;
		c = a+b;
		
		System.out.println("A="+ a);
		System.out.println("b="+ b);
//		System.out.print("sum of="+ a,b);
		
	 }
	 Myclass(int x,int y)
	 {
		 this.a = x;
		 this.b = y;
	 }
	public static void example(int x,int y)
	{
		x++;
		y++;
		System.out.print("the value of=" + y);
		System.out.print("the value of=" + x);
		
	}
	public void Myclass1(Myclass obj)
	{
		obj.a += 30;
		obj.b += 40;
	}
}

