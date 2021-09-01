public class Derived extends Base {
    int data = 2;
    public void md() {
        System.out.println(data);
        super.md();
    }
}
