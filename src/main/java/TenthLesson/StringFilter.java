package TenthLesson;

public class StringFilter {

  public String StringFilter(String origin){
      origin=origin.replaceAll("[AaEeIiOoUu]","");
     return String.format(origin.toLowerCase());

  }



  }


