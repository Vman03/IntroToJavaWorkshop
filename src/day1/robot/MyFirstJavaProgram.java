package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot Beatbox = new Robot();
		Beatbox.setPenColor(Color.ORANGE);
		Beatbox.penDown();
		Beatbox.setSpeed(5);

		Beatbox.setPenColor(Color.MAGENTA);

		Beatbox.setPenColor(Color.CYAN);

		Beatbox.setPenColor(Color.CYAN);
		Beatbox.penDown();

		for (int i = 0; i < 4; i++) {
			Beatbox.move(200);
			Beatbox.turn(45);

		}

	}

}
