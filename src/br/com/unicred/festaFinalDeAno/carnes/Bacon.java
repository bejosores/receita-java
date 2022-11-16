package br.com.unicred.festaFinalDeAno.carnes;

import java.util.function.DoublePredicate;

public class Bacon {
    private String tipoDeCarne;
    private Double pedaco;
    private Double pele;
    private Double barriga;
    private String estadoDoBacon;
    private String estadoDaBarriga;

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public Double getPedaco() {
        return pedaco;
    }

    public void setPedaco(Double pedaco) {
        this.pedaco = pedaco;
    }

    public Double getPele() {
        return pele;
    }

    public void setPele(Double pele) {
        this.pele = pele;
    }

    public Double getBarriga() {
        return barriga;
    }

    public void setBarriga(Double barriga) {
        this.barriga = barriga;
    }

    public String getEstadoDoBacon() {
        return estadoDoBacon;
    }

    public void setEstadoDoBacon(String estadoDoBacon) {
        this.estadoDoBacon = estadoDoBacon;
    }

    public String getEstadoDaBarriga() {
        return estadoDaBarriga;
    }

    public void setEstadoDaBarriga(String estadoDaBarriga) {
        this.estadoDaBarriga = estadoDaBarriga;
    }

    public void quantidadeBarriga(Double qtdbarriga) {

        Double corteBarriga = null;
        if (barriga != null && qtdbarriga != null) {
            if (qtdbarriga < barriga) {
                corteBarriga = barriga - qtdbarriga;
            } else if (qtdbarriga == barriga) {
                corteBarriga = qtdbarriga;
            } else {
                System.out.println("tem que comprar mais ");
            }

            System.out.println("quantidade de barriga " + qtdbarriga);
        }

    }

    public void corteFinal() {
        System.out.println("cortar a barriga em cubos e adicionar na frigideira ");
    }

    public void quantidadePele(Double qtdPele) {
        Double cortePele = null;
        if (pele != null && qtdPele != null) {
            if (qtdPele < barriga) {
                cortePele = barriga - qtdPele;
            } else if (qtdPele == barriga) {
                cortePele = qtdPele;
            } else {
                System.out.println("tem que comprar mais ");
            }

            System.out.println("quantidade de pele" + qtdPele);
        }
        System.out.println("Adicionar a pele do bacon na marinada");
    }


}
