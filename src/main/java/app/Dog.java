package app;


public class Dog extends Animal {
 String name;
         Dog(String name){
     this.name=name;
    }
   @Override public String toString(){
       return "Dog{"+"I am a dog.My name is'"+name+'\''+'}';

    }
  }



