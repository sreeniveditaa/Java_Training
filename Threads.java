package new1;

public class Threads implements Runnable{
	public static void main(String[] args) {
		Threads threads = new Threads();
		Thread thread = new Thread(threads);
		thread.start();
		
	}

	@Override
	public void run() {
		for (int i=0;i<=20;i++) {
			System.out.println(i);
		}
		
	}

}
