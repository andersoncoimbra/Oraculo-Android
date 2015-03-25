package coimbra.parasite.oraculo;

import coimbra.parasite.oraculo.signos.DiretoDoAlem;
import coimbra.parasite.oraculo.signos.Signo;

/**
 * Criado por Anderson Coimbra em 24/03/2015.
 */

public class GeraSorte {
    private String nome;
    private String frasegerada;

    public GeraSorte(String nome, int id){
        this.nome = nome;
        Signo s = null;

        switch (id){
            case 0:
                s = new DiretoDoAlem(nome);

                break;
            default:
                s = new DiretoDoAlem(nome);
        }

        frasegerada = s.getAfraseDeSorte();

    }

    public String getFrasegerada() {
        return frasegerada;
    }
}
