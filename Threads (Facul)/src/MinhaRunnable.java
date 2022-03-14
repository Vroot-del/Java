
public class MinhaRunnable implements Runnable {

	@Override
	public void run() {
		for(int x = 1; x < 10; x++) {
			System.out.println("MinhaRunnable executando para o nome do Tópico: " + Thread.currentThread().getName());
		}
		
	}

}
