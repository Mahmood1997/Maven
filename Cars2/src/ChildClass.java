
public class ChildClass extends BaseClass{
	
	public static void main(String[] args){
		ChildClass obj1= new ChildClass();
		obj1.calcCarEMI();
		obj1.calcHomeEMI();
		obj1.calculateHOA();
		obj1.offerService();
		
	}
	
	public void calcHomeEMI()
	{
		System.out.println("Your Home EMI is 50K");
	}
	
	public void calcCarEMI()
	{
		System.out.println("Your Car EMI is 25K");
	}

}
