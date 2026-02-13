package multilevel.multilevel;

public class Employee extends Person {
	protected int empId;
	protected double empSalary;
	
	public Employee()
	{
		System.out.println("Employee default constructor called");
	}

	public Employee(int age, String name, String gender, int empId, double empSalary) {
		super(age, name, gender);
		this.empId = empId;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empSalary=" + empSalary + ", toString()=" + super.toString() + "]";
	}
	

}