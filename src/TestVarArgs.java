
public class TestVarArgs {

	//method definition
	                        //n1 is parameter
	public static void process(int n,char...n1) {
		for (char i : n1) {
			System.out.println(i);
		}
	}
	
	public static void main(String...args) {

		//calling the method
		//  10 is argument
		process(10,'H','E','L','L','O');
		
	}

}


