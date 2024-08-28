
public class addElementsOf2DArrayUsingForeach {

	public static void main(String[] args) {
		
		int arry[][] = new int[3][5];
		int sum = 0;
		
		for(int i=0 ; i < 3 ; i++) {
			for(int j=0 ; j < 5 ;j++)
			{
				arry[i][j] = ( i + 1 ) * ( j + 1);
			}
		}
		
		System.out.println("Our 2D Array is ");
		for(int x[]:arry) {
			
			for(int y:x) {
				System.out.print("|\t"+y+"\t");
			}
			System.out.print("|\n");
				
		}
		
		
		System.out.println("----------------------------------------------------------------");
		for(int x[]:arry) {
			
			for(int y:x) {
				System.out.println("Value = "+y);
				sum +=y;
			}
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Sum of All Elements = "+sum);
	}

}
