
public class jaggedArrayExample {

	public static void main(String[] args) {
		
		int array1[][] = new int[4][];
		
		array1[0] = new int[] {1,2,3,4};
		
		array1[1] = new int[] {1,2,};
		
		array1[2] = new int[] {1,2,3,4,5,6,7};
		
		array1[3] = new int[] {1,2};

		System.out.println("-----------Jagged Array-----------\n");
		for(int i=0 ; i < array1.length ; i++) {
			
			for(int j=0; j < array1[i].length ; j++) {
				
				System.out.print("|\t"+array1[i][j] + "\t");
			}
			System.out.print("|\n");
		}
	}

}
