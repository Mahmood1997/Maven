//base class, super class,parent class all are the same meaning
class Car{
	
	
	public int gear;
	public int speed;
//constructor:
	public Car (int gear, int speed)
	{	
		this.gear = gear;
		this.speed = speed;
	}

	public void pushBreak(int decrement)
	{
		speed += decrement;
	}
	public void increaseSpeed(int increment)
	{
		speed += increment;
	}
	public String toString()
	{
		return("No. of gears are: "+gear+" Gears"
			+"\n"
			+"Speed of the Car is: "+speed+ "mph");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
