package coimbra.parasite.oraculo.signos;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public class Cancer extends Signo {
    public Cancer(String nome) {
        super(nome);
    }

    @Override
    public void carregarFrases() {

        this.listadefrases.add("Siga os bons e aprenda com eles.");
        this.listadefrases.add("Não importa o tamanho da montanha, ela não pode tapar o sol.");
        this.listadefrases.add("O bom-senso vai mais longe do que muito conhecimento.");
        this.listadefrases.add("Quem quer colher rosas deve suportar os espinhos.");
        this.listadefrases.add("São os nossos amigos que nos ensinam as mais valiosas lições.");
        this.listadefrases.add("Uma iniciativa mal-sucedida não significa o final de tudo. Sempre existe uma nova oportunidade.");
        this.listadefrases.add("Aquele que se importa com o sentimento dos outros, não é um tolo.");

    }
}
