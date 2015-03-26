package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Capricornio extends Signo {
    public Capricornio(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {

        this.listadefrases.add("A adversidade é um espelho que reflete o verdadeiro eu.");
        this.listadefrases.add("Lamentar aquilo que não temos é desperdiçar aquilo que já possuímos.");
        this.listadefrases.add("Uma bela flor é incompleta sem suas folhas.");
        this.listadefrases.add("Sem o fogo do entusiasmo, não há o calor da vitória.");
        this.listadefrases.add("Não há melhor negócio que a vida. A gente há obtém a troco de nada.");
        this.listadefrases.add("O riso é a menor distância entre duas pessoas.");

    }
}
