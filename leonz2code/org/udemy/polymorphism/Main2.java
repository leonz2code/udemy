package leonz2code.org.udemy.polymorphism;

public class Main2 {

	public static void main(String[] args) {
		
		MustangGT myMustang = new MustangGT(true);		
		Miata myMiata = new Miata(true);
		Thousand3 my3000gt = new Thousand3(true);
		
		myMustang.accelerate(10);
		myMustang.brake();
		
		myMiata.accelerate(10);
		myMiata.brake();
		
		my3000gt.accelerate(10);
		my3000gt.brake();

	}

}
