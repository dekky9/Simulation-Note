import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		ArrayList <Note> cahier = new ArrayList<Note>();
		ArrayList <Note> cahier2 = new ArrayList<Note>();
		ArrayList <Note> cahier3 = new ArrayList<Note>();
		float moyenne =0;
		float coef =0;
		Matiere info = new Matiere("Java", (float) 2.5,cahier);
		System.out.println(info);
		info.init();
		System.out.println(info);
		System.out.println("La moyenne de " + info.getNom()+ " :"+ info.moyenne() + "\n");
		Scanner input = new Scanner(System.in);
		moyenne=info.moyenne()*info.getCoefficient();
		coef=info.getCoefficient();
		
		Matiere info2 = new Matiere("Systeme" , (float) 2.5,cahier2);
		System.out.println(info2);
		info2.init();
		System.out.println(info2);
		System.out.println("La moyenne de " + info2.getNom()+ " :"+ info2.moyenne()+ "\n");
		moyenne+=info2.moyenne()*info2.getCoefficient();
		coef+=info2.getCoefficient();
		
		Matiere info3 = new Matiere("Alogrithme avancé", (float) 1.5,cahier3);
		System.out.println(info3);
		info3.init();
		System.out.println(info3);
		System.out.println("La moyenne de " + info3.getNom()+ " :"+ info3.moyenne()+ "\n");
		moyenne+=info3.moyenne()*info3.getCoefficient();
		coef+=info3.getCoefficient();
		
		moyenne = moyenne/coef;
		
		System.out.println("La moyenne generale est de " + moyenne );
		input.close();
	}

}
