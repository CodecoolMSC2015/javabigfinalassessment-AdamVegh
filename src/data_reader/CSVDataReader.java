package data_reader;

import java.util.List;
import java.util.Set;

import people.Person;

public class CSVDataReader extends DataReader{
	private String csvFilePath;
	private List<Person> persons;
	
	public CSVDataReader(String csvFilePath) {
		this.csvFilePath = csvFilePath;
	}
	
	@Override
	public void setSearchCriteria(String searchCriteria) {
		
	}

	@Override
	public void setSearchType(SearchType searchType) {
		
	}

	@Override
	public Set<Person> getPersons() {
		return null;
	}

}
