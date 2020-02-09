
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		if (x>10){
			System.out.println("Valid");
		}
		else if(x==10){
			System.out.println("equal");
		}
		else{
			System.out.println("invalid");
		}
		
		String Me_llamo= "BigRed";
		System.out.println(Me_llamo);
		for (int i = 0; i<=15; i++){
			System.out.println(Me_llamo+" "+ i);
		}
		int myadd = 200;
		for (int i = 0; i<=15; i++){
		myadd = myadd+2;
		}
	System.out.println(myadd);
		int a= 200;
		while (a <=230){
			System.out.println(Me_llamo+" "+ a);
			a++;
		}
		int j = 10;
		do{ System.out.println(j);
		j++;
		}while (j>15);
				
	}

}
