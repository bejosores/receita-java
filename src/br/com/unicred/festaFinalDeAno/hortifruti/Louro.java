package br.com.unicred.festaFinalDeAno.hortifruti;

public class Louro {
    private Folhas folhas;

    public Louro() {
        setFolhas(new Folhas());
    }

    public Folhas getFolhas() {
        return folhas;
    }

    public void setFolhas(Folhas folhas) {
        this.folhas = folhas;
    }
    public void adicionarFolhas(){
        if(folhas == null) {
            setFolhas(new Folhas());
        }
        System.out.println("adicionar as folhas de louro no caldo");
    }
}
