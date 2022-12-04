import lib.MeArrays;
import lib.IsOdd;
public class Main {
    public static void main(String[] args) {
        MeArrays arr = new MeArrays();
        IsOdd o = new IsOdd();
        arr.addItem("volvo");
        arr.addItem("volvo");
        arr.addItem("volvo");
        arr.addItem("volvo");
        System.out.println("Array:"+arr.getItems()+" Is 3 odd:"+o.odd(3));
    }
}