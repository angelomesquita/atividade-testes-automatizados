import org.junit.Before;
import org.junit.Test;

public class DirectorTest {

    private BusinessPosition director;

    @Before
    public void setUp() throws Exception {
        this.director = new Director(1000.0);
    }


    @Test
    public void testDirectorBonus(){
//        BusinessPosition director = new Director(1000.0);
        assert this.director.calculateBonus() == 6500.0;
    }

    @Test
    public void testDirectorSalary(){
        assert this.director.calculateSalary() == 725.0;
    }
}
