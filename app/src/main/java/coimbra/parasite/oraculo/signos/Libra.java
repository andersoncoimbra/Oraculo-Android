package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Libra extends Signo {
    public Libra(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {
        this.listadefrases.add("A paciência na adversidade é o sinal de um coração sensível.");
        this.listadefrases.add("A sorte favorece a mente bem preparada.");
        this.listadefrases.add("Sua visão se tornará clara apenas quando você puder olhar dentro de seu coração.");
        this.listadefrases.add("Quem olha para fora sonha; quem olha para dentro acorda.");
        this.listadefrases.add("As pessoas se esquecerão do que você disse e do que você fez… mas nunca se esquecerão de como você as fez sentir.");
        this.listadefrases.add("Espere pelo mais sábio dos conselhos: o tempo.");


    }
}
