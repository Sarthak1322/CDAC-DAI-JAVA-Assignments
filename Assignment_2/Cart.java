package Assignment_2;

public class Cart {
	
	static double totalbill=0;
	static int totalitem=0;
	
	public void addtoCard(Desert d) {
		totalitem++;
		totalbill += d.calculatePrice();
		
	}
	public double totalBill() {
		return totalbill;
	}
	public int totalItem() {
		return totalitem;
	}
	

}
