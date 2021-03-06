package fila;

public class Fila {
    
    private int[] valores;
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila() {
        this.valores = new int [10];
        this.primeiro = 0;
        this.ultimo = 0;
        this.total = 0;
    }
    
    
    
    public void inserir(int elemento){
    if(isFull()){
    throw new RuntimeException ("Fila cheia!");
    }    
    valores[ultimo] = elemento;
    ultimo = (ultimo + 1) % valores.length;
    total++;
    }
    
    public  int retirar(){
     if(isEmpty()){
    throw new RuntimeException ("Fila Vazia!");
    }      
        int elemento =  valores[primeiro];
        primeiro = (primeiro + 1 ) % valores.length;
        total--;
        return elemento;
    }
    
    public boolean isEmpty(){
        return total == 0;
    }
    
    public boolean isFull(){
        return total==valores.length;
    }
    

    
    public static void main(String[] args) {
        Fila fila = new Fila();
      fila.inserir(1);
      fila.inserir(2);
      fila.inserir(3);
      fila.inserir(4);
      
      while(!fila.isEmpty()){
      int x = fila.retirar();
          System.out.println("Retirei o numero: "+x);
      }
    }
    
}
