package Assignment_2;

public class Cookies extends Desert {
	protected int cookiesprice;

	public Cookies(String desertname, int quantity, String flavour, int cookiesprice) {
		super(desertname, quantity, flavour);
		this.cookiesprice = cookiesprice;
	}
//	20 per dozen 
//	two flavour vanila and chocolate (20, 50)
	
	public double calculatePrice() {
		if(flavour == "vanila") {
			return (0.6 * quantity);
		}
		else {
			return ((6/25)*quantity);
		}
	}

}
