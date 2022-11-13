package domain;

public class ArrayListIterator implements Iterator{

    private int positionVisited;
    private ArrayList arrayList;

    public ArrayListIterator (ArrayList arrayListParam){
        this.arrayList = arrayListParam;
    }

    @Override
    public Object getNext() {
        return null;
    }

    @Override
    public boolean hasMore() {
        return false;
    }

}
