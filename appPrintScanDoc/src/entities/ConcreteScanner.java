package entities;

public class ConcreteScanner extends Device implements Scanner{

	public ConcreteScanner(String serial) {
		super(serial);
	}

	@Override
	public String scan() {
		return "Arquivos escaneado";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processando escaneamento: "+doc);
		
	}

}
