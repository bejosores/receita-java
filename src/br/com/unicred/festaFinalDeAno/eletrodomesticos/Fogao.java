package br.com.unicred.festaFinalDeAno.eletrodomesticos;

public class Fogao {
    private Boolean botaoAcendedor;
    private Boolean botaoDeControleDeChama;
    private FogoEnum intensidadeFogo;
    private Double temperatura;


    public Boolean getBotaoAcendedor() {
        return botaoAcendedor;
    }

    public void setBotaoAcendedor(Boolean botaoAcendedor) {
        this.botaoAcendedor = botaoAcendedor;
    }

    public Boolean getBotaoDeControleDeChama() {
        return botaoDeControleDeChama;
    }

    public FogoEnum getIntensidadeFogo() {
        return intensidadeFogo;
    }

    public void setIntensidadeFogo(FogoEnum intensidadeFogo) {
        this.intensidadeFogo = intensidadeFogo;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public void setBotaoDeControleDeChama(Boolean botaoDeControleDeChama) {
        this.botaoDeControleDeChama = botaoDeControleDeChama;
    }

    public void cozinharPreparo() {
        setBotaoDeControleDeChama(Boolean.TRUE);
        System.out.println("Fogo aceso ");
        setIntensidadeFogo(FogoEnum.MEDIO);
    }

    public Double adicionarABoca(Boolean ligarAcendedor, Boolean controlarAChama, FogoEnum fogoenum) {
        setBotaoDeControleDeChama(controlarAChama);
        if (!ligarAcendedor && controlarAChama) {
            System.out.println("Alerta de segurança: Vazamento de gás!! PERIGO ");
        }
        if (!controlarAChama && ligarAcendedor) {
            System.out.println(" O gás está desligado ");
        }
        if (ligarAcendedor != null && controlarAChama != null && ligarAcendedor && controlarAChama) {
            if (FogoEnum.ALTO.equals(fogoenum)) {
                setTemperatura(300D);
            }
            if (FogoEnum.MEDIO.equals(fogoenum)) {
                setTemperatura(150D);
            }
            if (FogoEnum.BAIXO.equals(fogoenum)) {
                setTemperatura(100D);
            }
            if (FogoEnum.MEDIOALTO.equals(fogoenum)){
                setTemperatura(250D);
            }
            if(FogoEnum.MEDIOBAIXO.equals(fogoenum)){
                setTemperatura(130D);
            }
            System.out.println("Chama do fogão acesa, temperatura: " + getTemperatura() + " Graus");
        }
        return getTemperatura();
    }

    public Double desligarFogo() {
        if (getBotaoDeControleDeChama() != null && getBotaoDeControleDeChama()) {
            setBotaoDeControleDeChama(Boolean.FALSE);
            setTemperatura(0D);
            setIntensidadeFogo(FogoEnum.DESLIGADO);
            System.out.println("O fogão está " + FogoEnum.DESLIGADO.name());
        }
        return getTemperatura();
    }
}