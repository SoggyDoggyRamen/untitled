public class Adult extends Human {
    private boolean fired;

    public Adult(String name, int age) {
        super(name, age);
        fired = false;
    }

    public boolean isFired() {
        return fired;
    }

    public void fired() {
        fired = true;
        System.out.println("YOU'RE FIRED!");
    }
}
