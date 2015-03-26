package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Peixe extends Signo {
    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {
        this.listadefrases.add("Todas as coisas são difíceis antes de se tornarem fáceis.");
        this.listadefrases.add("Você pode encontrar a si mesmo fazendo ou dizendo coisas que você nunca imaginou possíveis.");
        this.listadefrases.add("Se você se sente só é porque construiu muros ao invés de pontes.");
        this.listadefrases.add("Vencer é 90 por cento suor e 40 por cento técnica.");
        this.listadefrases.add("O amor está mais próximo do que você imagina.");
    }
}
