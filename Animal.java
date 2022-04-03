package Al7;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirsom();

    public float peso() {
        return peso;
    }

    public Animal setPeso(float peso) {
        this.peso = peso;
        return this;
    }

    public int idade() {
        return idade;
    }

    public Animal setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public int membros() {
        return membros;
    }

    public Animal setMembros(int membros) {
        this.membros = membros;
        return this;
    }
}
