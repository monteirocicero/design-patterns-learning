package filter;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria {
	
	private static final String MARITAL_CRITERIA = "SINGLE";

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = persons.stream()
				.filter((person) -> person.getMaritalStatus().equalsIgnoreCase(MARITAL_CRITERIA))
				.collect(Collectors.toList());
		return singlePersons;
	}

}
