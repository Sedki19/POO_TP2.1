package tp21s2;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Stats {
	
	public void afficherStatsEtudiants(List <Etudiant> e) {
		Iterator <Etudiant> it = e.iterator();
		while (it.hasNext()) {
			Etudiant edt = it.next();
			System.out.println("Etudiant ["+edt.getNom()+"] : ");
			System.out.println(edt.getValue());
			System.out.println(edt.getMax());
			System.out.println(edt.getMin());
			System.out.println("--------------------");
		}
	}
	
	public void getMoyenneGroupe(Vector <Etudiant> etd) {
		double moy = 0;
		
		for (Etudiant ed : etd) {
			moy = moy + ed.getValue();
		}
		
		System.out.println("Moyenne du Groupe : "+moy/etd.size());
		}
	
	public void getMaximumGroupe(Vector <Etudiant> etd) {
		Etudiant max = etd.get(0);
		
		for (Etudiant ed : etd ) {
			if (max.getValue() < ed.getValue()) {
				max = ed;
			}
		}
		
		System.out.println("Le maximum group edt : "+max);
	}
	
	public void getMinimumGroupe(Vector <Etudiant> etd) {
		Etudiant min = etd.get(0);
		
		for (Etudiant ed : etd ) {
			if (min.getValue() > ed.getValue()) {
				min = ed;
			}
		}
		
		System.out.println("Le minimum group edt : "+min);
	}
	
	
	
	
}
