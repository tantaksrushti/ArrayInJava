// sum of each column in an array
import java.util.Scanner;
class sumOfcol{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row size: ");
		int row = sc.nextInt();

		System.out.println("Enter column size: ");
                int col = sc.nextInt();

		int[][] arr = new int[row][col];

		System.out.println("Enter element: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int j=0; j<row; j++){
			int colsum= 0;
			for(int i=0; i<col; i++){
				colsum += arr[i][j];
				
			}
			if(colsum!=0){
				System.out.println("Sum of column" +(j+1)+ "=" +colsum);
			}
		}
	}
}
