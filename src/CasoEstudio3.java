import domain.ArrayList;
import domain.Iterator;

public class CasoEstudio3 {

    public static void main(String[] args){
        //System.out.println("hola");
        Integer elementos[] = {1,2};
        ArrayList<Object> array = new ArrayList(elementos,2);

        System.out.println("Estoy vacio?: " + array.isEmpty());
        System.out.println(array.get(0));

        Iterator myIterator = array.createIterator();

        System.out.println("\n Iterador corriendo------------------");

        while (myIterator.hasMore()){
            System.out.println("Next: " + myIterator.getNext());
        }

    }

}
