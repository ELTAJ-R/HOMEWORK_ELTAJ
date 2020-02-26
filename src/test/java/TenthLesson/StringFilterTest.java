package TenthLesson;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StringFilterTest {
    StringFilter filter=new StringFilter();

    @Test
    void StringFilter() {
       String expected="smn";
       String actual=filter.StringFilter("SOMEONE");
        assertEquals(expected,actual);
    }
}