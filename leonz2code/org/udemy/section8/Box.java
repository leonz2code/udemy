package leonz2code.org.udemy.section8;

public class Box<T> {
	   private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }

	public static void main(String[] args) {
	      Box<Integer> integerBox = new Box<Integer>();
	      Box<String> stringBox = new Box<String>();
	    
	      integerBox.add(10);
	      stringBox.add("Hello World");
	      
	      /*   OLD JAVA 8 STYLE
	       *    integerBox.add(new Integer(10));
      	   *    stringBox.add(new String("Hello World"));
	       *
	       */

	      System.out.println("Integer value is: " + integerBox.get());
	      System.out.println("String Value is: " + stringBox.get());
	      /*
	       * 
	       *   OLD JAVA 8 STYLE
	       *   System.out.printf("Integer Value :%d\n\n", integerBox.get());
      			
      			System.out.printf("String Value :%s\n", stringBox.get());
	       * 
	       * 
	       */
	      
	      
	   }
}
