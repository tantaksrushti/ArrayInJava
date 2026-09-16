import java.util.Scanner;
class OddIndexDisplay{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arrSize = input.nextInt();

		int arr[] = new int[arrSize];

		System.out.println("Enter array data: ");
		for(int i=0; i < arrSize; i++){
			arr[i] = input.nextInt();
		}

		System.out.println("Array: ");
		for(int i =0; i<arrSize; i++){
			if(i%2!=0){
				System.out.println(arr[i]+" is an odd indexed element");
			}
		}
	}
}
