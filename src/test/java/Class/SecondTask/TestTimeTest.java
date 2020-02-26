package Class.SecondTask;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestTimeTest {
    TestTime testTime=new TestTime();
    @Test
    void check(){
        ArrayList<Integer> mixed1 = new ArrayList<>();
        mixed1.add(1);
        mixed1.add(2);
        mixed1.add(3);
        ArrayList<Integer> mixed2 = new ArrayList<>();
        mixed2.add(3);
        mixed2.add(4);
        mixed2.add(5);
        List<Integer> actual=testTime.joinall(mixed1,mixed2);
        List<Integer> expected= Arrays.asList(1,2,3,4,5);
        assertEquals(expected,actual);


    }

}