package mypackage;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Excepton handling program demo starts here...");
		try {
			int num= 28/0;
			int arr[]= {23,45,6,38,97,23,10,40,2};
			System.out.println(arr[10]);
			String str =null;
			System.out.println(str.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator should not be  zero while dividing numver...");
			System.out.println("Error: " +e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User is trying to acces index location outside the array boundart");
			System.out.println("Error" +e);
		}
		catch(NullPointerException e){
			System.out.println("User trying to perform ooperation on null value ");
			System.out.println("Error "+ e);
			
		}

	}

}
