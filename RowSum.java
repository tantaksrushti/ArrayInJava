// Sum of each row
import java .util.Scanner;
class TwoDRowSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of row: ");
		int row = sc.nextInt();

		System.out.println("Enter size of column: ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		System.out.println("Enter elements: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
			       arr[i][j] = sc.nextInt();
			}
		}
                
                for(int i=0; i<row; i++){
			int rowSum = 0;
	                for(int j=0; j<col; j++){
				rowSum += arr[i][j];
			}

			System.out.println("Sum of row " +(i+1)+ "=" +rowSum);
		}
                
	}
}	
