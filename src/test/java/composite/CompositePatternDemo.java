package composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		
		Employee ceo = new Employee("John", "CEO", 30000);
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
		
		Employee cleark1 = new Employee("Laura", "Marketing", 10000);
		Employee cleark2 = new Employee("Bob", "Marketing", 10000);
		
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		
		ceo.add(headSales);
		ceo.add(headMarketing);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(cleark1);
		headMarketing.add(cleark2);
		
		System.out.println(ceo);
		
		for (Employee headEmployee : ceo.getSubordinates()) {
			System.out.println(headEmployee); 
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
			
		}

	}

}
