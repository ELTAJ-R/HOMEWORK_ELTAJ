package Class.SecondTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class TestTime {

    public ArrayList<Integer> joinall(ArrayList<Integer>mixed1, ArrayList<Integer>mixed2){

      Set<Integer> totalmixed=new HashSet<>();
      totalmixed.addAll(mixed1);
      totalmixed.addAll(mixed2);
      ArrayList<Integer>result=new ArrayList<>();
      result.addAll(totalmixed);
      return result;




    }



    }

