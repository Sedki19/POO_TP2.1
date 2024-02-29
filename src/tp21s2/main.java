package tp21s2;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
		
		List <Etudiant> ledt = new Vector<>() ;
		Etudiant e = new Etudiant(1,"omar");
		
		e.addNote(new Note("java",10));
		e.addNote(new Note("francais",0));
		e.addNote(new Note ("english",16));
		
		System.out.println(e);
		
		
		Etudiant e2 = new Etudiant(2,"amir");
		
		e2.addNote(new Note("java",10));
		e2.addNote(new Note("francais",10));
		e2.addNote(new Note ("english",19));
		
		
		
		
		
		Stats s = new Stats();
		
		ledt.add(e);
		ledt.add(e2);
		
		Collections.sort(ledt);
		s.afficherStatsEtudiants(ledt);
		
		Collections.sort(ledt,new MatComparator());
		s.afficherStatsEtudiants(ledt);
		
		Collections.sort(ledt,new CompareNom());
		s.afficherStatsEtudiants(ledt);

	}

}
