package mypackage3;

public class HouseArchitectureUsingPolymorhism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseArchitecture ha;
		
		ha=new Villas();
		System.out.println("Average price of the villas are: "+String.format("%.0f", ha.getPrice()));
		System.out.println("Banks Who can provide loan are: "+ha.getLoanBank());
		
		
		ha =new FarmHouse();
		System.out.println("Average prise of the FarmHouse are: "+String.format("%.0f", ha.getPrice()));
		System.out.println("Banks who can provide loan are: "+ha.getLoanBank());
		
		ha= new Apartments();
		System.out.println("Averade prise of the Apartments are: "+String.format("%.0f", ha.getPrice()));
		System.out.println("Bank who can provide loan are: "+ha.getLoanBank());

	}

}
