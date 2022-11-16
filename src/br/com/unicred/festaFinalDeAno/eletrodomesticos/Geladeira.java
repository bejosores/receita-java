package br.com.unicred.festaFinalDeAno.eletrodomesticos;

public class Geladeira {
    private String tomada;
    private String prateleira;
    private Boolean estaLigado;
    private Double temperatura;

    public String getTomada() {
        return tomada;
    }

    public void setTomada(String tomada) {
        this.tomada = tomada;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public Boolean getEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(Boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public void geladeiraLigada(){
        setEstaLigado(Boolean.TRUE);
        System.out.println("gelando preparos ");
        setTemperatura(10.0);
    }

}
