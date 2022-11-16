package br.com.unicred.festaFinalDeAno.alimentossecos;

import java.math.BigDecimal;

public class Farinha {
    private BigDecimal quantidade;

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
    public BigDecimal passarFarinhaNaCarne(BigDecimal quantidadeUso){
        BigDecimal quantidadeDeFarinha = new BigDecimal("0.00");
        if ((quantidade != null && quantidadeUso != null) &&(getQuantidade().compareTo(quantidadeUso) > 0)) {
            quantidadeDeFarinha = getQuantidade().subtract(quantidadeUso);
            setQuantidade(quantidadeDeFarinha);
            System.out.println("empanar a carne com a farinha " + quantidadeUso);
            return quantidadeUso;
        }
        System.out.println("empanar a carne com a farinha "+ getQuantidade());
    return getQuantidade();
    }
}
