public class EmployeeWage{
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;


	public static void main(String[] args){
		

		System.out.println("Welcome to employee wage computation program");
	
		int empHrs=0, empWage=0;
		
		int empcheck = (int) Math.floor(Math.random()*10)%3;
		
		if (empcheck == IS_FULL_TIME){
			System.out.println("Employee is present");
			empHrs=8;
		}
		else if(empcheck == IS_PART_TIME){
			System.out.println("Employee is part time");
			empHrs=4;
		}
		else{
			System.out.println("Employee is not present");
			empHrs=0;
		}
		
		
		empWage= empHrs * EMP_RATE_PER_HOUR;
		
		System.out.println("Emp Wage per day" + empWage);
	}
}