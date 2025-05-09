package new1;

public class MultiThread extends Thread{
	public static void main(String[] args) {
		MultiThread multiThread = new MultiThread();
		multiThread.start();
		
		MultiThread multiThread2 = new MultiThread();
		multiThread2.start();
		
		MultiThread multiThread3 = new MultiThread();
		multiThread3.start();
	}
	@override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(i);
		}
	}
	

}
