package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Aries extends Signo {
    public Aries(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {
        this.listadefrases.add("A vida trará coisas boas se tiveres paciência");
        this.listadefrases.add("Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você.");
        this.listadefrases.add("Não compense na ira o que lhe falta na razão.");
        this.listadefrases.add("Defeitos e virtudes são apenas dois lados da mesma moeda.");
        this.listadefrases.add("A maior de todas as torres começa no solo.");
        this.listadefrases.add("Não há que ser forte. Há que ser flexível.");

    }
}
