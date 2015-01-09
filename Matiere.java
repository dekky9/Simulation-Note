import java.util.ArrayList;
import java.util.Scanner;

public class Matiere {
	private String nom;
	private float coefficient;
	private ArrayList <Note> cahier;
	
	
	public Matiere(String nom, float coefficient, ArrayList <Note> cahier ){
		this.nom = nom;
		this.coefficient = coefficient;
		this.cahier = cahier;
	}
	
	public float moyenne(){
		float numerateur = 0;
		float denominateur = 0;
		
		for(Note o : this.cahier){
			numerateur = numerateur + o.getNote() * o.getCoeffiecient();
			denominateur = denominateur + o.getCoeffiecient();
		}			
		return numerateur/denominateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}

	public ArrayList<Note> getCahier() {
		return cahier;
	}

	public void setCahier(ArrayList<Note> cahier) {
		this.cahier = cahier;
	}

	public String toString() {
		return "Matiere [nom=" + nom + ", coefficient=" + coefficient
				+ ", cahier=" + cahier + "]";
	}
	
	public void init(){
		boolean boucle = true;
		Scanner input = new Scanner(System.in);
		while(boucle){
			Note note = new Note();
			note.init();
			this.cahier.add(note);
			
			System.out.println("Voulez-vous arreter de saisir des notes ? Si oui taper 1 ");
			
			int reponse = input.nextInt();
			if(reponse == 1){
				boucle = false;
			}
			
		}
		
		
	}
}
