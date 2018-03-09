
public class Main {

	public static void main(String[] args) {
//		Employee employee=new Employee();
//		//employee.salary=1000;
//		//employee.employeeName="Bela";
//		employee.setSalary(1000);
//		employee.setEmployeeName("Bela");
//		
//		//employee.salary=employee.increaseSalary(-1000, employee.salary);
//		//System.out.println(employee.displayInfo(employee.salary, employee.employeeName));
//		
//		Employee employee2=new Employee();
//		
//		employee2.setEmployeeName("Bela2");
//		employee2.setSalary(2000);
//		
//		System.out.println(employee.displayInfo() +employee2.displayInfo());
//		
//		
//		System.out.println(employee.inInSalaryRange(500, 3000)+ " " + employee.getTax()+" "+employee.hasHigherSalary(employee2));
//		
	
		Employee[] employeeArray= new Employee[10];
		
		for(int i=0; i<employeeArray.length;i++)
		{
			employeeArray[i]=new Employee();
			employeeArray[i].setSalary(i*1000+i*200);
			employeeArray[i].setEmployeeName("Mindlessworker"+i);
		}
		double max=employeeArray[0].getSalary();
		String name= "";
		for(int i=0; i<employeeArray.length; i++)
		{
			if(max<=employeeArray[i].getSalary())
			{
				max=employeeArray[i].getSalary();
				name=employeeArray[i].getEmployeeName();
			}
		}
		System.out.println(name);
		
		
		int x=0;
		
		for(int i=0; i<employeeArray.length; i++)
		{
			if(employeeArray[i].inInSalaryRange(1000, 5000))
			{
				x++;
			}
			
		}
		System.out.println(x);
		
		
		double sum=0;
		double avg;
		for (int i = 0; i < employeeArray.length; i++) {
			sum+=employeeArray[i].getSalary();			
		}
		avg=sum/employeeArray.length;
		System.out.println(avg);
		
		
		
		double tax=sum*0.16;
		System.out.println(tax);
		
	}

}
