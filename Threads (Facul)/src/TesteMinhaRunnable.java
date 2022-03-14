
public class TesteMinhaRunnable {

	public static void main(String[] args) {
		
		MinhaRunnable Minharunnable = new MinhaRunnable();
		Thread t1 = new Thread(Minharunnable);
		t1.setName("Teste-1 Thread");
		t1.start();
		Thread t2 = new Thread(Minharunnable);
		t2.setName("Teste-2 Thread");
		t2.start();
		Thread t3 = new Thread(Minharunnable);
		t3.setName("Teste-3 Thread");
		t3.start();

	}

}
