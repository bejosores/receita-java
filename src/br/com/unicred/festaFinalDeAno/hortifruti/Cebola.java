package br.com.unicred.festaFinalDeAno.hortifruti;

public class Cebola {

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

    private String descricao;
    private String tamanho;

    public void formatoBrunoise(){
        System.out.println("cortar a cebola em cubos pequenos para refogar");

    }
    public void formatoMirePoix(){
        System.out.println("cortar cebola cubos maiores e adicionar a marinada ");

    }
}

