package br.com.unicred.festaFinalDeAno.prePreparo;

import br.com.unicred.festaFinalDeAno.alimentossecos.Vinho;
import br.com.unicred.festaFinalDeAno.carnes.Bacon;
import br.com.unicred.festaFinalDeAno.carnes.Musculo;
import br.com.unicred.festaFinalDeAno.hortifruti.*;

public class Marinada {
    private Musculo musculo;
    private Vinho vinho;
    private Cebola cebola;
    private Cenoura cenoura;
    private Salsao salsao;
    private Louro louro;
    private Manjericao manjericao;
    private Tomilho tomilho;
    private Alho alho;
    private AlhoPoro alhoPoro;
    private Cebolinha cebolinha;
    private Bacon bacon;

    public Musculo getMusculo() {
        return musculo;
    }

    public void setMusculo(Musculo musculo) {
        this.musculo = musculo;
    }

    public Vinho getVinho() {
        return vinho;
    }

    public void setVinho(Vinho vinho) {
        this.vinho = vinho;
    }

    public Cebola getCebola() {
        return cebola;
    }

    public void setCebola(Cebola cebola) {
        this.cebola = cebola;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public void setCenoura(Cenoura cenoura) {
        this.cenoura = cenoura;
    }

    public Salsao getSalsao() {
        return salsao;
    }

    public void setSalsao(Salsao salsao) {
        this.salsao = salsao;
    }

    public Louro getLouro() {
        return louro;
    }

    public void setLouro(Louro louro) {
        this.louro = louro;
    }

    public Manjericao getManjericao() {
        return manjericao;
    }

    public void setManjericao(Manjericao manjericao) {
        this.manjericao = manjericao;
    }

    public Tomilho getTomilho() {
        return tomilho;
    }

    public void setTomilho(Tomilho tomilho) {
        this.tomilho = tomilho;
    }

    public Alho getAlho() {
        return alho;
    }

    public void setAlho(Alho alho) {
        this.alho = alho;
    }

    public AlhoPoro getAlhoPoro() {
        return alhoPoro;
    }

    public void setAlhoPoro(AlhoPoro alhoPoro) {
        this.alhoPoro = alhoPoro;
    }

    public Cebolinha getCebolinha() {
        return cebolinha;
    }

    public void setCebolinha(Cebolinha cebolinha) {
        this.cebolinha = cebolinha;
    }

    public Bacon getBacon() {
        return bacon;
    }

    public void setBacon(Bacon bacon) {
        this.bacon = bacon;
    }

    public Marinada criarMarinada(InsumosCortados cortados, Vinho vinho) {

        setMusculo(cortados.getMusculo());
        setAlho(cortados.getAlho());
        setBacon(cortados.getBacon());
        setCebola(cortados.getCebola());
        setCebolinha(cortados.getCebolinha());
        setAlhoPoro(cortados.getAlhoPoro());
        setCenoura(cortados.getCenoura());
        setLouro(cortados.getLouro());
        setManjericao(cortados.getManjericao());
        setSalsao(cortados.getSalsao());
        setTomilho(cortados.getTomilho());
        setVinho(vinho);

        getVinho().despejarVinho(750D);
        getSalsao().formatoMeiaLua();
        getTomilho().adicionarTomilho();
        getManjericao().cortarFolhas();
        getCenoura().formatoMirePoix();
        getCenoura().adicionarAoCaldo();
        getAlhoPoro().formatoBrunoisetalo();
        getLouro().adicionarFolhas();
        getCebolinha().picarCebolinha();
        getCebola().formatoMirePoix();
        getBacon().setEstadoDoBacon("pele marinada");
        getMusculo().getQuantidadeCubos();
        getMusculo().setEstado("carne marinada");

        return this;
    }
}