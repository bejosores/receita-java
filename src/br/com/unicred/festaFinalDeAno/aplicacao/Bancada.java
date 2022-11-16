package br.com.unicred.festaFinalDeAno.aplicacao;

import br.com.unicred.festaFinalDeAno.alimentossecos.Farinha;
import br.com.unicred.festaFinalDeAno.alimentossecos.Sal;
import br.com.unicred.festaFinalDeAno.alimentossecos.Vinho;
import br.com.unicred.festaFinalDeAno.carnes.Bacon;
import br.com.unicred.festaFinalDeAno.carnes.CoccaoEnum;
import br.com.unicred.festaFinalDeAno.carnes.Musculo;
import br.com.unicred.festaFinalDeAno.hortifruti.*;
import br.com.unicred.festaFinalDeAno.laticinios.Manteiga;
import br.com.unicred.festaFinalDeAno.utensilios.FacaDeChef;
import br.com.unicred.festaFinalDeAno.utensilios.Frigideira;
import br.com.unicred.festaFinalDeAno.utensilios.Recipiente;
import br.com.unicred.festaFinalDeAno.utensilios.Tabua;

import java.math.BigDecimal;

public class Bancada {
    public Sacola adicionarInsumos() {

        Sacola sacola = new Sacola();

        sacola.setVinho(new Vinho());
        sacola.setAlho(new Alho());
        sacola.setAlhoPoro(new AlhoPoro());
        sacola.setCebola(new Cebola());
        sacola.setCenoura(new Cenoura());
        sacola.setSalsao(new Salsao());
        sacola.getSalsao().setTalo(new Talos());
        sacola.setLouro(new Louro());
        sacola.setManjericao(new Manjericao());
        sacola.setTomilho(new Tomilho());
        sacola.setCebolinha(new Cebolinha());
        sacola.setBacon(new Bacon());
        sacola.setMusculo(new Musculo());
        sacola.setSal(new Sal());
        sacola.setFarinha(new Farinha());
        sacola.setManteiga(new Manteiga());
        sacola.setCogumelo(new Cogumelo());
        sacola.setCebolaBaby(new CebolaBaby());


        return sacola;
    }

    public void adicionarInsumo(Sacola sacola) {

        sacola.getAlho().setDentes(7);
        sacola.getAlho().formatoPicado();
        sacola.getAlho().setDescricao(" Alho ");
        sacola.getAlho().adicionarAlho();
        sacola.getAlhoPoro().getTalo();
        sacola.getAlhoPoro().getTalo().setDescricao("Talo de Alho poró ");
        sacola.getManjericao().getFolhas();
        sacola.getManjericao().getFolhas().setDescricao("Folha de manjericão ");
        sacola.getCebola().setDescricao("Cebola");
        sacola.getCebolaBaby().setDescricao("Cebola Baby");
        sacola.getCenoura().setDescricao("Cenoura");
        sacola.getSalsao().getTalo().setDescricao("talo do salsão");
        sacola.getLouro().getFolhas().setDescricao("folha de louro");
        sacola.getTomilho().getFolhas().setDescricao("Tomilho");
        sacola.getCebolinha().getFolhas().setDescricao("Cebolinha");
        sacola.getMusculo().setDescricao("musculo ");
        sacola.getMusculo().setEstado(CoccaoEnum.CRU.name());
        sacola.getMusculo().setKilo(1000D);
        sacola.getVinho().setTipo("Seco");
        sacola.getVinho().setLitro(750D);
        sacola.getVinho().despejarVinho(500D);
        sacola.getVinho().despejarVinho(350D);
        Double despejarVinho = sacola.getVinho().despejarVinho(350D);
        System.out.println("retorno vinho " + despejarVinho);
        sacola.getBacon().setTipoDeCarne("Bacon");
        sacola.getBacon().setPele(0.200D);
        sacola.getBacon().setBarriga(0.800D);

        //TODO fluxo de cortes de insumos
        Tabua tabua = new Tabua();
        FacaDeChef facaDeChef = new FacaDeChef();
        Recipiente recipiente = new Recipiente();
        InsumosCortados insumosCortados = new InsumosCortados();

        tabua.colocarInsumo(sacola.getAlho().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getAlho().formatoPicado();
        insumosCortados.setAlho(sacola.getAlho());

        tabua.colocarInsumo(sacola.getCebola().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getCebola().formatoMirePoix();
        insumosCortados.setCebola(sacola.getCebola());

        tabua.colocarInsumo(sacola.getCenoura().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getCenoura().formatoMirePoix();
        insumosCortados.setCenoura(sacola.getCenoura());

        tabua.colocarInsumo(sacola.getSalsao().getTalo().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getSalsao().formatoMeiaLua();
        insumosCortados.setSalsao(sacola.getSalsao());

        tabua.colocarInsumo(sacola.getAlhoPoro().getTalo().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getAlhoPoro().formatoBrunoisetalo();
        insumosCortados.setAlhoPoro(sacola.getAlhoPoro());



        tabua.colocarInsumo(sacola.getCebolinha().getFolhas().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getCebolinha().picarCebolinha();
        insumosCortados.setCebolinha(sacola.getCebolinha());

        tabua.colocarInsumo(sacola.getCebolaBaby().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getCebolaBaby().cortarMetade();
        insumosCortados.setCebolaBaby(sacola.getCebolaBaby());

        tabua.colocarInsumo(sacola.getManjericao().getFolhas().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getManjericao().cortarFolhas();
        insumosCortados.setManjericao(sacola.getManjericao());

        tabua.colocarInsumo(sacola.getMusculo().getDescricao());
        facaDeChef.cortarInsumo();
        sacola.getMusculo().carneLimpa(1000D);
        facaDeChef.cortarInsumo();
        sacola.getMusculo().quantidadeCortes();
        insumosCortados.setMusculo(sacola.getMusculo());

        tabua.colocarInsumo(sacola.getBacon().getTipoDeCarne());
        facaDeChef.cortarInsumo();
        sacola.getBacon().quantidadePele(200D);
        insumosCortados.setBacon(sacola.getBacon());


        //TODO COGUMELO
        insumosCortados.setLouro(sacola.getLouro());
        insumosCortados.setTomilho(sacola.getTomilho());
        recipiente.adicionarInsumos(insumosCortados, sacola.getVinho());


        //  Recipiente recipiente = new Recipiente();
        //  recipiente.adicionarInsumos(sacola.getMusculo(),sacola.getVinho(),sacola.getCebola(), sacola.getCenoura(), sacola.getSalsao(),
        //        sacola.getLouro(), sacola.getManjericao(),sacola.getTomilho(),sacola.getAlho(),sacola.getAlhoPoro(),sacola.getCebolinha(),sacola.getBacon());

        //TODO fluxo abaixo será adicionado a marinada

    /*sacola.getSal().adicionarSal(new BigDecimal(0.02));
    sacola.getSal().adicionarSal(new BigDecimal(0.01));
    sacola.getFarinha().setQuantidade(BigDecimal.valueOf(0.75D));
    sacola.getFarinha().passarFarinhaNaCarne(new BigDecimal(0.250));
*/
        sacola.getManteiga().setKilo(1.00D);
        //  Frigideira.preparoFrigideira(sacola.getManteiga(), sacola.getCenoura(), sacola.getCebolaBaby(), sacola.getBacon(), sacola.getCogumelo());

    }

}
