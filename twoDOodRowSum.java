//print the sum of odd rows
import java.util.Scanner;
class oddRowSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row size: ");
		int row = sc.nextInt();

		System.out.println("Enter column size: ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		System.out.println("Enter Element: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<row; i++){
				int oddSum = 0;
				for(int j=0; j<col; j++){
				if((i+1)%2!=0){
					oddSum+= arr[i][j];
				}
			}
			if(oddSum!=0){
			System.out.println("Sum of row" +(i)+ "=" +oddSum);
			}
		}
	}
}
