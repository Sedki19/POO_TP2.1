package tp21s2;

import java.util.ArrayList;

public class Etudiant implements IStatisticable,Comparable<Etudiant>   {
	private int matricule;
	private String nom ;
	private ArrayList <Note> ln ;
	
	
	public Etudiant(int matricule, String nom) {
		this.matricule = matricule;
		this.nom = nom;
		this.ln = new ArrayList<Note>();
	}


	public int getMatricule() {
		return matricule;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public ArrayList<Note> getLn() {
		return ln;
	}


	public void setLn(ArrayList<Note> ln) {
		this.ln = ln;
	}
	
	
	public void addNote (Note n)
	{
		ln.add(n);
	}


	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", ln=" + ln + "]";
	}


	@Override
	public double getValue() {
		double moy=0;
		
		for (Note i : this.getLn()) {	
			moy = moy + i.getNote();
		}
		return moy/this.getLn().size();
	}
	
	public double getMax() {
		double max = this.getLn().get(0).getNote();
		for (Note i : this.getLn()) {
			if (i.getNote() > max) {
				max = i.getNote();
			}
			
		}
		return max;
	}
	
	public double getMin() {
		double min = this.getLn().get(0).getNote();
		for (Note i : this.getLn()) {
			if (i.getNote() < min) {
				min = i.getNote();
			}
			
		}
		return min;
	}


	@Override
	public int compareTo(Etudiant o) {
		
		return (int)(o.getValue()-this.getValue());
	}
	
	
}
