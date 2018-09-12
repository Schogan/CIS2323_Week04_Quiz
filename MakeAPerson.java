import People.*;
import java.util.Scanner;

public class MakeAPerson{
	public static void main(String[] args){
		
		String a;
		String b;
		char c = 'a';
		int x =0;
	
		Scanner inputDevice = new Scanner(System.in);
		Person personA = new Person();
		
		System.out.println("Please enter your first name: ");
			a = inputDevice.nextLine();
		System.out.println("Please enter your last name: ");
			b = inputDevice.nextLine();
		System.out.println("Please enter your age: ");
			x = inputDevice.nextInt();
		System.out.println("Please enter your sex: ");
			c = inputDevice.next().charAt(0);
			
		personA.setFirstName(a);
		personA.setLastName(b);	
		personA.setAge(x);
		personA.setSex(c);
		
		String status = personA.getPersonInfo();
		System.out.println(status);
	}
}