package entities;

public abstract class Device {
	private String serial;
	
	
	
	public Device(String serial) {
		this.serial = serial;
	}
	
	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}


	public abstract void processDoc(String doc);
}
