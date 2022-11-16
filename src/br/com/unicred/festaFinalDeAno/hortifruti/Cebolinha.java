package br.com.unicred.festaFinalDeAno.hortifruti;

public class Cebolinha {
    private Folhas folhas;

    public Cebolinha() {
        setFolhas(new Folhas());
    }

    public Folhas getFolhas() {
        return folhas;
    }

    public void setFolhas(Folhas folhas) {
        this.folhas = folhas;
    }
    public void picarCebolinha(){
        setFolhas(new Folhas());
        System.out.println("cortar a cebolinha ");
    }
}
