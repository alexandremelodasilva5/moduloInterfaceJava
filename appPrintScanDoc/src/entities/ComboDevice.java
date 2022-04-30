package entities;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serial) {
		super(serial);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printing: "+doc);
		
	}

	@Override
	public String scan() {
		return "Scanned content";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer and scanner processing: "+doc);
		
	}
	
	
}
