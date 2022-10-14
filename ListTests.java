import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.*;

class StrChecker implements StringChecker{
    @Override
    public boolean checkString(String s){
        if(s.contains("c"))
            return true;
        return false;
    }
}

public class ListTests{
  @Test
  public void testListFiltr_1() {
    List<String> input1 = new ArrayList<>();
    input1.add("aaa");
    input1.add("bbb");
    input1.add("ccc");
    input1.add("abc");
    input1.add("cde");

    List<String> result = new ArrayList<>();
    result.add("ccc");
    result.add("abc");
    result.add("cde");
    StringChecker sc = new StrChecker();
    assertEquals(result, ListExamples.filter(input1, sc));
  }

}
