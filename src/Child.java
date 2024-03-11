public class Child extends Human {
    private boolean napped;

    public Child(String name, int age) {
        super(name, age);
        napped = false;
    }

    public boolean isNapped() {
        return napped;
    }

    public void nap() {
        napped = true;
        System.out.println("Zzzzzzzzz...");
    }
}
