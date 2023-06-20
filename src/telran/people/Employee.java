package telran.people;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int birthYear;
	private String department;
	private int salary;
	
	public Employee(int id, String name, int birthYear, String department, int salary) {
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object emplObj) {
		if(this == emplObj) {
			return true;
		}
		if(emplObj == null) {
			return false;
		}
		
		if(getClass() != emplObj.getClass()) {
			return false;
		}
//		if(!(emplObj instanceof Employee)) {
//			return false;
//		}
		Employee employee = (Employee)emplObj;
		return this.id == employee.id;
	}
	
	@Override
	public int compareTo(Employee empl) {
		return this.id - empl.id;
	}
	
}
