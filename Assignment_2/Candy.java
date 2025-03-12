package Assignment_2;

public class Candy extends Desert {
	protected int candyprice;

	public Candy(String desertname, int quantity, String flavour, int candyprice) {
		super(desertname, quantity, flavour);
		this.candyprice = candyprice;
	}
//	per kg 
//	assume per kg = 25RS for vanila
//	40 for chocolate
	public double calculatePrice() {
		if(flavour == "vanila") {
			return (0.025*quantity);
		}
		else {
			return (0.04*quantity);
		}
	}

}
