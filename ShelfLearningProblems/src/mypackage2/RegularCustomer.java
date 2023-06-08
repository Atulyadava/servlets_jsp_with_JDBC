package mypackage2;

public class RegularCustomer extends Customer {
	//class variable
	String CustomerID;
	String CustomerName;
	String CustomerType;
	double amount;
	
	//constructor 
	RegularCustomer(String custID,String custName,String custType,double amt){
		super(custID,custName,custType);
		this.CustomerID=custID;
		this.CustomerName=custName;
		this.amount=amt;
	}
	//method
	double get_final_amount(double interest,int year) {
	double simple_interest=this.amount* interest*year;
	double amount=this.amount+interest;
	if(this.CustomerType=="Domestic") {
		//for regular customer type we are discounting 500 rupees
		return amount-500;
	}
	else if(this.CustomerType=="Business") {
		//for business type customer no discount
		return amount;		
	}
	//besides the above customer type we will return the amount calculated
	return amount;
	}
}
