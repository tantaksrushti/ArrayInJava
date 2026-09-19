import java.util.Scanner;
class EvenNoCount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arrSize = input.nextInt();

		int arr[] = new int[arrSize];

		int  Array=0;
                int evenCount = 0;
		boolean flag = false;

		System.out.println("Enter array element: ");
		for(int i=0; i<arrSize; i++){
			arr[i] = input.nextInt();
		}
              
		System.out.println("Even element are: ");
		 for(int i=0; i<arrSize; i++){
			 if(arr[i]%2==0){
				 System.out.print(arr[i]+ " ");
				 evenCount++;
				 
			 }
		 }
		 System.out.println();

	         System.out.println("even no count: " +evenCount);
	}
}
