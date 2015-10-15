
public class ProdConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedClass s = new SharedClass();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		p.start();
		c.start(); //commenting to see the changes on git
	}

}
