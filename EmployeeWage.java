public class EmployeeWage{
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORK_DAYS=20;


	public static void main(String[] args){
		

		System.out.println("Welcome to employee wage computation program");
	
		int empHrs=0, empWage=0, totalEmpWage=0;
		
		int empcheck = (int) Math.floor(Math.random()*10)%3;
		
		for (int day=1; day <= NUM_OF_WORK_DAYS; day++){
			
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
			
			empWage= empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
		}
		
		
		//System.out.println("Emp Wage per day: " + empWage);
		System.out.println("Emp Wage for month: " + totalEmpWage);
	}
}