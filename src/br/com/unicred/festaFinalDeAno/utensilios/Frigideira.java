package br.com.unicred.festaFinalDeAno.utensilios;

import br.com.unicred.festaFinalDeAno.carnes.Bacon;
import br.com.unicred.festaFinalDeAno.hortifruti.CebolaBaby;
import br.com.unicred.festaFinalDeAno.hortifruti.Cenoura;
import br.com.unicred.festaFinalDeAno.hortifruti.Cogumelo;
import br.com.unicred.festaFinalDeAno.laticinios.Manteiga;
import br.com.unicred.festaFinalDeAno.prePreparo.AcompanhamentoLegumes;

public class Frigideira {
    //TODO adicionar o metodo de fogão assim que pronto

    public static void preparoFrigideira(Manteiga manteiga, Cenoura cenoura,
                                         CebolaBaby cebolaBaby, Bacon bacon, Cogumelo cogumelo){

       AcompanhamentoLegumes acompanhamentoLegumes = new AcompanhamentoLegumes();

       acompanhamentoLegumes.prepararAcompanhamento(manteiga, cenoura, cebolaBaby, bacon, cogumelo);
   }
}
