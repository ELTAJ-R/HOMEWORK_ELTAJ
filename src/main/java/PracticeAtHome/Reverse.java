package PracticeAtHome;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Reverse {
    public static void main(String[] args) {
        List<String>names=Arrays.asList("Jane","Tom","Henry","Joshua");
        System.out.println(reverse(names));

    }

 public static ArrayList<Object> reverse(List examp){
      ArrayList<Object> ob = new ArrayList<>();
      for(int i=examp.size()-1;i>=0;i--){
            ob.add(examp.get(i));

        }
      return ob;
    }
}
