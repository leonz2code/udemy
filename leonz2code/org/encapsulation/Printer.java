package leonz2code.org.encapsulation;

public class Printer {
	private int tornerLevel;
	private int pagesPrinted;
	private boolean duplex;
	public Printer(int tornerLevel, boolean duplex) {
		super();
		if(tornerLevel >-1 && tornerLevel <=0) {
			this.tornerLevel = tornerLevel;		
		}else {
			this.tornerLevel = -1;
		}
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}
	
	public int addToner(int tornerAmount) {
		if(tornerLevel > 0 && tornerAmount <=100) {
			if(this.tornerLevel + tornerAmount > 100) {
				return -1;
			}
			this.tornerLevel += tornerAmount;
			return this.tornerLevel;
		}else {
			return -1;
		}
		
	}
	public int printPages(int pages) {
		int pagesToPrint = pages;
			if(this.duplex) {
				pagesToPrint /= 2; // segun es pagesToPrint = (pages /2) + (pages %2 ) 
				System.out.println("Print in duplex mode");
			}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

}
