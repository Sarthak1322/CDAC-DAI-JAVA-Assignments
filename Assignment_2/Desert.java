package Assignment_2;

public abstract class Desert {
	protected String desertname;
	protected int quantity;
	protected String flavour;
	public Desert(String desertname, int quantity, String flavour) {
		super();
		this.desertname = desertname;
		this.quantity = quantity;
		this.flavour = flavour;
	}
	
	abstract double calculatePrice();
	
	

}
