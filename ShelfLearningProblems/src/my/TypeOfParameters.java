package my;

public class TypeOfParameters {

	//int v=500;
	//void change(int v) {
		void change(int...v) {
		//v+=100
			for(int a:v) {
		System.out.println("my name is atul");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TypeOfParameters obj= new TypeOfParameters();
       // System.out.println("Before making change "+obj.v);
        obj.change(500,23,45);
        //System.out.println("Aafter change made"+obj.v);
	}


}