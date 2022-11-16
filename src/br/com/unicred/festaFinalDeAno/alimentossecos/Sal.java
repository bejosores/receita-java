package br.com.unicred.festaFinalDeAno.alimentossecos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Sal {
    private BigDecimal quantidade;

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal adicionarSal(BigDecimal quantidadeDeSal) {

        if (quantidadeDeSal.compareTo(BigDecimal.valueOf(0.05)) >= 0 ||
                (getQuantidade() != null && getQuantidade().compareTo(BigDecimal.valueOf(0.05)) >= 0)) {
            System.out.println
                    ("Quantidade adicionada acima do recomendado para consumo " + getQuantidade().setScale(2, RoundingMode.HALF_EVEN));
        } else {
            if (getQuantidade() != null && getQuantidade().compareTo(new BigDecimal("0.00")) > 0) {
                setQuantidade(getQuantidade().add(quantidadeDeSal));
            } else if (getQuantidade() == null) {
                setQuantidade(quantidadeDeSal);
            }
            System.out.println("adicionar o sal ao caldo "
                    + getQuantidade().setScale(2,RoundingMode.HALF_EVEN));
        }

        return getQuantidade();
    }
    // VALIDADOR

    //     Scanner entrada = new Scanner (System.in);
    //     String quantidadeSal = "";
    //     while(!quantidadeSal.IgnoreCase("esta bom")) {
    //     System.out.println("esta bom de sal?");
    //     quantidadeSal = entrada.nextLine();

}

