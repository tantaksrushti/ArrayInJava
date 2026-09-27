//print sum of secondary diagonal
import java.util.*;
class secondaryDiagonal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row size: ");
		int row = sc.nextInt();

		System.out.println("Enter column size: ");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter array element: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		int sum = 0;
		int n = arr.length;
		for(int i=0; i<row; i++){
			sum += arr[i][n-1-i];
		}

		System.out.println("Sum of secondary sum " +sum);
	}
}
