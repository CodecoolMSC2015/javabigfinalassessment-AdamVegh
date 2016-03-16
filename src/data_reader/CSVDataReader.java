package data_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import people.Person;

public class CSVDataReader extends DataReader{
	private String csvFilePath;
	private List<Person> persons;
	
	public CSVDataReader(String csvFilePath) {
		this.csvFilePath = csvFilePath;
		persons = new ArrayList<>();
		
		BufferedReader buffReader;
		String line;
		ArrayList<String> dataRowList = new ArrayList<>();
		try {
			buffReader = new BufferedReader(new FileReader(this.csvFilePath));
			while ((line = buffReader.readLine()) != null) {
				dataRowList.add(line);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		String header = dataRowList.get(0);
		List<String> listHeader = new ArrayList<>();
		listHeader = Arrays.asList(header.split(","));
		
		HashMap<Integer, String> mapHeader = new HashMap<>();
		for (Integer i = 0; i < listHeader.size(); i++) {
			mapHeader.put(i, listHeader.get(i));
		}
		
		
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
	
	public static void main(String[] args) {
		new CSVDataReader("Documentation/persons.csv");
	}
}
