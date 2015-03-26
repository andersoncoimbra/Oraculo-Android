package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Virgem extends Signo {
    public Virgem(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {
        this.listadefrases.add("Você é do tamanho do seu sonho.");
        this.listadefrases.add("A maior barreira para o sucesso é o medo do fracasso.");
        this.listadefrases.add("O pessimista vê a dificuldade em cada oportunidade; O otimista vê a oportunidade em cada dificuldade.");
        this.listadefrases.add("Muitas das grandes realizações do mundo foram feitas por homens cansados e desanimados que continuaram trabalhando.");
        this.listadefrases.add("O insucesso é apenas uma oportunidade para recomeçar de novo com mais inteligência.");
        this.listadefrases.add("O futuro pertence àqueles que acreditam na beleza de seus sonhos.");
        this.listadefrases.add("Coragem é a resistência ao medo, domínio do medo, e não a ausência do medo.");

    }
}
