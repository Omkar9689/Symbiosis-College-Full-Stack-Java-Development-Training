
import java.util.*;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of Equilateral Side ");
		int sideOfTriangle=sc.nextInt();
		
		double areaOfTriange= (Math.sqrt(3)/4)*Math.pow(sideOfTriangle,2);
		
		System.out.println("Area of Equilateral Triangle is :- "+areaOfTriange);
	}

}
