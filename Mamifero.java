package Al7;

public class Mamifero extends Animal{
    private  String corpelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");

    }

    @Override
    public void alimentar() {
        System.out.println("Mamamndo");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de mamifero");
    }

    public String corpelo() {
        return corpelo;
    }

    public Mamifero setCorpelo(String corpelo) {
        this.corpelo = corpelo;
        return this;
    }
}
