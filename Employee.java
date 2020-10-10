import java.lang.String;
public class Employee {
	String name = "Saurabh" , city = "Chennai";
	int age = 23;
	
	public void display() {
		
		System.out.println("The name is "+ name);
		System.out.println("The age is "+ age);
		System.out.println("The city is "+ city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.display();
		Employee e1 = new Employee();
		e1.display();
		
		

	}

}
