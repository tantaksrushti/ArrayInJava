//if there is any vowel in the array character if present then print its index 
import java.util.*;
class VowelsIdentifierArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
	        int arrSize = sc.nextInt();

		char arr[] = new char [arrSize];

		System.out.println("Enter element: ");
		for(int i=0; i<arrSize; i++){
			arr[i] = sc.next().charAt(0);
		}

		for(int i =0; i<arrSize; i++){
			
			if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='o' || arr[i]=='O' || arr[i]=='i' || arr[i]=='I' || arr[i]=='u' || arr[i]=='U'){
				System.out.println("vowel " + arr[i]+" " + "found at index " +i );
			}
		}
	}
}
