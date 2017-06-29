package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public void add(Employee employee) {
		getSubordinates().add(employee);
	}
	
	public void remove(Employee employee) {
		getSubordinates().remove(employee);
	}
	
	public List<Employee> getSubordinates() {
		if (this.subordinates == null) {
			subordinates = new ArrayList();
		}
		return subordinates;
	}
	
	@Override
	public String toString() {
		return "[Employee :[ name : " + name + ", dept : " + dept + ", salary: " + salary + " ]";
	}

}
