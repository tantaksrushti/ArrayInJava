//print the element which are divisible by 3
import java.util.*;
class DivisibleByThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row size: ");
		int row = sc.nextInt();

		System.out.println("Enter column size: ");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter array elements: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Element divisible by 3 are: ");
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(arr[i][j]%3==0){
					System.out.print(arr[i][j]+ " ");
				}
			}
		}

		System.out.println();
	}
}
