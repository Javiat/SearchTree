public class Nodo {
  
  private String dato;
  private Nodo nodoHijo1;
  private Nodo nodoHijo2;
  private Nodo nodoHijo3;
 
  
  public Nodo(String dato){
    this.dato = dato;
  }
  
  public Nodo getNodoHijo1(){
    return nodoHijo1;
  }
 
  public Nodo getNodoHijo2(){
    return nodoHijo2;
  }
  public Nodo getNodoHijo3(){
	    return nodoHijo3;
	 }
 
  public void setNodoHijo1(Nodo nodo){
    nodoHijo1 = nodo;
  }
  
	 
  public void setNodoHijo2(Nodo nodo){
	    nodoHijo2 = nodo;
  }
  public void setNodoHijo3(Nodo nodo){
	    nodoHijo3 = nodo;
}

  
  public String getDato(){
    return dato;
  }


public String toString() {
	return dato;
}
}