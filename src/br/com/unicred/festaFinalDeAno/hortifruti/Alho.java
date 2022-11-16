package br.com.unicred.festaFinalDeAno.hortifruti;

public class Alho {
    private String descricao;
    private Integer dentes;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDentes() {
        return dentes;
    }

    public void setDentes(Integer dentes) {
        this.dentes = dentes;
    }


    public void formatoPicado() {

        if (dentes != null && dentes > 0) {
            for (int i = 0; i <= dentes; i++) {
                System.out.println("cortar dente de alho pequeno!");
            }
        } else {
            System.out.println("não existe alho para cortar!");
        }
    }
public void adicionarAlho(){
        System.out.println("adicionar o alho cortado na marinada");
}
}
