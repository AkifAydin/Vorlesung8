public class AlleAttributeStatischGeladen {
    public static void main(String[] args) {
        Base b = new Derived();
        System.out.println(b.data);
        b.md();
        ((Derived) b).md();
    }
}
