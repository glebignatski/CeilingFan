import java.awt.*;
import javax.swing.*;

public class CeilingFan extends JPanel {

	// the fan comes turned off
	int speed = 0;
	boolean status = false;
	int id = 0;

	public static void main(String[] args) {
		// testing the fan
		JFrame frame = new JFrame();

		CeilingFan c = new CeilingFan();

		// test 1: one increase operation
		System.out.println("----------------Test 1----------------");
		c.id = 1;
		c.increaseSpeed();
		frame.setContentPane(c);
		frame.setSize(750, 700);
		frame.setVisible(true);

		// test 2: two increase operations
		c = new CeilingFan();
		System.out.println("----------------Test 2----------------");
		c.id = 2;
		c.increaseSpeed();
		c.increaseSpeed();
		frame = new JFrame();
		frame.setContentPane(c);
		frame.setSize(750, 700);
		frame.setVisible(true);

		// test 3: three increase operations
		c = new CeilingFan();
		System.out.println("----------------Test 3----------------");
		c.id = 3;
		c.increaseSpeed();
		c.increaseSpeed();
		c.increaseSpeed();
		frame = new JFrame();
		frame.setContentPane(c);
		frame.setSize(750, 700);
		frame.setVisible(true);

		// test 4: off operation, then increase once
		c = new CeilingFan();
		System.out.println("----------------Test 4----------------");
		c.id = 4;
		c.off();
		c.increaseSpeed();
		frame = new JFrame();
		frame.setContentPane(c);
		frame.setSize(750, 700);
		frame.setVisible(true);

		// test 5: increase twice, then turn off
		c = new CeilingFan();
		System.out.println("----------------Test 5----------------");
		c.id = 5;
		c.increaseSpeed();
		c.increaseSpeed();
		c.off();
		frame = new JFrame();
		frame.setContentPane(c);
		frame.setSize(750, 700);
		frame.setVisible(true);
	}

	// pull cord #1: used to increase the speed of the fan
	public void increaseSpeed() {
		// modulus operator required (speed can only be 0, 1, or 2), so the % operator
		// will maintain the speed in the cyclically increasing range 0-2
		this.speed = (this.speed + 1) % 3;
		this.status = this.speed > 0;
		if (this.speed > 0) {
			System.out.println("The fan is on");
			System.out.println("The speed is " + this.speed + "\n");
		} else {
			System.out.println("The fan is turned off\n");
		}
	}

	// pull cord #2: used to turn off the fan
	public void off() {
		if (status) {
			this.speed = 0;
			this.status = false;
			System.out.println("The fan is turned off\n");
		} else {
			System.out.println("The fan is already off");
		}
	}

	// visual demonstration of fan and its status
	public void paint(Graphics g) {
		g.drawOval(160, 180, 300, 300);
		g.drawLine(310, 180, 310, 80);
		g.drawLine(310, 480, 200, 520);
		g.drawLine(310, 480, 420, 520);
		g.setFont(new Font("", 0, 30));
		g.drawString("Test Case " + testCase(), 20, 40);
		g.drawString("The fan is " + (this.status == false ? "off" : "on"), 220, 330);

		// skip "Speed is 0"
		if (getSpeed() > 0) {
			g.drawString("Current Speed: " + getSpeed(), 200, 370);
		}
	}

	// return test case number
	public int testCase() {
		return this.id;
	}

	// return the current speed of the fan
	public int getSpeed() {
		return this.speed;
	}

}
