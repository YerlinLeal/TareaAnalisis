package domain;

public class ArrayListIterator implements Iterator{

    private int positionVisited;
    private ArrayList arrayList;

    public ArrayListIterator (ArrayList arrayListParam){
        this.arrayList = arrayListParam;
        this.positionVisited = 0;
    }

    @Override
    public Object getNext() {
        return this.arrayList.get(this.positionVisited++);
    }

    @Override
    public boolean hasMore() {
        if(this.positionVisited < this.arrayList.size()){
            return true;
        }
        return false;
    }

}
