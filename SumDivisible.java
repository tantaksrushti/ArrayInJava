// Print the sum of no divisible by 3 
import java.util.Scanner;
class SumOFDiv{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size = input.nextInt();

		int numArr[] = new int[size];

		System.out.println("Enter array element: ");
		for(int i=0; i<numArr.length; i++){
			numArr[i]= input.nextInt();
		}

                int sum =0;

		System.out.println("Element divisible by 3 are: ");
		for(int i=0; i<size; i++){
			if(numArr[i]%3==0){
				System.out.println(numArr[i]+ " ");
				sum+=numArr[i];
			}
		} 
		System.out.println("Sum of element divisible by 3 is: " +sum);
	}
}
