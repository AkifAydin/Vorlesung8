class StaticTypeLegalOps {
    public static void main(String[] args) {
        A a = new B();
        //B b = new A();
        a.ma();
        System.out.println("(Casting von Typ A in Typ B um Methode mb aufrufen zu könnmen)");
        ((B)a).mb();

    }
}
