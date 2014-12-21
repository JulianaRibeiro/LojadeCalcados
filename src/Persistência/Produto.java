package Persistência;

import java.util.ArrayList;

/** Classe que contém os métodos e atributos dos produtos do sistema.*/
public class Produto {

    private static ArrayList<Produto> lista = new ArrayList<Produto>();

    public static ArrayList<Produto> getLista() {
        return lista;
    }

    public static void setLista(ArrayList<Produto> aLista) {
        lista = aLista;
    }
    private String cod;
    private String nome;
    private String qtd;
    private String valorUn;
    private String estTotal;
    private String estMin;
    private String desc;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public String getValorUn() {
        return valorUn;
    }

    public void setValorUn(String valorUn) {
        this.valorUn = valorUn;
    }

    public String getEstTotal() {
        return estTotal;
    }

    public void setEstTotal(String estTotal) {
        this.estTotal = estTotal;
    }

    public String getEstMin() {
        return estMin;
    }

    public void setEstMin(String estMin) {
        this.estMin = estMin;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
