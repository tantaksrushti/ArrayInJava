import java.util.*;
class CharacterTaken{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arrSize = input.nextInt();

		char arrch[] = new char[arrSize];

		System.out.println("Eneter array data: ");
		for(int i=0; i<arrch.length; i++){
			arrch[i]=input.next().charAt(0);
		}
		System.out.println("Array: ");
		for(int i=0; i<arrch.length; i++){
			System.out.print(arrch[i]+" ");
		}
		System.out.println();
	}
}
