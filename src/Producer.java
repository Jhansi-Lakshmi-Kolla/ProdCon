
public class Producer extends Thread {

	SharedClass c;

	public Producer(SharedClass obj) {
		// TODO Auto-generated constructor stub
		this.c = obj;
	}

	@Override
	public void run() {
		while(true) {
			int val = (int) (Math.random() * 10);
			c.produce(val);
			System.out.println("Producer  put: " + val);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}

}
