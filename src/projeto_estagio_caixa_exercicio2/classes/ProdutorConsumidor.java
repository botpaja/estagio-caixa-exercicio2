package projeto_estagio_caixa_exercicio2.classes;
import java.util.LinkedList;

    public class ProdutorConsumidor {
    	
    	int valor = 1;
 
        public void produzir(int numero, LinkedList<String> f, int capacidadeLista) throws InterruptedException {
            
            while (true) {
                synchronized (this) {
                    while (f.size() == capacidadeLista) {
                        wait();
                    }
 
                    System.out.println("Celular "+numero+ ": Mensagem " + valor);

                    f.add("Mensagem "+valor++);
 
                    notify();
                    Thread.sleep(500);
                }
            }
        }
 
        public void consumir(LinkedList<String> f, int capacidadeLista) throws InterruptedException{
        	
            while(true){
                synchronized (this){
                    while(f.size() == 0) {
                        wait();
                    }
 
                    String mensagem = f.removeFirst();
 
                    System.out.println(mensagem +" encaminhada");
 
                    notify();
                    Thread.sleep(500);
                }
            }
        }
    }
