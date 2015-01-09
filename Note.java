import java.util.Scanner;

public class Note {
	private float coefficient;
	private float note;
	
	public float getCoeffiecient() {
		return coefficient;
	}
	public void setCoeffiecient(float coeffiecient) {
		this.coefficient = coeffiecient;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public String toString() {
		return "Note [coeffiecient=" + coefficient + ", note=" + note + "]";
	}
	
	public void init(){
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez coefficient de la note");
		this.coefficient = input.nextFloat();
		System.out.println("Entrez la note");
		this.note = input.nextFloat();
		
	}
	
}
