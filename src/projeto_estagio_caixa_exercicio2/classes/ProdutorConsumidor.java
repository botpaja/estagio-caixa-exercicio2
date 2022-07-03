package projeto_estagio_caixa_exercicio2.classes;
import java.util.LinkedList;

    public class ProdutorConsumidor {
    	
    	int valor = 1;
 
        public void produzir(int numero, LinkedList<Integer> f, int capacidadeLista) throws InterruptedException {
            
            while (true) {
                synchronized (this) {
                    while (f.size() == capacidadeLista) {
                        wait();
                    }
 
                    System.out.println("Celular "+numero+ ": mensagem " + valor);

                    f.add(valor++);
 
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
 
        public void consumir(LinkedList<Integer> f, int capacidadeLista) throws InterruptedException{
        	
            while(true){
                synchronized (this){
                    while(f.size() == 0) {
                        wait();
                    }
 
                    int numeroMensagem = f.removeFirst();
 
                    System.out.println("Mensagem "+ numeroMensagem +" encaminhada");
 
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
