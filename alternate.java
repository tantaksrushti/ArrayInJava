import java.util.*;
class evenAlt{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                System.out.println("Enter array size: ");
                int arrSize = input.nextInt();

                int altArr[] = new int [arrSize];

                System.out.println("Enter elements: ");
                for(int i=0; i<arrSize; i++){
                        altArr[i] = input.nextInt();
                }

                for(int i=0; i<arrSize; i++){
                        if(arrSize%2==0){ 
                                System.out.println(altArr[i+=1]);
                        }else{
				System.out.println(altArr[i]);
			}
		}
	}
}
