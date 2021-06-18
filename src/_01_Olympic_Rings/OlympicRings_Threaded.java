package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(200, 700);
		Robot yellow = new Robot(300, 800);
		Robot black = new Robot(400, 700);
		Robot green = new Robot(500, 800);
		Robot red = new Robot(600, 700);

		Thread blueMove = new Thread(() -> {
			blue.setPenColor(Color.BLUE);
			blue.penDown();
			blue.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				blue.move(2);
				blue.turn(1);
			}

		});
		Thread yellowMove = new Thread(() -> {
			yellow.setPenColor(Color.YELLOW);
			yellow.penDown();
			yellow.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				yellow.move(2);
				yellow.turn(1);
			}

		});
		Thread blackMove = new Thread(() -> {
			black.setPenColor(Color.BLACK);
			black.penDown();
			black.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				black.move(2);
				black.turn(1);
			}

		});
		Thread greenMove = new Thread(() -> {
			green.setPenColor(Color.GREEN);
			green.penDown();
			green.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				green.move(2);
				green.turn(1);
			}

		});
		Thread redMove = new Thread(() -> {
			red.setPenColor(Color.RED);
			red.penDown();
			red.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				red.move(2);
				red.turn(1);
			}

		});
		
		blueMove.start();
		yellowMove.start();
		blackMove.start();
		greenMove.start();
		redMove.start();

	}
}
