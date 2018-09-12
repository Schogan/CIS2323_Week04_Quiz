package People;

public class Person{
	private String firstname;
	private String lastname;
	private int age = 0;
	private char sex = 'a';
	
	public String getPersonInfo(){
		return "Your first name is: " + firstname + "\n"
			+ "Your last name is: " + lastname + "\n" 
			+ "Your age is: " + age + "\n"
			+ "Your sex is: " + sex;
	}
	
	public void setFirstName(String a){
		firstname = a;
	}
	public String getFirstName(){
		return firstname;
	}
	public void setLastName(String b){
		lastname = b;
	}
	public String getLastName(){
		return lastname;
	}
	public void setAge(int x){
		age = x;
	}
	public int getAge(){
		return age;
	}
	public void setSex(char c){
		sex = c;
	}
	public char getSex(){
		return sex;
	}
}