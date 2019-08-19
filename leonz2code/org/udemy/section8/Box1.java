package leonz2code.org.udemy.section8;

public class Box1<T,P> {
	   private T t;
	   private P p;

	   public void add(T t, P p) {
	      this.t = t;
	      this.p = p;
	   }

	   public T get() {
	      return t;
	   }

	public P getP() {
		return p;
	}


	public static void main(String[] args) {
	      Box1<Integer,String> integerBox1 = new Box1<Integer,String>();
	      Box1<String,Integer> stringBox1 = new Box1<String,Integer>();
	      
	      integerBox1.add(10, "HELLO CHINGADAMADRE ME SALIO AWEBO");
	      
	      System.out.println(integerBox1.t + " " + integerBox1.getP());
	      
	   }
}
