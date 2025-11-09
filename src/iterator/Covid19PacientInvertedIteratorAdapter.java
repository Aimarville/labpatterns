package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator{
	
	private List<Symptom> symptomList;
	private int currentIndex;
	
	public Covid19PacientInvertedIteratorAdapter (Covid19Pacient p) {
		Set<Symptom> symptoms = p.getSymptoms();
		this.symptomList = new ArrayList<> (symptoms);
	}
	
	@Override
	public Object previous() {
		return symptomList.get(currentIndex--);
	}
	
	@Override
	public boolean hasPrevious() {
		return currentIndex	>= 0;
	}
	
	@Override
	public void goLast() {
		currentIndex = symptomList.size() - 1;
	}
}
