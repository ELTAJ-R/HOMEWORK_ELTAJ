package app;

public class Cat extends Animal {
    String name;
    Cat(String name){
        this.name=name;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "I am a cat.My name is'" + name + '\'' +
                '}';
    }
}
