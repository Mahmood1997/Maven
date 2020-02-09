//this is the child class or the sub class both mean the same thing 
class BMW extends Car{

		public int SS;
		public BMW (int gear, int speed, int startspeed){
			// 2 parameters set to the class
			super(gear, speed);
			SS = startspeed;
		}	//encapsulation  getter and setter
			public void setNum(int newValue){
				SS = newValue;
			}
			
			public String toString(){
				return (super.toString()+ "\nStart Speed is: "+ SS+"mph");
			}
}


