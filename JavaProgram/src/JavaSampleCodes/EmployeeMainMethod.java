package JavaSampleCodes;

public class EmployeeMainMethod {

	public static void main(String[] args) {

		Employee emp1=new Employee();
		emp1.empid=1001;
		emp1.ename="Ramesh";
		emp1.job="tester";
		emp1.sal=100000;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.empid=1002;
		emp2.ename="Ramu";
		emp2.job="Test Lead";
		emp2.sal=150000;
		emp2.display();
		
	}

}
