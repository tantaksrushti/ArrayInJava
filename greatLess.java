// wap to print the element greater than 5 but less 9
import java.util.*;
class greaterElement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arrSize = input.nextInt();

		int arr[] = new int[arrSize];

		System.out.println("Enter array element: ");
		for(int i=0; i<arrSize; i++){
			arr[i] = input.nextInt();
		}

		for(int i=0; i<arrSize; i++){
			if(arr[i]>5 && arr[i]<9){
				System.out.println("Element greater than 5 and less than 9 is: " +arr[i]);
			}
		}
	}
}
