package br.com.unicred.festaFinalDeAno.alimentossecos;

public class Vinho {

    private String tipo;
    private Double litro;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }
//esse metodo é responsavel pela ação de despejar o vinho e retornar caso haja falta de quantidade;

    public Double despejarVinho(Double quantidadeReceita) {
        Double restoVinho = 0.00;
        if((litro != null && quantidadeReceita != null) && (litro >= quantidadeReceita)){
            restoVinho = litro - quantidadeReceita;
            setLitro(restoVinho);
            System.out.println("adicionando quantidade de vinho " +quantidadeReceita);
            return quantidadeReceita;
        } else {

            System.out.println("quantidade de vinho menor do que a receita solicita" + getLitro());
            restoVinho = litro;
        }
        return getLitro();
    }
}

