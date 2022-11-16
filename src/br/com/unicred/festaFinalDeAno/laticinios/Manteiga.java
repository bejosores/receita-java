package br.com.unicred.festaFinalDeAno.laticinios;

public class Manteiga {
    private Double kilo;
    private String manteigaDerretida;

    public String getManteigaDerretida() {
        return manteigaDerretida;
    }

    public void setManteigaDerretida(String manteigaDerretida) {
        this.manteigaDerretida = manteigaDerretida;
    }

    public Double getKilo() {
        return kilo;
    }

    public void setKilo(Double kilo) {
        this.kilo = kilo;
    }

    public Double adicionarManteiga(Double quantidadeReceita) {
        Double restoManteiga = 0.00;
        if ((kilo != null && quantidadeReceita != null) && (kilo >= quantidadeReceita)) {

            restoManteiga = kilo - quantidadeReceita;
            setKilo(restoManteiga);
            System.out.println("adicionar a manteiga na frigideira pré aquecida " + quantidadeReceita);
            return quantidadeReceita;
        } else {
            System.out.println("quantidade da receita menor que solitica " + getKilo());
            restoManteiga = kilo;
        }
        return getKilo();
    }
}

