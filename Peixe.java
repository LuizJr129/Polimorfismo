package Al7;

public class Peixe  extends Animal{
    private String cordaescama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("frutos do mar");

    }

    @Override
    public void emitirsom() {
        System.out.println("Blup");
    }
    public void soltarbolhas(){
        System.out.println("Bolhas");
    }

    public String cordaescama() {
        return cordaescama;
    }

    public Peixe setCordaescama(String cordaescama) {
        this.cordaescama = cordaescama;
        return this;
    }
}
