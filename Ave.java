package Al7;

public class Ave extends Animal{
    private String cordepenas;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Grãos");

    }

    @Override
    public void emitirsom() {
        System.out.println("Assovios");

    }
    public void fazerninho() {
        System.out.println("Ninho");
    }

    public String cordepenas() {
        return cordepenas;
    }

    public Ave setCordepenas(String cordepenas) {
        this.cordepenas = cordepenas;
        return this;
    }
}
