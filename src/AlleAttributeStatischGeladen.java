public class AlleAttributeStatischGeladen implements Halloduhallo{
    public static void main(String[] args) {
        Base b = new Derived();
        System.out.println(b.getClass());
        System.out.println(b.data);
        b.md();
        ((Derived) b).md();
    }


}
