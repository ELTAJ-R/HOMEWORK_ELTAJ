package PracticeInClass;

public class Data {
   final boolean tr;
  final   int index;
  final   int value;

    public Data(boolean tr, int index, int value) {
        this.tr = tr;
        this.index = index;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "tr=" + tr +
                ", index=" + index +
                ", value=" + value +
                '}';
    }
}
