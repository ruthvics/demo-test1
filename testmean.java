import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

public class testmean {

    public ArrayList<Integer> vals = new ArrayList<Integer>();

    @Test
    public void createList() {
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
    }

    @Test
    public void sum() {
        createList();
        System.out.println("JJ:" + vals.size());
        assertEquals(15, demotest.sum(vals));
    }

    @Test
    public void average1() {
        createList2();
        assertEquals(3, demotest.findMean(vals));
    }

    @Test
    public void createList2() {
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        vals.add(3);
    }

    @Test
    public void average2() {
        createList();
        assertEquals(3, demotest.findMean(vals));
    }

}
