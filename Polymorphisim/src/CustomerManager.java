
public class CustomerManager {
	private BaseLogger Logger;
	
	public CustomerManager(BaseLogger Logger) {
		this.Logger=Logger;
	}
	public void Add() {
		System.out.println("Musteri Eklendi.");
		this.Logger.log("Log message");
	}

}
