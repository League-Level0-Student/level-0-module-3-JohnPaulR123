package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	public static void main(String[] args) {

		String Shape = JOptionPane.showInputDialog("What Shape would you like me to draw?\n        Square  Triangle  Circle");

		String Color = JOptionPane.showInputDialog("What color would you like it?\n        Red Blue Green");

		if (Color.equalsIgnoreCase("Red")) {
			Thanos.setPenColor(255, 0, 0);
		}

		if (Color.equalsIgnoreCase("Blue")) {
			Thanos.setPenColor(0, 0, 255);
		}

		if (Color.equalsIgnoreCase("Green")) {
			Thanos.setPenColor(0, 255, 0);
		}

		if (Shape.equalsIgnoreCase("Square")) {
			drawSquare();
		}
		if (Shape.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		}
		if (Shape.equalsIgnoreCase("Circle")) {
			drawCircle();
		}
	}

	static void drawSquare() {
		Thanos.penDown();
		Thanos.setSpeed(50);
		for (int i = 0; i < 4; i++) {
			Thanos.move(100);
			Thanos.turn(90);
		}
		move();
	}

	static void drawTriangle() {
		Thanos.setSpeed(50);
		Thanos.penDown();
		Thanos.turn(45);
		Thanos.move(100);
		Thanos.turn(90);
		Thanos.move(100);
		Thanos.turn(135);
		Thanos.move(140);
		move();

	}

	static void drawCircle() {
		for (int i = 0; i < 361; i++) {
			Thanos.setSpeed(50);
			Thanos.penDown();
			Thanos.move(1);
			Thanos.turn(1);
		}
		move();
	}

	static void move() {
		Thanos.penUp();
		Thanos.move(200);
	}

	static Robot Thanos = new Robot();

}