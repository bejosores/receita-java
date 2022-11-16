package br.com.unicred.festaFinalDeAno.hortifruti;

public class Cenoura {

    private String descricao;
    private String tamanho;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void formatoCubo() {
        System.out.println("cortar cenoura em cubo grande e adicionar ao preparo");
    }
    public void formatoMirePoix(){
        System.out.println("Corte padronizado sem tamanho pré determinado ");

    }
public void adicionarAoCaldo(){
        System.out.println("adicionar a cenoura ao caldo ");
    }
}


