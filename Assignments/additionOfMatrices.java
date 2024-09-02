/* Java program for addition of 2 matrices (demonstration of 2D array) */

import java.util.*;

public class additionOfMatrices{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,m;		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many rows");
		n=sc.nextInt();
		
		System.out.println("Enter how many columns");
		m=sc.nextInt();
		
		int[][] matrix1 = new int[n][m];
		int[][] matrix2 = new int[n][m];
		int[][] matrix3 = new int[n][m];
		
		System.out.println("Enter the contents of first matirx");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the contents of second matirx");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix Stored Are");
		System.out.println("-----------------First Matrix--------------");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("-----------------Second Matrix--------------");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("-----------------Addition of Both Matrix--------------");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(matrix3[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
