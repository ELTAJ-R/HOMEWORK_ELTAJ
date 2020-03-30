package PracticeInClass;

import java.util.ArrayList;

public class IsPalindrome {

 public boolean check(int n) {
    String op=Integer.toString(n);
    ArrayList<Character> ch=new ArrayList<>();
    ArrayList<Character> compare=new ArrayList<>();
    for(int i=0;i<op.length();i++){
      ch.add(op.charAt(i));
    }
    for(int a=op.length()-1;a>=0;a--){
      ch.add(op.charAt(a));
    }
    return ch.equals(compare);
  }
}
