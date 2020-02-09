

public class Racer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars fast = new SuperCars();
		Cars slow = new NoCar();
			
			System.out.println(fast.speed());
			System.out.println(fast.acc());
			System.out.println(fast.model());
			System.out.println(slow.speed());
			System.out.println(slow.acc());
			System.out.println(slow.model());
		
		

	}

}
