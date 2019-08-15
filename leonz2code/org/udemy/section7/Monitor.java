package leonz2code.org.udemy.section7;

public class Monitor {

	private String model;
	private String manofacturer;
	private int size;
	private Resolution nativeResolution;
	public Monitor(String model, String manofacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manofacturer = manofacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at "+ x + " " +y );
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManofacturer() {
		return manofacturer;
	}

	public void setManofacturer(String manofacturer) {
		this.manofacturer = manofacturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

	public void setNativeResolution(Resolution nativeResolution) {
		this.nativeResolution = nativeResolution;
	}
	
}
