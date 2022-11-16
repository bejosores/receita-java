package br.com.unicred.festaFinalDeAno.hortifruti;

public class AlhoPoro {

    private Folhas folhas;
    private Talos talo;

    public AlhoPoro() {
        setFolhas(new Folhas());
        setTalo(new Talos());
    }

    public Folhas getFolhas() {
        return folhas;
    }

    public void setFolhas(Folhas folhas) {
        this.folhas = folhas;
    }

    public Talos getTalo() {
        return talo;
    }

    public void setTalo(Talos talo) {
        this.talo = talo;
    }

    public void formatoBrunoisetalo() {
        if (talo == null)
        {setTalo(new Talos());
        }
        System.out.println("Cortar em cubo pequeno");
    }

}
