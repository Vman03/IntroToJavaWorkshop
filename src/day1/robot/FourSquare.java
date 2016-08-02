package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot R4 = new Robot();
	
	void go() {
		// 4. Make the robot move as fast as possible
		R4.setSpeed(10);
		// 5. Set the pen width to 5
		R4.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			R4.setWindowColor(Color.ORANGE);
		
			// 7. Set the pen color to random
			R4.penDown();
			R4.setRandomPenColor();
			
			
			// 1. Call the drawSquare() method
				 drawSquare();
			// 8. Turn the robot 90 degrees to the right
				 R4.turn(90);
		}

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() { 
		for (int i = 0; i < 4; i++) {
			
		
		R4.move(250);
		R4.turn(90);
		}
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
