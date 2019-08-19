package leonz2code.org.udemy.section8;

public class MyClass3 {
	
	MyClass1 myClass1;
	MyClass2 myClass2;
	
	
	

	
	public MyClass3(MyClass1 myClass1, MyClass2 myClass2) {
		super();
		this.myClass1 = myClass1;
		this.myClass2 = myClass2;
	}

	public static void main(String[] args) {
		
		
		I_MyInterface myint =  new I_MyInterface() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}
	
	public interface I_MyInterface{
		
		public void show();
		
	}
	
	
}
