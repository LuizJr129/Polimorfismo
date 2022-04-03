package Al7;

public class Repteis extends Animal{
    private String cordaescama;
    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Insetos");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de repteis");

    }

    public String cordaescama() {
        return cordaescama;
    }

    public Repteis setCordaescama(String cordaescama) {
        this.cordaescama = cordaescama;
        return this;
    }
}
