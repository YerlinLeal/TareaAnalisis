package domain;

public interface Iterator <E>{

    public <E> E getNext();
    public boolean hasMore();

}
