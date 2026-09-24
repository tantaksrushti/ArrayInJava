import java.util.*;
class Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size = sc.nextInt();

		int oddArr[] = new int [size];

		System.out.println("Enter elements: ");
		for(int i=0; i<size; i++){
			oddArr[i] = sc.nextInt();
		}

                int sum =0; 

		for(int i=0; i<size; i++){
			if(i%2!=0){
				sum+=oddArr[i];
			}
		}
		System.out.println("Sum of odd indexed elements: " +sum);
	}
}
