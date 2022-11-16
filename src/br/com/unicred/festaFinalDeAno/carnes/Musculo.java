package br.com.unicred.festaFinalDeAno.carnes;

public class Musculo {

    private String descricao;
    private Double kilo;
    private Integer quantidadeCubos;
    private String estado;


    public Double getKilo() {
        return kilo;
    }

    public void setKilo(Double kilo) {
        this.kilo = kilo;
    }

    public Integer getQuantidadeCubos() {
        return quantidadeCubos;
    }

    public void setQuantidadeCubos(Integer quantidadeCubos) {
        this.quantidadeCubos = quantidadeCubos;
    }


    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public Double carneLimpa(Double quantidadeNecessaria) {
        double carneComGordura = quantidadeNecessaria * 1.2;
        System.out.println("limpar a gordura da carne ");
        setKilo(carneComGordura);
        return carneComGordura;
    }
    //TODO criar metodo para corte em cubo de carne;


    public Integer quantidadeCortes() {
        if (kilo != null && kilo > 0) {
            setQuantidadeCubos((int) (kilo / 0.04));
            System.out.println("corte a carne em 25 cubos de 40g");
            setEstado("Carne crua");
        }
        return getQuantidadeCubos();
    }
}
