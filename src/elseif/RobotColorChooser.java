//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot Thanos = new Robot();
		Thanos.setSpeed(5);
		Thanos.turn(90);
		Thanos.move(300);
		Thanos.turn(-90);
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 30; i++) {
			String color = JOptionPane.showInputDialog("What color would you like?");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (color.equals("Red")) {
				Thanos.setPenColor(255, 0, 0);
			}
			if (color.equals("Green")) {
				Thanos.setPenColor(0, 255, 0);
			}
			if (color.equals("Blue")) {
				Thanos.setPenColor(0, 0, 255);
			}
			// 6. If the user doesn’t enter anything, choose a random color
			if (color.equals("")) {
				Random r = new Random();
				Thanos.setPenColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10

			// 2. Make the robot draw a shape (this will take more than one line of code)
			Thanos.penDown();
			Thanos.turn(30);
			Thanos.move(100);
			Thanos.turn(120);
			Thanos.move(100);
			Thanos.turn(120);
			Thanos.move(100);
			Thanos.penUp();
			Thanos.move(50);
			Thanos.turn(90);

		}
	}
}