package leonz2code.org.udemy.section8;

public class MyClass1 implements ImyInterface3 {

	int myInstanceAttribute1;
	String myInstanceAttribute2;
	boolean myInstanceAttribute3;
	double myInstanceAttribute4;
	
	
	
	
	public MyClass1(int myInstanceAttribute1, String myInstanceAttribute2, boolean myInstanceAttribute3,
			double myInstanceAttribute4) {
		super();
		this.myInstanceAttribute1 = myInstanceAttribute1;
		this.myInstanceAttribute2 = myInstanceAttribute2;
		this.myInstanceAttribute3 = myInstanceAttribute3;
		this.myInstanceAttribute4 = myInstanceAttribute4;
		
		int myInt = ImyInterface3.x;
		
		this.myInstanceAttribute1 = myInt;
	
	}

	@Override
	public void ImyInterface3_method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ImyInterface3_method2() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String ImyInterface3_method3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ImyInterface3_method4() {
		// TODO Auto-generated method stub
		return 0;
	}

}
