
public class Main {
    static Cows a = new Cows("small");
    static Cows b = new Cows("large");
    public static void main(String[] args) {
        a.getCount();
        b.getCount();
        b.getSize();
        a.getSize();
    }
}