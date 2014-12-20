package Persistência;

import java.util.ArrayList;

public class Venda {

    public static ArrayList<Venda> lista = new ArrayList<Venda>();
    private String cod;
    private String nome;
    private String qtd;
    private String valorUn;
    private String desc;
    private String pag;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPag() {
        return pag;
    }

    public void setPag(String pag) {
        this.pag = pag;
    }

}
