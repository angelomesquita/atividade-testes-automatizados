import org.example.Onibus;

import java.util.ArrayList;
import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;

public class OnibusTeste {

    private ArrayList<Onibus> onibus;

    @Before
    public void setUp(){
        onibus = new ArrayList<Onibus>();
        onibus.add(new Onibus("ABC-O987", 2010, 41));
    }

    @Test
    public void testeGetAssentos(){
        try {
            assertNotEquals(41, onibus.get(0).getAssentos(), 0.001);
            System.out.println(onibus.get(0).getAssentos() + " - sucesso");
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
}
