import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Ename;
		int date , month , year;
		float monthlysalary;
		int Annualsalary , Taxammount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employeename ");
		Ename = sc.next();
		System.out.println("enter dateofbirth ");
		date = sc.nextInt();
		System.out.println("enter dateofmonth ");
		month = sc.nextInt();
		System.out.println("enter dateofyear ");
		year = sc.nextInt();
		System.out.println("enter monthlySalary ");
		monthlysalary = sc.nextFloat();
		
		Annualsalary = 12 * (int)monthlysalary;
		if(Annualsalary>500000) {
			Taxammount = (20*Annualsalary)/100;
			System.out.println("Tax = "+Taxammount);
		}
		else if(Annualsalary>400000){
			Taxammount = (15*Annualsalary)/100;
			System.out.println("Tax = "+Taxammount);
			
		}
		else if(Annualsalary>300000) {
			Taxammount = (10*Annualsalary)/100;
			System.out.println("Tax = "+Taxammount);
			
		}
		else if(Annualsalary>200000) {
			Taxammount = (5*Annualsalary)/100;
			System.out.println("Tax = "+Taxammount);
			
		}
		else {
		
			System.out.println("no tax ammunt");
		}
		System.out.println(Ename);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		System.out.println(Annualsalary);
		//System.out.println(Ename);
		
		

	}

}
