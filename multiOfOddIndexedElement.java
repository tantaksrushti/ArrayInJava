import java.util.*;
class Product{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter array size: ");
                int arrSize = sc.nextInt();

                int proArr[] = new int [arrSize];

                System.out.println("Enter elements: ");
                for(int i=0; i<arrSize; i++){
                        proArr[i] = sc.nextInt();
                }

                int product =1;

                for(int i=0; i<arrSize; i++){
                        if(i%2!=0){
                                product*=proArr[i];
                        }
                }
                System.out.println("Product of odd indexed elements: " +product);
        }
}
