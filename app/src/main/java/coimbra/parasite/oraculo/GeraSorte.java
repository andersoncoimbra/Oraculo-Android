package coimbra.parasite.oraculo;

import coimbra.parasite.oraculo.signos.*;


/**
 * Criado por Anderson Coimbra em 24/03/2015.
 */

public class GeraSorte {
    private String frasegerada; //guadar as frase gerada pelo objeto do tipo signo

    public GeraSorte(String nome, int id){ //metodo contrutor do gerador de frases
        Signo s = null;  //Inicia a variavel do tipo signo num estado nulo

        switch (id){
            case 1:
                s = new Aries(nome); //Cria o objeto do tipo Aries
                break;
            case 2:
                s = new Touro(nome); //Cria o objeto do tipo Touro
                break;
            case 3:
                s = new Gemeos(nome); //Cria o objeto do tipo Gemeos
                break;
            case 4:
                s = new Cancer(nome); //Cria o objeto do tipo Cancer
                break;
            case 5:
                s = new Leao(nome); //Cria o objeto do tipo Leao
                break;
            case 6:
                s = new Virgem(nome); //Cria o objeto do tipo Virgem
                break;
            case 7:
                s = new Libra(nome); //Cria o objeto do tipo Libra
                break;
            case 8:
                s = new Escorpiao(nome); //Cria o objeto do tipo Escorpiao
                break;
            case 9:
                s = new Sagitario(nome); //Cria o objeto do tipo Sagitario
                break;
            case 10:
                s = new Capricornio(nome); //Cria o objeto do tipo Capricornio
                break;
            case 11:
                s = new Aquario(nome); //Cria o objeto do tipo Aquario
                break;
            case 12:
                s = new Peixe(nome); //Cria o objeto do tipo Peixe
                break;

            default:
                s = new DiretoDoAlem(nome); //Cria o objeto do tipo
        }

        frasegerada = s.getAfraseDeSorte(); // usa  oo metodo para recuperar a frase gerada pelo objeto

    }

    public String getFrasegerada() {
        return frasegerada;
    } //Getter para torna disponivel a frase
}
