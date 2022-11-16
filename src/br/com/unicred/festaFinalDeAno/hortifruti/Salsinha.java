package br.com.unicred.festaFinalDeAno.hortifruti;

public class Salsinha {
    private Folhas folhas;

    private Talos talos;

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
    public void formatoPicadoFolhas(){
        setFolhas(new Folhas());
        System.out.println("Picar as folhas da salsinha");
    }

}
