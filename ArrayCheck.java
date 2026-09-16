// Check if a array element less then 10
import java.util.Scanner;
class ElementChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];

		System.out.println("Enter array data: ");
		for(int i = 0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("The element less then 10 are: ");
		for(int i =0; i<arrSize; i++){
			if(arr[i]<10){
				System.out.println(arr[i]+ " is less than 10");
			}
		}
	}
}
