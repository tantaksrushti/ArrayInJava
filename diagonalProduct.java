//print the product of the primary diagonal of an array
import java.util.Scanner;
class Diagonal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row size: ");
		int row = sc.nextInt();

		System.out.println("Enter column size: ");
		int col = sc.nextInt();

		int arr[][] = new int [row][col];

		System.out.println("Enter array element: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		int pro =1;

		System.out.println("Product of primary diagonal : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(arr[i]==arr[j]){
					pro *= arr[i][j];
				}
			}
		}

		System.out.println(pro);
	}
}

