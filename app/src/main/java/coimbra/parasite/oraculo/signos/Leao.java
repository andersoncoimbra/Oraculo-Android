package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Leao extends Signo {
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {
        this.listadefrases.add("Você é jovem apenas uma vez. Depois precisa inventar outra desculpa.");
        this.listadefrases.add("É mais fácil conseguir o perdão do que a permissão.");
        this.listadefrases.add("Os defeitos são mais fortes quando o amor é fraco.");
        this.listadefrases.add("Amizade e Amor são coisas que podem virar uma só num piscar de olhos.");
        this.listadefrases.add("Surpreender e ser surpreendido é o segredo do amor.");
        this.listadefrases.add("Faça pequenas coisas agora e maiores coisas lhe serão confiadas cada dia.");
        this.listadefrases.add("Todo mundo é capaz de denominar uma dor, exceto quem a sente.");


    }
}
