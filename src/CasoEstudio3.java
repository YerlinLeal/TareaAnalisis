import domain.ArrayList;
import domain.Iterator;

public class CasoEstudio3 {

    public static void main(String[] args){
        ArrayList array = new ArrayList();
        array.add("Hola mundo!!");
        array.add(123);
        array.add(true);

        System.out.println("Estoy vacio?: " + array.isEmpty());
        System.out.println(array.get(0));

        Iterator myIterator = array.createIterator();

        System.out.println("\n Iterador corriendo------------------");

        while (myIterator.hasMore()){
            System.out.println("Next: " + myIterator.getNext());
        }

    }

}
