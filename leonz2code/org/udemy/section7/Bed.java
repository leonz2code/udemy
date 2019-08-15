package leonz2code.org.udemy.section7;

public class Bed {
	private String style;
	private int pillows;
	private int heights;
	private int sheets;
	private int quilt;
	public Bed(String style, int pillows, int heights, int sheets, int quilt) {
		super();
		this.style = style;
		this.pillows = pillows;
		this.heights = heights;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	public void make() {
		System.out.println("Bed -> Baking bed");
	}
	public String getStyle() {
		return style;
	}
	public int getPillows() {
		return pillows;
	}
	public int getHeights() {
		return heights;
	}
	public int getSheets() {
		return sheets;
	}
	public int getQuilt() {
		return quilt;
	}
	
	

}
