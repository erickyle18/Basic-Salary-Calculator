import java.util.Scanner;

public class SalaryCalculator {
	
	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//initialize variables
		double grossPay;
		int employeeCounter = 1;
		
		//Display a welcome message
		System.out.println("This program will calculate and display the gross pay " +
		"(including overtime) for 3 employees.");
		
		//Start the while loop while the employee counter is less than or equal to 3
		while(employeeCounter <= 3)
		{
			//prompt the user to enter the hours worked for the nth employee
			System.out.print("Enter the hours for employee #" + employeeCounter + ": ");
			int hours = input.nextInt();
			
			//prompt the user to enter the hourly rate for the nth employee
			System.out.print("Enter the hourly rate for employee #" + employeeCounter + ": ");
			double hourlyRate = input.nextDouble();
			
			if(hours <= 40) 
			{
				double normalWorkWeek = hours * hourlyRate;
				System.out.printf("Employee #" + employeeCounter + " gross pay: $%.2f%n%n", 
						normalWorkWeek);
			}
			else
			{
				double workWeek = 40 * hourlyRate;
				int overtimeHours = hours - 40;
				double overtimePay = overtimeHours * (hourlyRate * 1.5);
				double totalOvertime = workWeek + overtimePay;
				System.out.printf("Employee #" + employeeCounter + " gross pay: $%.2f%n%n", 
						totalOvertime);
			}
			
			//increment the employee counter
			employeeCounter++;
		}
		
		//Closing message
		System.out.println("That was the end, thank you for running this program.");
		
	}	//end main method

}	//end class salary calculator
