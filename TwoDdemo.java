import java .io.*;
class TwODArray{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter array row: ");
		int row = Integer.parseInt(br.readLine());

		System.out.println("Enter array column: ");
                int column = Integer.parseInt(br.readLine());

		int arr[][] = new int[row][column];

		System.out.println("Enter array element: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
			arr[i][j]= Integer.parseInt(br.readLine());
			}
		}

		System.out.println("Array is: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				System.out.print(arr[i][j]+ "  ");
			
			}

			System.out.println();
		} 
	}
}
