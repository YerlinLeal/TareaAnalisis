/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.sa.rp.ie.analisis.casoestudio3;

import domain.ArrayList;
import domain.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alvam
 */
public class NewEmptyJUnitTest {

    @Before
    public void setUp() {
        Integer elementos[] = {1,2,3,4,5};
        ArrayList array = new ArrayList<>(elementos,5);
    }

    @Test
    public void test(){
        Integer elementos[] = {1,2,3,4,5};
        ArrayList array = new ArrayList<>(elementos,5);
        System.out.println("Estoy vacio?: " + array.isEmpty());
        System.out.println(array.get(0));

        Iterator myIterator = array.createIterator();

        System.out.println("\n Iterador corriendo------------------");

        while (myIterator.hasMore()){
            System.out.println("Next: " + myIterator.getNext());
        }
    }



    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
