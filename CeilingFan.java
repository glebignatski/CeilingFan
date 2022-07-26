
public class CeilingFan {
	
	// the fan comes turned off
	int speed = 0;
	boolean status = false;

	public static void main(String[] args) {
		// testing the fan
		CeilingFan c = new CeilingFan();
		
		// test 1: two increase operations
		System.out.println("----------------Test 1----------------");
		c.increaseSpeed();
		c.increaseSpeed();
		
		// test 2: three increase operations
		c = new CeilingFan();
		System.out.println("----------------Test 2----------------");
		c.increaseSpeed();
		c.increaseSpeed();
		c.increaseSpeed();
		
		// test 3: increase operation and an off operation
		c = new CeilingFan();
		System.out.println("----------------Test 3----------------");
		c.increaseSpeed();
		c.off();
		
		// test 4: off operation when fan is off
		c = new CeilingFan();
		System.out.println("----------------Test 4----------------");
		c.off();

	}
	
	// pull cord #1: used to increase the speed of the fan
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
	
	// pull cord #2: used to turn off the fan
	public void off() {
		if (status) {
			this.speed = 0;
			this.status = false;
			System.out.println("The fan is turned off\n");
		}
		else {
			System.out.println("The fan is already off");
		}
	}

}
