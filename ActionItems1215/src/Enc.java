//Parent class    Q1
public class Enc {

	public static void main(String[] args) {
		// Create a program using Encapsulation where you have firstName, LastName,
		//collegeName, studentID, zipcode. Print them all.
		//Print the data at once in a sentence?
			Encap obj = new Encap();
			obj.setFirstName("Mahmood");
			obj.setLastName("Khan");
			obj.setCollegeName("CCNY");
			obj.setID(38468883);
			obj.setZip(11216);
			
			//System.out.println(obj.getFirstName());
			//System.out.println(obj.getLastName());
			//System.out.println(obj.getCollegeName());
			//System.out.println(obj.getID());
			//System.out.println(obj.getZip());
			
			System.out.printf("Student First Name: "+ obj.getFirstName()+"; ");
			System.out.printf("Student Last Name: "+ obj.getLastName()+"; ");
			System.out.printf("College Attended: "+ obj.getCollegeName()+"; ");
			System.out.printf("Student ID: "+ obj.getID()+"; ");
			System.out.printf("Student Zip Code: "+ obj.getZip()+ "; ");
	}

}
	class Encap{//sub class or the child class(Constructor)
		private String FirstName;
		private String LastName;
		private String CollegeName;
		private int ID;
		private int Zip;
		//get methods
		public String getFirstName(){
			return FirstName;
		}
		
		public String getLastName(){
			return LastName;
		}
		
		public String getCollegeName(){
			return CollegeName;
		}
		
		public int getID(){
			return ID;
		}
		
		public int getZip(){
			return Zip;
		}
		//set methods 
		public void setFirstName(String newValue){
			FirstName = newValue;
		}
		
		public void setLastName(String newValue){
			LastName = newValue;
		}
		
		public void setCollegeName(String newValue){
			CollegeName = newValue;
		}
		
		public void setID(int newValue){
			ID = newValue;
		}
		
		public void setZip(int newValue){
			Zip = newValue;
		}//Q2. Basic for conditional to subtract 1 from the originating number 5
		//and basically counting 1 less until after x hits 1 and conditions are met.
		int x = 5;{
				for (int x=5; x>0; x--){
					System.out.println(x);
				}
					
		}
		//Q3. instead of using ++ and assigning a additive property of 1 
		//I used +=2 to assign an additive property of 2 and starting it 
		//at one thus printing all odd numbers 1-20   
		int y = 1;{
			for (int y=1; y<20; y+=2){
				System.out.println(y);
				}
		}
	
		//Q4.
		int g = 20;{
			for(int g=20; g>1; g-=2){
				System.out.println(g);
				}
		}
		//Q5.Used the method Khan to give different feedback/action/method 
		//depending on the value entered
		public void Khan(){
			System.out.println("Emperor");
		}
		
		public void Khan(int num){
			System.out.println("Whole Number");
		}
		
		public void Khan(double num){
			System.out.println("Decimal");
		}
		char O;
		public void Khan(char O){
		
			System.out.println("Redoy");
		}
		
		public void Khan(float Num){
			System.out.println("above water");
		}
		{Khan (5);
		{Khan ();
		{Khan(2.1);
		{Khan(3.56f);
		{Khan(O);
		}
		}
		}
		}
		}
		
		
	
	
	}