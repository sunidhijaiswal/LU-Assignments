import java.util.Scanner;
public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks ,per;
		int sum = 0;
		Scanner c = new Scanner(System.in);
		
//		Take input from user
		
		for(int i =0;i<5;i++) {
			System.out.print("Enter Subject"+(i+1)+"marks = ");
			marks = c.nextInt();
			sum = sum + marks;
			
		}
		// Calculate percentage
		
		per = sum/5;
		System.out.println("percentage = "+per);
		
		// Display Grade
		if(per<90) {
			System.out.println("Grade = A");
		}
		else if(per<80) {
			System.out.println("Grade = B");
		}
		else {
			System.out.println("Grade = c");
		}
	}

}
