package domain;

public class ArrayListIterator <E> implements Iterator <E> {

    private int positionVisited;
    private ArrayList arrayList;

    public ArrayListIterator( ArrayList arrayList) {
        this.positionVisited = 0;
        this.arrayList = arrayList;
    }

    @Override
    public <E> E getNext() {
        return (E) this.arrayList.get(this.positionVisited++);
    }

    @Override
    public boolean hasMore() {
        if(this.positionVisited < this.arrayList.size()){
            return true;
        }
        return false;
    }
}
