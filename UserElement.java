import java.util.*;
class UserArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int arr[] = new int[10];
		System.out.println("Enter array element: ");

		for(int i = 0; i<arr.length; i++){
			arr[i]=input.nextInt();
		}
		System.out.println("Array is: ");

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " " );
		}

		System.out.println();
	}
}
