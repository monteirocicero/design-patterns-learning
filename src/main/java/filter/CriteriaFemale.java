package filter;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaFemale implements Criteria {

	private static final String FEMALE_CRITERIA = "FEMALE";

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = persons.stream()
				.filter((person) -> person.getGender().equalsIgnoreCase(FEMALE_CRITERIA))
				.collect(Collectors.toList());
		return femalePersons;
	}

}
