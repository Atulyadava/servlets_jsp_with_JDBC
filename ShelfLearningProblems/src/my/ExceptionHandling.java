package my;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception handling Demo program starts here....");
		try {
			//uncommenting below will throw ArithmeticExeption
			//int num=28/0;
			int arr[]= {10,20,40,50,382,34};
			//uncommenting below will throw ArrayIndexOutofboundsException
			//System.out.println(arr[10]);
			String str=null;
			//uncommenting the below line will throw NullPointerException
			System.out.println(str.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Denominatr should not be Zero while Dividing number");
			System.out.println("Error: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User is tring to access Index loction outside the array boundary ");
			System.out.println("Error: "+e);
		}
		catch(NullPointerException e) {
			System.out.println("User is tring to perform operationson nill value");
			System.out.println("Error: " +e);
		}
		finally {
			System.out.println("this block always executes....");
		}

	}

}
