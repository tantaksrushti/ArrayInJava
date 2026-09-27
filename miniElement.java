// print smallest element of array
import java.util.Scanner;
class MiniElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size = sc.nextInt();

		int arr[]= new int[size];

		System.out.println("Enter element: ");
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		} 

		int numarray = arr[0];

		for(int i=0; i<size; i++){
			if(arr[i]<numarray){
				numarray=arr[i];
			}
		}
		System.out.println("Minimum number in the array is: " +numarray);
	}
}
