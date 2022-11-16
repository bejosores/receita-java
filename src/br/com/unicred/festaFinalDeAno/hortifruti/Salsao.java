package br.com.unicred.festaFinalDeAno.hortifruti;

public class Salsao {

    private Folhas folhas;
    private Talos talo;

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

      public void formatoMeiaLua() {
        setTalo(new Talos());
        System.out.println("Cortar o salsão em meia lua e adicionar na marinada");
    }
}
