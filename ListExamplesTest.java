import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); } 

public class ListExamplesTest {

    @Test
    @SuppressWarnings("unchecked")
    public void test1(){

        String[] ans ={"tron","tetris", "letter"};

        List<String> listTest = new ArrayList();
        listTest.add("tron");
        listTest.add("tetris");
        listTest.add("salsa");
        listTest.add("letter"); 

        

        List<String> output = new ArrayList(ListExamples.filter(listTest ,  );

        assertEquals( ans, output);

    }
}
