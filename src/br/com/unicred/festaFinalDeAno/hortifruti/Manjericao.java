package br.com.unicred.festaFinalDeAno.hortifruti;

public class Manjericao {
    private Folhas folhas;
    private Talos talos;

    public Manjericao() {
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
    public void cortarFolhas(){
        if(folhas == null) {
            setFolhas(new Folhas());
        }
        System.out.println("Cortar as folhas o manjericao e descartar o talo e adicionara as folhas na marinada");
    }

}
