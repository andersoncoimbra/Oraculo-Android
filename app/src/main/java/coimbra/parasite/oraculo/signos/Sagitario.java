package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Sagitario extends Signo {
    public Sagitario(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {
        this.listadefrases.add("Você é do tamanho do seu sonho.");
        this.listadefrases.add("O mundo tem a cor que você pinta.");
        this.listadefrases.add("Pare de procurar eternamente; a felicidade está bem ao seu lado.");
        this.listadefrases.add("Conhecimento é a única virtude e ignorância é o único vício.");
        this.listadefrases.add("O nosso primeiro e último amor é… o amor-próprio.");
        this.listadefrases.add("Deixe de lado as preocupações e seja feliz.");
        this.listadefrases.add("A vontade das pessoas é a melhor das leis.");
        this.listadefrases.add("Nós somos o que pensamos.");

    }
}
