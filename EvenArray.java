import java.util.Scanner;
class EvenElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];

		System.out.println("Enter Array Data: ");
		for(int i = 0; i<arrSize; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Even Elements in array are: ");
		for(int i = 0; i<arrSize; i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+ " ");
				
			}
		}
		System.out.println();
	}
}
