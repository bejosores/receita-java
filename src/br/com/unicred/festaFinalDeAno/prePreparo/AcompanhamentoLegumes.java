package br.com.unicred.festaFinalDeAno.prePreparo;

import br.com.unicred.festaFinalDeAno.carnes.Bacon;
import br.com.unicred.festaFinalDeAno.hortifruti.CebolaBaby;
import br.com.unicred.festaFinalDeAno.hortifruti.Cenoura;
import br.com.unicred.festaFinalDeAno.hortifruti.Cogumelo;
import br.com.unicred.festaFinalDeAno.laticinios.Manteiga;
//TODO adicionar metodo fogão assim que pronto
public class AcompanhamentoLegumes {

    private Manteiga manteiga;
    private Cenoura cenoura;
    private CebolaBaby cebolaBaby;
    private Bacon bacon;
    private Cogumelo cogumelo;

    public Manteiga getManteiga() {
        return manteiga;
    }

    public void setManteiga(Manteiga manteiga) {
        this.manteiga = manteiga;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public void setCenoura(Cenoura cenoura) {
        this.cenoura = cenoura;
    }

    public CebolaBaby getCebolaBaby() {
        return cebolaBaby;
    }

    public void setCebolaBaby(CebolaBaby cebolaBaby) {
        this.cebolaBaby = cebolaBaby;
    }

    public Bacon getBacon() {
        return bacon;
    }

    public void setBacon(Bacon bacon) {
        this.bacon = bacon;
    }

    public Cogumelo getCogumelo() {
        return cogumelo;
    }

    public void setCogumelo(Cogumelo cogumelo) {
        this.cogumelo = cogumelo;
    }

    public AcompanhamentoLegumes prepararAcompanhamento(Manteiga manteiga,Cenoura cenoura,
                                                        CebolaBaby cebolaBaby, Bacon bacon, Cogumelo cogumelo){

        setManteiga(manteiga);
        setCenoura(cenoura);
        setCebolaBaby(cebolaBaby);
        setBacon(bacon);
        setCogumelo(cogumelo);

        getManteiga().adicionarManteiga(0.02);
        getCenoura().formatoCubo();
        getCebolaBaby().cortarMetade();
        getBacon().corteFinal();
        getCogumelo().adicionarCogumelo();

        return this;
    }
}
