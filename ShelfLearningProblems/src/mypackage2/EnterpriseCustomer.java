package mypackage2;

public class EnterpriseCustomer extends Customer{
		//class variables
	String CustomerID;
	String CustomerName;
	String CustomerType;
	double amount;
	//constructor
	EnterpriseCustomer(String custID ,String custName,String custType,double amt){
		super(custID,custName,custType);
		this.CustomerID=custID;
		this.CustomerName=custName;
		this.CustomerType=custType;
		this.amount=amt;
	}

	//method
	double get_final_amount(double interest,int year) { 
	double simple_interest=this.amount * interest * year;
	double amount = this.amount+simple_interest;
	
	//final 500 rupees discount for all enterprise employees
	amount=amount-500;
	if(this.CustomerType=="SmallScale") {
		return amount-100;
	}
	else if(this.CustomerType=="BigScaller") {
		return amount;
	}
	//besides the above customer types we will return the amount calculated
	return amount;
	}
}
