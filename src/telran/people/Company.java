package telran.people;

import java.util.Arrays;
import java.util.function.Predicate;

public class Company {
	private Employee[] employees;
	
	public Company(Employee[] employees) {
		this.employees  = Arrays.copyOf(employees, employees.length);
	}
	
	public Employee[] getAllEmployees() {
		Employee[] res = Arrays.copyOf(employees, employees.length);
		Arrays.sort(res);
		return res;
	}
	
	public boolean addEmployee(Employee empl) {
		for(int i = 0; i < employees.length; i++) {
			if (employees[i].getId() == empl.getId()) {
				return false;
			}
		}
		employees = Arrays.copyOf(employees, employees.length + 1);
		employees[employees.length - 1] = empl;
		return true;
	}
	
	public Employee getEmployee(int id) {
		for(int i =0; i < employees.length; i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		return null;
	}
	
	public boolean removeEmployeesIf(Predicate<Employee> predicate) {
		int oldSize = employees.length;
		Employee[] tmp = new Employee[oldSize];
		int index = 0;
		for(int i = 0; i < oldSize; i++) {
			if(!predicate.test(employees[i])) {
				tmp[index++] = employees[i];
			}
		}
		employees = Arrays.copyOf(tmp, index);
		return oldSize > employees.length;
	}
	
	public Employee[] getEmployeesByAge(int yearFrom,  int yearTo) {
		Employee[] res = new Employee[employees.length];
		int index = 0;
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getBirthYear() >= yearFrom && employees[i].getBirthYear() <= yearTo) {
				res[index++]  = employees[i];
			}
		}
		res = Arrays.copyOf(res, index);
		Arrays.sort(res);
		return res;
	}
	
	public Employee[] getEmployeesBySalary(int salaryFrom, int salaryTo) {
		Employee[] res = new Employee[employees.length];
		int index = 0;
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getSalary() >= salaryFrom && employees[i].getSalary() <= salaryTo) {
				res[index++]  = employees[i];
			}
		}
		res = Arrays.copyOf(res, index);
		Arrays.sort(res);
		return res;
	}
	
	public Employee[] getEmployeesByDepartment(String department) {
		Employee[] res = new Employee[employees.length];
		int index = 0;
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getDepartment().equals(department)) {
				res[index++]  = employees[i];
			}
		}
		res = Arrays.copyOf(res, index);
		Arrays.sort(res);
		return res;
	}
	
	
	
	
}
