package coimbra.parasite.oraculo.signos;

import android.text.TextUtils;

import java.util.ArrayList;

import java.util.Random;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public abstract class Signo {
    private String nomeusuario; // receber o nome do usuario
    public ArrayList<String> listadefrases;//declaração do array para receber as frases
    Random indice; //declaração da variavel do tipo randomica
    private String afrasegerada; //declaração da variavel para receber a frase gerada

    public Signo(String nome){ //metdo construtor para iniciar o algoritimo que gera as frases
        listadefrases = new ArrayList<>(); //instancia do objeto Arraylist
        carregarFrases(); //metodo para carrega as frases no ArrayList
        indice = new Random(); //Instanciamento do objeto do tipo Randomico
        this.nomeusuario = nome;  //recebe do parametro o nome do usuario porem naos sera usado
        afrasegerada = listadefrases.get(indice.nextInt(listadefrases.size())); //Algoritimo que pega a frase aleatoriamente da lista defrase
        //usando tres metodos um para pega a a frase no Arralis um para gera um numero aleatotio o outro para determinar u limite de frases dentro da lista

    }

    public abstract void carregarFrases(); //metodo abstrato para se usado pela subclasse para carragar as suas frases no arralist

    public String getAfraseDeSorte() {
        return afrasegerada;
    } //Gettter para torna disponivel a frase gerada
}
