package coimbra.parasite.oraculo.signos;

import android.text.TextUtils;

import java.util.ArrayList;

import java.util.Random;

/**
 * Criado por Anderson Coimbra em 25/03/2015.
 */
public abstract class Signo {
    private String nomeusuario;
    public ArrayList<String> listadefrases;
    Random indice;
    private String afrasegerada;

    public Signo(String nome){
        listadefrases = new ArrayList<>();
        carregarFrases();
        indice = new Random();
        this.nomeusuario = nome;
        afrasegerada = listadefrases.get(indice.nextInt(listadefrases.size()));

    }

    public abstract void carregarFrases();

    public String getAfraseDeSorte() {
        return afrasegerada;
    }
}
