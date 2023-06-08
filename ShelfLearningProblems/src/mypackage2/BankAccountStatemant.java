package mypackage2;

public class BankAccountStatemant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularCustomer regCustomer1=new RegularCustomer("R123","Krishna","Domestic",10000);
	    RegularCustomer regCustomer2=new RegularCustomer("R345","Satish","Business",10000);
	    
	    EnterpriseCustomer entCustomer1=new EnterpriseCustomer("E789","Madhu","SmallScale",10000);
	    EnterpriseCustomer entCustomer2= new EnterpriseCustomer("e379","atul","BigScale",10000);
	    
	    //Regular Customer
	    regCustomer1.showCustomerDetails();
	    System.out.println("Final amount: "+ regCustomer1.get_final_amount(5, 8) );
	    regCustomer2.showCustomerDetails();
	    System.out.println("Final amount: "+ regCustomer2.get_final_amount(5, 8));
	    
	    //Enterprise Customer
	    entCustomer1.showCustomerDetails();
	    System.out.println("Final amount: "+ entCustomer1.get_final_amount(5, 8));
	    entCustomer2.showCustomerDetails();
	    System.out.println("Finsl amount: "+entCustomer2.get_final_amount(5, 8));

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
