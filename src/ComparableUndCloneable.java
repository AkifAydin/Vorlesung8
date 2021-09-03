public class ComparableUndCloneable implements Comparable<ComparableUndCloneable>, Cloneable {

    private String vorname, name;

    public ComparableUndCloneable(String vn, String nn) {
        this.vorname = vn;
        this.name = nn;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ComparableUndCloneable cp = new ComparableUndCloneable("Akif", "Aydin");
        ComparableUndCloneable cp2 = new ComparableUndCloneable("Onur", "Aslan");
        System.out.println(cp.clone());
        System.out.println(cp);
        System.out.println(cp.compareTo(cp2));
    }

    @Override
    public int compareTo(ComparableUndCloneable o) {
        int res = vorname.compareTo(o.vorname);
        if (res == 0) {
            return 0;
        } else if (res < 0){
            return -1;
        }
        else return 1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
       ComparableUndCloneable c = (ComparableUndCloneable)super.clone();
       return c;
    }

}
