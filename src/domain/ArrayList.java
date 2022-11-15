package domain;

public class ArrayList<E> implements Iterable, List <E>{

    private E[] elementos;
    private int contador;
    private int totalElementos = 100;

    public ArrayList(E[] elementos, int contador) {
        this.elementos = elementos;
        this.contador = contador;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(this);
    }

    @Override
    public boolean add(E object) {
        if(this.contador <= this.totalElementos){
            this.elementos[contador] = object;
            contador++;
            return true;
        }
        return false;

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

    @Override
    public Object get(int i) {
        return this.elementos[i];
    }
}
