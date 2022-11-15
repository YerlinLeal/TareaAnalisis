package domain;

public interface List <E> {

    public boolean add (E object);
    public <E> E get (int i);
    public boolean isEmpty();
    public int size ();

}
