package br.com.unicred.festaFinalDeAno.hortifruti;

public class Tomilho {
    private Folhas folhas;
    private Talos talos;

    public Tomilho() {
        setFolhas(new Folhas());
        setTalos(new Talos());
    }

    public Folhas getFolhas() {
        return folhas;
    }

    public void setFolhas(Folhas folhas) {
        this.folhas = folhas;
    }

    public Talos getTalos() {
        return talos;
    }

    public void setTalos(Talos talos) {
        this.talos = talos;
    }
    public void adicionarTomilho(){
        if(talos == null && folhas == null) {
            setTalos(new Talos());
            setFolhas(new Folhas());
        }
        System.out.println("adicionar o tomilho inteiro na marinada");

    }
}
