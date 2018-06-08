import java.util.LinkedList;
import java.util.Queue;

public class Grafo {

	public static void main(String[] args) {
	    Nodo raiz=crearArbol();
	    bfs(raiz); 
	  }
	 
	private static Nodo crearArbol() {
		Nodo raiz = new Nodo("STF");
	    Nodo nodo2 = new Nodo("AIT");
	    Nodo nodo3 = new Nodo("QO");
	    Nodo nodo4=new Nodo("LP");
	    Nodo nodo5=new Nodo("AS");
	    Nodo nodo6=new Nodo("LP");
	    Nodo nodo7=new Nodo("AIT");
	    Nodo nodo8=new Nodo("STF");
	    Nodo nodo9=new Nodo("QO");
	    Nodo nodo10=new Nodo("STF");
	    Nodo nodo11=new Nodo("STF");
	    raiz.setNodoHijo1(nodo2);
	    raiz.setNodoHijo2(nodo3);
	    raiz.setNodoHijo3(nodo4);
	    nodo2.setNodoHijo1(nodo5);
	    nodo2.setNodoHijo2(nodo6);  
	    nodo3.setNodoHijo1(nodo7);
	    nodo4.setNodoHijo1(nodo8);
		nodo5.setNodoHijo1(nodo9);
		nodo5.setNodoHijo2(nodo10);   
		nodo7.setNodoHijo2(nodo11);
		return raiz;
	}
	
		
	  private static void bfs(Nodo raiz) {
		  Queue<Nodo> cola=new LinkedList();
		  Queue<Nodo> colaaux=new LinkedList();
		  Nodo aux=new Nodo("");
		  if(raiz!=null) {
			  cola.add(raiz);
			  
			  while(!cola.isEmpty()) {
				  aux=cola.poll();
				  colaaux.add(aux);
				  
				  if(aux.getNodoHijo1()!=null) {
					  cola.add(aux.getNodoHijo1());
					  
				  }
				  if(aux.getNodoHijo2()!=null) {
					  cola.add(aux.getNodoHijo2());
					 
				  }
				  if(aux.getNodoHijo3()!=null) {
					  cola.add(aux.getNodoHijo3());
					 
				  }
				System.out.println();
			  }
			  
			 
		  }
	  }
	  


}
