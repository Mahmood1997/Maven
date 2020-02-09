
public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
	//Try/catch block: allows you to catch error in your method to catch 
		//errors or bugs in detail when debugging the code
		{
			
		
		
			int a=5, b=0, c;
		
			c=a/b;
				
			System.out.println(c);

		}
	
		catch (Exception x)
		{
		System.out.println("Divide by zero output is: "+x);
		}

	}
}
