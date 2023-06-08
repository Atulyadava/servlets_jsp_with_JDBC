package my;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration
		String one ="string function program";
		String two ="string function";
		//get unicode character at specific index
		System.out.println(one.codePointAt(4));
		
		//get unicode character before specific index
		System.out.println(one.codePointBefore(4));
		
		//counting number of  unicode character between specific index given
		System.out.println(one.codePointCount(0,4));
		
		//compare two Strings lexicographically
		System.out.println("\nSgtring comparision function");
		System.out.println(one.compareTo(two));
		
		//compare two Strings lexicographically ignore case
		System.out.println(one.compareToIgnoreCase(two));
		
		//appends a string with another
		System.out.println("\nconcatenated string");
		System.out.println(one.concat(two));
		
		//checks contains a string with another
		System.out.println(one.contains(two));
		
		//string ends with specific index
		System.out.println(one.endsWith("am"));
		
		//checks a strings equals or not
		System.out.println(one.equals(two));
		
		//checks a strings equals or not ignoring the case
		System.out.println(one.equalsIgnoreCase(two));	
		
		//hash code for string computed like this
		//s[0]*31^(n-1)+s[1]*31^(n-2)+...+s[n]*31
		System.out.println(one.hashCode());
		
		//get the position first occurrence of specific character
		System.out.println(one.indexOf("program"));
		
		//if string is empty
		String three="my program";
		System.out.println(three.isEmpty());
		
		//get the position first occurrence of specific character
		System.out.println("last occurrence position string function");
		System.out.println(one.lastIndexOf("program"));
		
		//get string length
		System.out.println(one.length());
		 //replace 
		System.out.println(three.replace("program"," code"));
		System.out.println(three);
		
		
		//string starts with specific index
		System.out.println(one.startsWith("string"));
		
		//string convert in lower case and upper case
		System.out.println(one.toLowerCase());
		System.out.println(one.toUpperCase());
		
		//trim 
		String four = "   this is a leptop";
		System.out.println(four.trim());
		
		
		
		
	}

}
