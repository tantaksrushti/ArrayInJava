// Take array from user and print the element which are divisible by 4 and print its index
import java.util.Scanner;
class DivisibleByFour{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arrSize = input.nextInt();

		int arr[] = new int[arrSize];

		System.out.println("Enter array data: ");
		for(int i =0; i<arr.length; i++){
			arr[i]=input.nextInt();
		}

		System.out.println("Array :");
		for(int i=0; i<arr.length; i++){
			if(arr[i]%4==0){
				System.out.println(arr[i]+ " is divisible by 4 and its index is " + i );
			}
		}
		System.out.println();
	}
}
