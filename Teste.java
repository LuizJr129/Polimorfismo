package Al7;

public class Teste{
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Repteis r = new Repteis();
        Cachorro c = new Cachorro();


        m.setCorpelo("Preto");
        m.setIdade(2);
        m.setMembros(4);
        m.setPeso(1f);
        System.out.println("Mamiferos");
        System.out.println("Locomove: ");m.locomover();
        System.out.println("Alimenta: ");m.alimentar();
        System.out.println("Emite som: "); m.emitirsom();

        c.setCorpelo("Preto");
        c.setIdade(2);
        c.setMembros(4);
        c.setPeso(1f);
        System.out.println("Cachorro");
        System.out.println("Locomove: ");c.locomover();
        System.out.println("Alimenta: ");c.alimentar();
        System.out.println("Emite som: "); c.emitirsom();


        p.setCordaescama("Preto");
        p.setIdade(2);
        p.setMembros(0);
        p.setPeso(1f);
        System.out.println("Peixe");
        System.out.println("Locomove: ");p.locomover();
        System.out.println("Alimenta: ");p.alimentar();
        System.out.println("Emite som: "); p.emitirsom();
        System.out.println("Solta bolhas: "); p.soltarbolhas();


        a.setCordepenas("Preto");
        a.setIdade(2);
        a.setMembros(2);
        a.setPeso(1f);
        System.out.println("Ave");
        System.out.println("Locomove: ");a.locomover();
        System.out.println("Alimenta: ");a.alimentar();
        System.out.println("Emite som: "); a.emitirsom();
        System.out.println("Faz ninho: "); a.fazerninho();

        r.setCordaescama("Preto");
        r.setIdade(2);
        r.setMembros(4);
        r.setPeso(1f);
        System.out.println("Repteis");
        System.out.println("Locomove: ");r.locomover();
        System.out.println("Alimenta: ");r.alimentar();
        System.out.println("Emite som: "); r.emitirsom();

    }


}
