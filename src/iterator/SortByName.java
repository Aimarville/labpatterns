package iterator;

import java.util.Comparator;

import domain.Symptom;

public class SortByName implements Comparator{
	
	public int compare(Object s1, Object s2) {
		String sn1 = ((Symptom)s1).getName();
		String sn2 = ((Symptom)s2).getName();
		
		return sn1.compareTo(sn2);
	}

}
