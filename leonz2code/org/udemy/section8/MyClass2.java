package leonz2code.org.udemy.section8;

public class MyClass2   {

	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p=new Phone() { // Anonimous Inner Class begin 			
			public void show() {
				System.out.println("This is an anonimous inner class"
						+ "as you can see implementation is performed"
						+ "here after instanciation");
			}};// Anonimous Inner Class end
			
			
		// new Anonimous InnerClass
			
			Phone p1 = new Phone() {

				@Override
				public void show() {
				
					System.out.println("as in avobe example"
							+ "this is an anonimous Inner class this example"
							+ "is by using anonimous Innfer Interface");
					
					
					
				}
				
				
				
			};
			
			
			
			p.show();
}
private interface Phone{ // Inner class/(interface in this case)
void show();

}
		



}
