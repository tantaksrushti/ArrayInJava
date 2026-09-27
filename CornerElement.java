// print corner elements of an array
import java.util.*;
class Corner{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size: ");
		int row = sc.nextInt();

		System.out.println("Enter column size: ");
		int col = sc.nextInt();

		int[][] arr = new int [row][col];

		System.out.println("Enter elements: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Corner elements are: ");

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if((i ==0 || i == row-1) && (j ==0 || j == col-1)){
					System.out.print(arr[i][j] + "  ");
				}
			}
		}

		System.out.println();
	}
}
