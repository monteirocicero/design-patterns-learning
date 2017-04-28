package filter;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaMale implements Criteria {

	private static final String MALE_CRITERIA = "MALE";

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = persons.stream()
				.filter((person) -> person.getGender().equalsIgnoreCase(MALE_CRITERIA))
				.collect(Collectors.toList());
		return malePersons;
	}

}
