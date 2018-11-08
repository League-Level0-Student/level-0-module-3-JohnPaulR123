package modulo;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	public static void main(String[] args) {
		drawSquare();
		drawTriangle();
	}

	static void drawSquare() {
		Thanos.penDown();
		Thanos.setSpeed(50);
		for (int i = 0; i < 4; i++) {
			Thanos.move(100);
			Thanos.turn(90);
		}
		Thanos.penUp();
		Thanos.turn(-90);
		Thanos.move(200);
		Thanos.turn(90);
	}
	static void drawTriangle() {
	Thanos.setSpeed(50);
	Thanos.penDown();
	Thanos.turn(45);
	Thanos.move(100);
	Thanos.turn(90);
	Thanos.move(100);
	Thanos.turn(135);
	Thanos.move(100);
	}
	static Robot Thanos = new Robot();
	
}