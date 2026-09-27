// print the product of sum of primary and secondary diagonals
import java .util.*;
class ProductSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row size: ");
		int row = sc.nextInt();

		System.out.println("Enter column size: ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		System.out.println("Enter elements: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		int primarysum =0;
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(i==j){
					primarysum += arr[i][j];
				}
			}
		}

		int secondarysum =0;
		int n = arr.length;
		for(int i=0; i<row; i++){
			secondarysum += arr[i] [n - 1 - i];
		} 

		int product = primarysum * secondarysum;

		System.out.println("Product of Sum of Primary and Secondary Diagonal: " +product);
	}
}

