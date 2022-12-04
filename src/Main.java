import lib.MeArrays;
public class Main {
    public static void main(String[] args) {
        MeArrays arr = new MeArrays();
        arr.addItem("volvo");
        arr.addItem("volvo");
        arr.addItem("volvo");
        arr.addItem("volvo");
        System.out.println(arr.getItems());
    }
}