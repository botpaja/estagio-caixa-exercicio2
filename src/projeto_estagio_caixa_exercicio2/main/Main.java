package projeto_estagio_caixa_exercicio2.main;
import java.util.LinkedList;

import projeto_estagio_caixa_exercicio2.classes.ProdutorConsumidor;
import projeto_estagio_caixa_exercicio2.classes.ThreadConsumidor;
import projeto_estagio_caixa_exercicio2.classes.ThreadProdutor;

public class Main {
    public static void main(String[] args) throws InterruptedException{
    	
    	LinkedList<Integer> f = new LinkedList<>();
        int capacidadeFila = 6;
        
        final ProdutorConsumidor pc = new ProdutorConsumidor();
 
        ThreadProdutor t1 = new ThreadProdutor(1, f, capacidadeFila, pc);
        ThreadProdutor t2 = new ThreadProdutor(2, f, capacidadeFila, pc);
        ThreadProdutor t3 = new ThreadProdutor(3, f, capacidadeFila, pc);
        
        ThreadConsumidor t4 = new ThreadConsumidor(f, capacidadeFila, pc);
 
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
   }