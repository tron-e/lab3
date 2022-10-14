import static org.junit.Assert.*;
import org.junit.*;

public class ListTests{

    @Test
    public void test1(){
        String[] input1 = {"apple", "cat", "effort"};
        String[] input2 = {"bat", "dap", "fail"};
        String[] ans = {"apple", "bat","cat","dap", "effort", "fail"};

        List<String> list1 = makeList(input1);
        

        assertArrayEquals(ans, ListExamples.merge);
    }
}