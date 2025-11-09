package iterator;

import java.util.Comparator;

import domain.Symptom;

public class SortByIndex implements Comparator{
	
	public int compare(Object s1, Object s2) {
		int si1 = ((Symptom)s1).getSeverityIndex();
		int si2 = ((Symptom)s2).getSeverityIndex();
		return Integer.compare(si1, si2);
	}

}
