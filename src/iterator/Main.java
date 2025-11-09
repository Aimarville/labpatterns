package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("s1", 10, 5), 1);
			p.addSymptom(new Symptom("s2", 10, 4), 2);
			p.addSymptom(new Symptom("s3", 10, 2), 3);
			p.addSymptom(new Symptom("s4", 10, 3), 4);
			p.addSymptom(new Symptom("s5", 10, 1), 5);
			
			Covid19PacientInvertedIteratorAdapter adapter = new Covid19PacientInvertedIteratorAdapter(p);
			
			Iterator<Symptom> it1 = Sorting.sortedIterator(adapter, new SortByName());
			System.out.println("Izenaren arabera ordenatuta:");
			while (it1.hasNext()) {
				System.out.println(it1.next());
			}

			Iterator<Symptom> it2 = Sorting.sortedIterator(adapter, new SortByIndex());
			System.out.println("Larritasunaren arabera ordenatuta:");
			while (it2.hasNext()) {
				System.out.println(it2.next());
			}

		}

	}

