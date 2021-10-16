package de.gre90r.springbatchdemo.batch;

import org.springframework.batch.item.ItemProcessor;

import de.gre90r.springbatchdemo.model.Person;
import lombok.extern.slf4j.Slf4j;

/**
 * input/output does not necessarily need to be the same
 */
@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	/**
	 * transforms person name to upper-case
	 */
	@Override
	public Person process(final Person person) throws Exception {
		
		final String firstName = person.getFirstName().toUpperCase();
	    final String lastName = person.getLastName().toUpperCase();
	    
	    final Person transformedPerson = new Person(firstName, lastName);
	    
	    log.info("Converting (" + person + ") into (" + transformedPerson + ")");
		
		return transformedPerson;
	}

}
