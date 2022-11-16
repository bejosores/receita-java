package br.com.unicred.festaFinalDeAno.aplicacao;


import br.com.unicred.festaFinalDeAno.eletrodomesticos.Fogao;
import br.com.unicred.festaFinalDeAno.eletrodomesticos.FogoEnum;
import br.com.unicred.festaFinalDeAno.utensilios.Frigideira;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Cozinha {

    public  static void main(String[] args) {
        Bancada bancada = new Bancada();
        Fogao fogao = new Fogao();
        Sacola sacola = bancada.adicionarInsumos();
        bancada.adicionarInsumo(sacola);
        fogao.adicionarABoca(TRUE, TRUE, FogoEnum.MEDIOALTO);
        // Frigideira.preparoFrigideira(sacola.getManteiga(), sacola.getCenoura(), sacola.getCebolaBaby(), sacola.getBacon(), sacola.getCogumelo());

        // fogao.desligarFogo();
    }
}