package br.com.unicred.festaFinalDeAno.hortifruti;

public class Cogumelo {
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
    public void adicionarCogumelo(){
        System.out.println("adicionar o cogumelo");
    }

}
