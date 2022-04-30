package entities;

public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(String serial) {
		super(serial);
	}

	@Override
	public void print(String doc) {
		System.out.println("Imprimindo: "+doc);
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processando impressão: "+doc);
		
	}
	

}
