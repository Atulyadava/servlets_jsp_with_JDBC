package mypackage;
import java.util.*;
import java.util.function.*;
import java.util.*;
//program to demostrate ArrayList.forEach() method
class MyConsumer<T> implements Consumer<T>{
	public void accept(T ctask) {
		System.out.println("Working on the number "+ctask);
		System.out.println("Result after adding 5 to given number is:"+ ((int)ctask+5));
	}
}
public class UtilityPackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ArrayList myList=new ArrayList<>(5);
		MyConsumer mcons =new MyConsumer();
		
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		
		System.out.println(myList);
		myList.forEach(mcons);

	}

}
