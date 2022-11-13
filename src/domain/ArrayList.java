package domain;

public class ArrayList implements Iterable, List{

    private Object[] elementos;
    private int contador;
    private int totalElementos = 100;

    public ArrayList(){
        this.elementos = new Object[this.totalElementos];
        this.contador = 0;
    }

    @Override
    public Iterator createIterator() {
        return null;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
