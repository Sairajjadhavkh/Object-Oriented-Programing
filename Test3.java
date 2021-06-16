package lab;
/**
 * Synchronization is a capability to control the access of resources by multiple threads at a time. If U have a shared resource(File, Variable, Memory) and multiple threads are accessing this resource, U would want to allow only one thread to access the shared resource, then we think of Thread Synchronization. It is mainly required to prevent thread interference and consistency problem.  
 * To maintain locking mechanism to the resource, U could use synchronized block to ensure that once a thread enters that block, the other threads will wait till the Entered thread exits the block. In traditional programming it is called as CRITICAL SECTION or MUTEX. Mutex is the class that is used in Java to achieve this feature. 
 * */

public class Test3 extends Thread{
	 public void run()  {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Beep# dxfdxjhgcg "+i);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	static void usingLamda() {
		 Runnable sai=()->{
			 for(int i=0;i<10;i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Beep# axb hjagvghcdgfacgavgcvgaycvgvahjcb hjavcghavcg "+i);
					}catch(Exception e) {
						e.printStackTrace();
					}
		 }
	 };
	 Thread obj1=new Thread(sai);
	 obj1.start();
}
	public static void main(String[] args) throws Exception{
		MultiThreading sai=new MultiThreading();
		Test3 obj=new Test3();
		obj.start();
		sai.readLine();
		usingLamda();
		
		
		System.out.println("gcfcdlqbihdyv qyuhbd jk	vdtygw ");
	}	
}


class MultiThreading{
	void readLine() throws Exception{
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
			System.out.println("Beep#"+i);
		}
	}
}