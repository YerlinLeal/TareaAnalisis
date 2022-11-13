package domain;

public class ArrayList implements Iterable, List{

    private Object[] elementos;
    private int contador;
    private int totalElementos = 100;

    public ArrayList(){
        this.elementos = new Object[this.totalElementos];
        this.contador = 0;
    } // constructor

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(this);
    }

    @Override
    public boolean add(Object object) {
        if(this.contador <= this.totalElementos){
            this.elementos[contador] = object;
            contador++;
            return true;
        }
        return false;
    }

    @Override
    public Object get(int i) {
        return this.elementos[i];
    }

    @Override
    public boolean isEmpty() {
        if (this.contador == 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.contador;
    }

}
