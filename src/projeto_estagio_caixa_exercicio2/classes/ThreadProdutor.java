package projeto_estagio_caixa_exercicio2.classes;
import java.util.LinkedList;

public class ThreadProdutor extends Thread{
	
	private int numeroThread;
	private LinkedList<String> f;
	private int capacidadeFila;
	private ProdutorConsumidor pc;
	
	public ThreadProdutor(int numeroThread, LinkedList<String> f, int capacidadeFila, ProdutorConsumidor pc) {
		this.numeroThread = numeroThread;
		this.f = f;
		this.capacidadeFila = capacidadeFila;
		this.pc = pc;
	}
	
	@Override
	public void run() {
		try {
            pc.produzir(numeroThread, f, capacidadeFila);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
