package Assignment_2;

public class IceCream extends Desert {
	
	protected int icecreamprice;

	public IceCream(String desertname, int quantity, String flavour, int icecreamprice) {
		super(desertname, quantity, flavour);
		this.icecreamprice = icecreamprice;
	}
//valina and chocolate (25, 75)
	public double calculatePrice() {
		return icecreamprice*quantity;
	}
	

}
