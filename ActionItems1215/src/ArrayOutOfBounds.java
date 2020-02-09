
public class ArrayOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			int a[]= new int[4];
			a[1]=20;
			a[4]=30;
			a[10]=25;
		}
		
		catch(Exception y)
		{
			System.out.println(y);
		}
	}

}
