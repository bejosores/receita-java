package br.com.unicred.festaFinalDeAno.utensilios;

public class Tabua {
    private String material;
    private Double tamanho;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public void colocarInsumo(String insumo) {
        System.out.println("adicionado " + insumo + " na tábua ");
    }
}


//50 Cm X 30 Cm