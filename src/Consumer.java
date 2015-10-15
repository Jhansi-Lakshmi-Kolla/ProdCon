
public class Consumer extends Thread{
	
	SharedClass c;
	
	public Consumer(SharedClass obj) {
		// TODO Auto-generated constructor stub
		this.c = obj;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
            int value = c.consume();
            System.out.println("Consumer got " + value);
		}
	}

}
