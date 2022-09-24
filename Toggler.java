public class Toggler {
    private boolean state;

    public Toggler(boolean setState) {
        state = setState;
    }

    public boolean toggle() {
        state = !state;
        return state;
    }

    public static void main(String[] args) {
        Toggler t = new Toggler(true);
        System.out.println(t.toggle());
        System.out.println(t.toggle());
    }
}
