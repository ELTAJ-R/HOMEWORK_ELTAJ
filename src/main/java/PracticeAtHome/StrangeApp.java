package PracticeAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrangeApp {
    public static void main(String[] args) {
        List<Integer>duplicate=new ArrayList<>();
        List<Integer>dif=new ArrayList<>();
        List<Integer>list= Arrays.asList(1,2,3,4,4,4,3,5,6);
        for (int i = 0; i < list.size(); i++) {
            if(dif.contains(list.get(i))){
                duplicate.add(list.get(i));
            }
            else dif.add(list.get(i));

        }
        System.out.println(duplicate);
    }
}
