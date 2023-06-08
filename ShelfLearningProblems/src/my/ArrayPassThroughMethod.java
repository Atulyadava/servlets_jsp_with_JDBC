package my;

public class ArrayPassThroughMethod {
	//static void minimum(int arr[]) {
		static void minimum() {
//		int value =arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(value >arr[i]) {
//				value =arr[i];
//			}	
		int x[]= {23,5,9,1}; 
		for(int element:x) {
			System.out.print(element);
			System.out.print(" ");
		}
		
		}
	//	System.out.println(value);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x[]= {23,5,9,1};
		ArrayPassThroughMethod obj= new ArrayPassThroughMethod();
		//obj. minimum(x);
		obj. minimum();
       
	}

}
