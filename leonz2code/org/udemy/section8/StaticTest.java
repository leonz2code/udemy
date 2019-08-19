package leonz2code.org.udemy.section8;

public class StaticTest {
	
	private static  int numInstances = 0; // if you change this without static instance is always 1 but static sum is working
	private String name;
	public StaticTest( String name) {
		this.name = name;		
		numInstances++;
	}
	public static int getNumInstances() { // no pertenece a la instancia de la clase mas bien a la clase, al crearla se queda con el valor independientemente
		return numInstances;			  // del numero de instancias (objetos de la clase que se creen )
	}
	public String getName() {
		return name;
	}
	

}
