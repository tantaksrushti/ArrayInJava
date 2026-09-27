// print higest element of array
import java.util.Scanner;
class MaxElementofArray{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int sizeArr = in.nextInt();

		int arr[] = new int[sizeArr];

		System.out.println("Enter element: ");
		for(int i=0; i<sizeArr; i++){
			arr[i] = in.nextInt();
		}

		int maxElement = arr[0];
		for(int i=0; i<sizeArr; i++){
			if(arr[i]> maxElement){
				maxElement = arr[i];
			}
		}
		System.out.println("Maximum number in the array is : " +maxElement);
	}
}
