
public class SharedClass {
	int N = 10;
	int[] buffer = new int[N];
	int head = 0;
	int tail = 0;
	
	public boolean isFull() {
		if (head == (tail + 1) % N) {
			return true;
		} else
			return false;
	}

	public boolean isEmpty() {
		if (head == tail) {
			return true;
		} else
			return false;
	}
	
	synchronized void produce(int i){
		while(isFull()){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		buffer[tail] = i;
		tail = (tail+1)%N;
		notifyAll();
	}
	
	synchronized int consume(){

		while(isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int r = buffer[head];
		head = (head+1)%N;
		notifyAll();
		return r;
	
	}
}
