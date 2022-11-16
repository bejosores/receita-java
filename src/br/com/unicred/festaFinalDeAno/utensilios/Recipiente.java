package br.com.unicred.festaFinalDeAno.utensilios;

import br.com.unicred.festaFinalDeAno.alimentossecos.Vinho;
import br.com.unicred.festaFinalDeAno.carnes.Bacon;
import br.com.unicred.festaFinalDeAno.carnes.Musculo;
import br.com.unicred.festaFinalDeAno.hortifruti.*;
import br.com.unicred.festaFinalDeAno.prePreparo.Marinada;

public class Recipiente {
    public void adicionarInsumos(InsumosCortados insumosCortados, Vinho vinho) {

        Marinada marinada = new Marinada();
        marinada.criarMarinada(insumosCortados, vinho);

    }
}
