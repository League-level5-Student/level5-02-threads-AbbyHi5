package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	
	private int number;

	public ThreadedGreeter(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread " + number);
		if (number < 50) {
			Thread t = new Thread(new ThreadedGreeter(number + 1));
			t.start();
		}
	}

}
