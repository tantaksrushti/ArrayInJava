import java.io.*;
class SearchNum{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		System.out.println("Enter array size: ");
		int arrSize = Integer.parseInt(br.readLine());

		int arr[] = new int[arrSize];

		System.out.println("Enter array element: ");
		for(int i=0; i<arrSize; i++){
			arr[i]= Integer.parseInt(br.readLine());
		}

		System.out.println("Enter a number to search in array: ");
		int num = Integer.parseInt(br.readLine());

		for(int i=0; i<arrSize; i++){
			if(arr[i]==num){
				System.out.println(num+ " found at index " +i);
			}
		}
	}
}

