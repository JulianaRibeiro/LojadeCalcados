package Persistência;

import java.util.ArrayList;
/** Classe que contém os atributos e métodos de Clientes no sistema*/
public class Cliente {

    private static ArrayList<Cliente> lista = new ArrayList<Cliente>();

    public static ArrayList<Cliente> getLista() {
        return lista;
    }

    public static void setLista(ArrayList<Cliente> aLista) {
        lista = aLista;
    }

    private String cod;
    private String nome;
    private String cpf;
    private String rg;
    private String dtnasc;
    private String genero;
    private String ec;
    private String logradouro;
    private String comp;
    private String cep;
    private String cidade;
    private String uf;
    private String email;
    private String tel;
    private String bairro;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(String dtnasc) {
        this.dtnasc = dtnasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
