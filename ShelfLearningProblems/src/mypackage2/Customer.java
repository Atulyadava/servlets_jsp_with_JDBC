package mypackage2;

public abstract class Customer {
	String CustomerID;
	String CustomerName;
	String CustomerType;
    Customer(String custID,String custName,String custType){
    	this.CustomerID=custID;
    	this.CustomerName=custName;
    	this.CustomerType=custType;
    }
	void showCustomerDetails() {
		System.out.println("Customer Id: "+this.CustomerID);
		System.out.println("Customer Name: "+this.CustomerName);
		System.out.println("Customer Type: "+this.CustomerType);
	}
	abstract double get_final_amount(double interest,int year);
}
