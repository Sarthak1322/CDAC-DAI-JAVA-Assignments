package Assignment_2;
import java.util.*;
public class Store {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Customer Welcome to my Desert Store");
		System.out.println("Displaying  menu before you\n Candy(vanila/chocolate)\n Cookies(vanila/chocolate)\n Icecream(vanila/chocolate)\n");
		
		Cart c = new Cart();
		
		String desert = "", flavour;
		int quantity;
		int canvi = 25;
		int cancho = 40;
		
		int coovi = 20;
		int coocho =50;
		
		int icevi = 25;
		int icecho = 75;
		
		while(!"end".equals(desert)) {
			System.out.println("Enter Desert (If end type 'end'): ");
			desert = sc.next();
			
			if("end".equals(desert)) {
				break;
			}
			
			System.out.println("Enter Desert flavour : ");
			 flavour = sc.next();
			System.out.println("Enter Desert quantity : ");
			quantity = sc.nextInt();
			
			switch (desert) {
			case "Candy" :
				switch (flavour) {
				case "chocolate" :{
					Candy can = new Candy(desert, quantity, flavour, cancho);
					c.addtoCard(can);
					}
				default:
					Candy can = new Candy(desert, quantity, flavour, canvi);
					c.addtoCard(can);
				}
			
			case "Cookies" :
				switch (flavour) {
				case "chocolate" :{
					Cookies can = new Cookies(desert, quantity, flavour, coocho);
					c.addtoCard(can);
					}
				default:
					Cookies can = new Cookies(desert, quantity, flavour, coovi);
					c.addtoCard(can);
					
				}
			case "Icecream" :
				switch (flavour) {
				case "chocolate" :{
					IceCream can = new IceCream(desert, quantity, flavour, icecho);
					c.addtoCard(can);
					}
				default:
					IceCream can = new IceCream(desert, quantity, flavour, icevi);
					c.addtoCard(can);
					
				}
			
			
		}
		
		
		
		
	}
		System.out.println("Total Item " +c.totalItem());
		System.out.println("Total Bill " +c.totalBill());

}}
