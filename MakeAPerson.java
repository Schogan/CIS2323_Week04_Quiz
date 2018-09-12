import People.*;
import java.util.Scanner;

public class MakeAPerson{
	public static void main(String[] args){
		/*Lamp myLamp = new Lamp();
		System.out.println("This is my LAMP!");
		
		myLamp.setColor("white");
		myLamp.setWatts(45);
		myLamp.turnOn();
		
		String myStatus = myLamp.showStatus();
		System.out.println(myStatus);
		private String firstname;
		private String lastname;
		private int age = 0;
		private char sex = 'a';*/
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