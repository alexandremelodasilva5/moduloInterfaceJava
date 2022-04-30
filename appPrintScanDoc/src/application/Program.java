package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		ComboDevice comboDevice = new ComboDevice("1080");
		ConcretePrinter cp = new ConcretePrinter("990");
		ConcreteScanner cs = new ConcreteScanner("1000");
		
		System.out.println("Impressora Epson modelo "+ comboDevice.getSerial());
		comboDevice.processDoc("Documento Alexandre");
		comboDevice.print("Documento Alexandre");
		System.out.println("Scan result: "+comboDevice.scan());
		
		System.out.println();
		
		System.out.println("Impressora Epson modelo "+ cs.getSerial());
		cs.processDoc("Documento Alexandre");
		System.out.println("Scan result: "+cs.scan());
		
		System.out.println();
		
		System.out.println("Impressora Epson modelo "+ cp.getSerial());
		cp.processDoc("Documento Alexandre");
		cp.print("Documento Alexandre");
		

	}

}
