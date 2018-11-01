
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(150);
		rob.setSpeed(50);
		// 2. Make the robot draw a star shape. Hint: 144.
		for(int m=0;m<10;m++) {
		for(int i=0;i<5;i++) {
		rob.penDown();
		rob.move(30);
		rob.turn(144);
		}
		rob.penUp();
		rob.turn(90);
		rob.move(50);
		rob.turn(-90);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
