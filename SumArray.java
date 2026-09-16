import java.io.*;
class SumOfOddElement{
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size: ");
		int arrSize = Integer.parseInt(input.readLine());

		int arr[] = new int[arrSize];

		int sum = 0;
		boolean flag = false;

		System.out.println("Enter Array Data: ");
		for(int i=0; i<arrSize; i++){
			arr[i]=Integer.parseInt(input.readLine());
		}

		System.out.println("Sum of Odd Element is : ");
		for(int i=0; i<arrSize; i++){
			if(arr[i]%3==0){
				flag=true;
				sum+=arr[i];
			}

		}
		if(flag==true){
			System.out.println(sum);
		}
	}
}
