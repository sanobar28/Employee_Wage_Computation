public class EmployeeWage{
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORK_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;


	public static void main(String[] args){
		

		//System.out.println("Welcome to employee wage computation program");
	
		int empHrs=0, empWage=0,
		totalEmpWage=0, totalWorkingHrs=0, totalWorkdays=0;
		
		
		while (totalWorkingHrs <= MAX_HRS_IN_MONTH && 
		totalWorkdays < NUM_OF_WORK_DAYS){
			
			totalWorkdays++;
			int empcheck = (int) Math.floor(Math.random()*10)%3;
			
			switch (empcheck){
				
				case(IS_FULL_TIME):
					empHrs=8;
					break;		
			
				case(IS_PART_TIME):
					empHrs=4;
					break;
			
				default:
					empHrs=0;
			}
			
			totalWorkingHrs += empHrs;
			empWage= empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
		}
		
		
		//System.out.println("Emp Wage per day: " + empWage);
		System.out.println("Total working hours : " + totalWorkingHrs);
		System.out.println("No. of working days: " + totalWorkdays);
		System.out.println("Total Emp Wage for month: " + totalEmpWage);
	}
}