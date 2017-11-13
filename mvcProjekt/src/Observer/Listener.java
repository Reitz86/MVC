package Observer;

public final class Listener extends Observer {

    private final String name;
    private final Radio radio;

    public Listener(String name, Radio radio) {
        this.name = name;
        this.radio = radio;
        radio.attach(this);
        this.update();
    }

    @Override
    public void update() {
        System.out.println("Hi, I'm " + this.name + " and am listening to station " + this.radio.getStation());
    }
}
