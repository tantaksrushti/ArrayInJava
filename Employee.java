//Store employee's age working at a company take count from user 
import java.util.Scanner;
class EmployeeData{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee count: ");
		int EmpCount = sc.nextInt();

		int Age[] = new int[EmpCount];

		System.out.println("Enter employee's age: ");
		for(int i =0; i<EmpCount; i++){
			Age[i] = sc.nextInt();
		}
		
		System.out.println("Employee's age are: ");
		for(int i=0; i<EmpCount; i++){
			System.out.print(Age[i]+ " ");
		}
		System.out.println();
	}
}
