package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Gemeos extends Signo {
    public Gemeos(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {
        // adicionando as frases ao objetos Array list herdado de signos
        this.listadefrases.add("Nunca se fique triste por se apaixonar");
        this.listadefrases.add("O verdadeiro homem mede a sua força, quando se defronta com o obstáculo.");
        this.listadefrases.add("Você precisa fazer aquilo que pensa que não é capaz de fazer.");
        this.listadefrases.add("Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.");
        this.listadefrases.add("A adversidade desperta em nós capacidades que, em circunstâncias favoráveis, teriam ficado adormecidas.");
        this.listadefrases.add("A vida é para quem topa qualquer parada. Não para quem pára em qualquer topada.");

    }
}
