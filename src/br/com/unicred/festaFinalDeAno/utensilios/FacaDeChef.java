package br.com.unicred.festaFinalDeAno.utensilios;

import java.time.chrono.IsoEra;

public class FacaDeChef {
    private Double tamanho;

    private Boolean estaAfiada;

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Boolean getEstaAfiada() {
        return estaAfiada;
    }

    public void setEstaAfiada(Boolean estaAfiada) {
        this.estaAfiada = estaAfiada;
    }

    public void cortarInsumo() {
        setEstaAfiada(Boolean.TRUE);
        System.out.println("Realizando corte do insumo");
    }

}
