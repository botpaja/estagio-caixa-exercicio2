package projeto_estagio_caixa_exercicio2.classes;
import java.util.LinkedList;

public class ThreadConsumidor extends Thread {
	
	private LinkedList<String> f;
	private int capacidadeFila;
	private ProdutorConsumidor pc;
	
	public ThreadConsumidor(LinkedList<String> f, int capacidadeFila, ProdutorConsumidor pc) {
		this.f = f;
		this.capacidadeFila = capacidadeFila;
		this.pc = pc;
	}
	
	@Override
	public void run()
    {
        try {
            pc.consumir(f, capacidadeFila);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
