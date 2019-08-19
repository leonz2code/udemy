package leonz2code.org.udemy.polymorphism;

public class Car {
	
	private String engine;
	private int cylinders;
	private int wheels;
	private String brand;
	private String model;
	private int year;
	private int velocity;
	private String traction;
	private String powerSystem;
	public Car(String engine, int cylinders, String brand, String model, int year, String traction,
			String powerSystem) {
		this.engine = engine;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.traction = traction;
		this.powerSystem = powerSystem;
	}
	
	
	public void startEngine() {
		System.out.println("Engine is power on");
	}
	public void accelerate(int accel) {
		
		this.velocity += accel;		
		
		System.out.println("the Car is accelerating");
	}
	
	public void brake() {
		
		this.velocity = 0;
		System.out.println("The Car was Stoped");
	}
	
	public void turnLightsOn() {
		System.out.println("The Car has lights ON");
	}
	public void turnLightsOff() {
		System.out.println("The car has lights OFF");
	}

	public String getEngine() {
		return engine;
	}


	public int getCylinders() {
		return cylinders;
	}


	public int getWheels() {
		return wheels;
	}


	public String getBrand() {
		return brand;
	}


	public String getModel() {
		return model;
	}


	public int getYear() {
		return year;
	}


	public int getVelocity() {
		return velocity;
	}


	public String getTraction() {
		return traction;
	}


	public String getPowerSystem() {
		return powerSystem;
	}

}

class MustangGT extends Car{
	
	private boolean controlTraction;

	public MustangGT(boolean controlTraction) {
		super("Modular v8", 8, "Ford", "MustangGT", 2003, "RWD", "Suercharged");

		this.controlTraction = controlTraction;
		
	}

	@Override
	public void accelerate(int accel) {
		super.accelerate(accel+10);
		System.out.println("Mustang is accelerating aresively");
		
	}

	@Override
	public void brake() {
	System.out.println("Mustang is breaking");
		super.brake();
	}
	
}	
	
class Miata extends Car{
	
	private boolean isRF;

	public Miata(boolean isRF) {
		super("mazda rotary", 4, "Mazda", "mx-5", 2022, "RWD", "Turbo");
		this.isRF = isRF;
	}

	public boolean isRF() {
		return isRF;
	}

	@Override
	public void accelerate(int accel) {
		System.out.println("Mx-5 is acelerating");
		super.accelerate(accel+2);
	}

	@Override
	public void brake() {
	System.out.println("Mx-5 is braking");
		super.brake();
	}
	
}

class Thousand3 extends Car{
	
	private boolean biTurbo;

	public Thousand3(boolean biTurbo) {
		super("4G63T", 6, "Mitsubizi", "VR4-3000GT", 1999, "4WD", "Turbo");
		this.biTurbo = biTurbo;
	}

	public boolean isBiTurbo() {
		return biTurbo;
	}

	@Override
	public void accelerate(int accel) {
		System.out.println("3000GT VR4 is flying");
		super.accelerate(accel+50);
	}	
	
}
	

