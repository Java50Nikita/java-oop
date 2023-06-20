package telran.people.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.people.Company;
import telran.people.Employee;

class CompanyTest {
	Company company;
	Employee[] employees = {
			new Employee(0, "John", 1987, "Marketing", 16500),
			new Employee(1, "Jack", 1997, "Sales", 6785),
			new Employee(2, "Chuck", 2001, "Sales",6200),
			new Employee(3, "Alice", 1998, "Design", 12000),
			new Employee(4, "Mary", 1988, "Marketing", 15000)
	};
	@BeforeEach
	void setUp() throws Exception {
		company = new Company(employees);
	}

	@Test
	void getAllEmployeesTest() {
		Employee[] expected = {
				new Employee(0, "John", 1987, "Marketing", 16500),
				new Employee(1, "Jack", 1997, "Sales", 6785),
				new Employee(2, "Chuck", 2001, "Sales",6200),
				new Employee(3, "Alice", 1998, "Design", 12000),
				new Employee(4, "Mary", 1988, "Marketing", 15000)
		};
		assertArrayEquals(expected, company.getAllEmployees());
	}
	
	@Test
	void addEmployeeTest() {
		Employee addedEmp = new Employee(5, "Nick", 2002, "IT", 17000);
		Employee[] expEmps = {
				new Employee(0, "John", 1987, "Marketing", 16500),
				new Employee(1, "Jack", 1997, "Sales", 6785),
				new Employee(2, "Chuck", 2001, "Sales",6200),
				new Employee(3, "Alice", 1998, "Design", 12000),
				new Employee(4, "Mary", 1988, "Marketing", 15000),
				new Employee(5, "Nick", 2002, "IT", 17000)
		};
		Company expected = new Company(expEmps);
	} 
}
