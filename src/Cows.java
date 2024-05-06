public class Cows {
    private static int count = 0;
    public String size;
    public Cows(String size) {
        this.size = size;
        count +=1;
    }
    void getCount () {
        System.out.printf("Your count is: %d\n", count);
    }
    void getSize () {
        System.out.printf("Your cow's size is %s\n", size);
    }
}
