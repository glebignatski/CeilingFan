
public class CeilingFan {
	
	// the fan comes turned off
	int speed = 0;
	boolean status = false;

	public static void main(String[] args) {
		// testing the fan
		
		// test 1: two increase operations
		System.out.println("----------------Test 1----------------");
		CeilingFan c1 = new CeilingFan();
		c1.increaseSpeed();
		c1.increaseSpeed();
		
		// test 2: three increase operations
		CeilingFan c2 = new CeilingFan();
		System.out.println("----------------Test 2----------------");
		c2.increaseSpeed();
		c2.increaseSpeed();
		c2.increaseSpeed();
		
		// test 3: increase operation and an off operation
		CeilingFan c3 = new CeilingFan();
		System.out.println("----------------Test 3----------------");
		c3.increaseSpeed();
		c3.off();

	}
	
	// pull cord #1 that is used to increase the speed of the fan
	public void increaseSpeed() {
		// modulus operator needed to cycle over the settings
		this.speed = (this.speed + 1) % 3;
		this.status = this.speed > 0;
		if (this.speed > 0) {
			System.out.println("The fan is on");
			System.out.println("The speed is " + this.speed + "\n");
		}
		else {
			System.out.println("The fan is turned off\n");
		}
	}
	
	// pull cord #2 that is used to turn off the fan
	public void off() {
		this.speed = 0;
		this.status = off;
		System.out.println("The fan is turned off\n");
	}

}
