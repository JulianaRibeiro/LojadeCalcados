package Aplicação;

import Persistência.Produto;
import Persistência.Fornecedor;
import Persistência.Venda;
import Persistência.Usuario;
import Persistência.Cliente;
import Persistência.Funcionario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import jdk.nashorn.internal.runtime.ListAdapter;

/**
 * Classe que controla o acesso de leitura e escrita aos arquivos de dados do sistema
 */
public class Dados {

    private final static String caminhoArq_Usuario = "usuarios.txt";
    private final static String caminhoArq_Cliente = "clientes.txt";
    private final static String caminhoArq_Fornecedor = "fornecedores.txt";
    private final static String caminhoArq_Funcionario = "funcionarios.txt";
    private final static String caminhoArq_Venda = "vendas.txt";
    private final static String caminhoArq_Produto = "produtos.txt";

    /**
     * Método que le os dados dos clientes do arquivo para a memória
     */
    public static void LerClientes() throws IOException {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        File f = new File(caminhoArq_Cliente);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String conteudo = "";

        String line = "";
        while ((line = br.readLine()) != null) {
            conteudo += line;
        }

        if (conteudo.length() == 0) {
            Cliente.setLista(clientes);
            return;
        }

        String[] registros = conteudo.split(";");

        for (String r : registros) {
            String[] campos = r.split(",", -1);

            Cliente novo = new Cliente();
            novo.setCod(campos[0]);
            novo.setNome(campos[1]);
            novo.setCpf(campos[2]);
            novo.setRg(campos[3]);
            novo.setGenero(campos[4]);
            novo.setDtnasc(campos[5]);
            novo.setTel(campos[6]);
            novo.setEc(campos[7]);
            novo.setEmail(campos[8]);
            novo.setLogradouro(campos[9]);
            novo.setComp(campos[10]);
            novo.setCep(campos[11]);
            novo.setCidade(campos[12]);
            novo.setUf(campos[13]);
            novo.setBairro(campos[14]);
            clientes.add(novo);

        }

        Cliente.setLista(clientes);

    }

    /**
     * Método que grava os dados dos clientes no arquivo de dados
     */
    public static void GravarClientes() throws IOException {

        File f = new File(caminhoArq_Cliente);
        FileWriter fw = new FileWriter(f);

        for (Cliente c : Cliente.getLista()) {
            fw.write(c.getCod() + "," + c.getNome() + "," + c.getCpf() + "," + c.getRg() + ","
                    + c.getGenero() + "," + c.getDtnasc() + "," + c.getTel() + "," + c.getEc()
                    + "," + c.getEmail() + "," + c.getLogradouro() + "," + c.getComp() + ","
                    + c.getCep() + "," + c.getCidade() + "," + c.getUf() + "," + c.getBairro()
                    + ";");
        }

        fw.close();

    }

    /**
     * Método que le os dados dos fornecedores do arquivo para a memória
     */
    public static void LerFornecedores() throws IOException {

        ArrayList<Fornecedor> Fornecedores = new ArrayList<Fornecedor>();

        File f = new File(caminhoArq_Fornecedor);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String conteudo = "";

        String line = "";
        while ((line = br.readLine()) != null) {
            conteudo += line;
        }
        if (conteudo.length() == 0) {
            Fornecedor.setLista(Fornecedores);
            return;
        }

        String[] registros = conteudo.split(";");

        for (String r : registros) {
            String[] campos = r.split(",", -1);

            Fornecedor novo = new Fornecedor();
            novo.setCod(campos[0]);
            novo.setNome(campos[1]);
            novo.setTel(campos[2]);
            novo.setEmail(campos[3]);
            novo.setLogradouro(campos[4]);
            novo.setComp(campos[5]);
            novo.setCep(campos[6]);
            novo.setCidade(campos[7]);
            novo.setUf(campos[8]);
            novo.setCnpj(campos[9]);
            novo.setBairro(campos[10]);
            Fornecedores.add(novo);

        }

        Fornecedor.setLista(Fornecedores);

    }

    /**
     * Método que grava os dados dos fornecedores no arquivo de dados
     */
    public static void GravarFornecedores() throws IOException {

        File f = new File(caminhoArq_Fornecedor);
        FileWriter fw = new FileWriter(f);

        for (Fornecedor c : Fornecedor.getLista()) {
            fw.write(c.getCod() + "," + c.getNome() + "," + c.getTel() + "," + c.getEmail() + ","
                    + c.getLogradouro() + "," + c.getComp() + "," + c.getCep() + ","
                    + c.getCidade() + "," + c.getUf() + "," + c.getCnpj() + "," + c.getBairro() + ";");
        }

        fw.close();

    }

    /**
     * Método que le os dados dos funcionarios do arquivo para a memória
     */
    public static void LerFuncionarios() throws IOException {

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        File f = new File(caminhoArq_Funcionario);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String conteudo = "";

        String line = "";
        while ((line = br.readLine()) != null) {
            conteudo += line;
        }
        if (conteudo.length() == 0) {
            Funcionario.setLista(funcionarios);
            return;
        }

        String[] registros = conteudo.split(";");

        for (String r : registros) {
            String[] campos = r.split(",", -1);

            Funcionario novo = new Funcionario();
            novo.setCod(campos[0]);
            novo.setNome(campos[1]);
            novo.setCpf(campos[2]);
            novo.setRg(campos[3]);
            novo.setGenero(campos[4]);
            novo.setDtnasc(campos[5]);
            novo.setTel(campos[6]);
            novo.setEc(campos[7]);
            novo.setEmail(campos[8]);
            novo.setLogradouro(campos[9]);
            novo.setComp(campos[10]);
            novo.setCep(campos[11]);
            novo.setCidade(campos[12]);
            novo.setUf(campos[13]);
            novo.setCargo(campos[14]);
            novo.setBairro(campos[15]);

            funcionarios.add(novo);

        }

        Funcionario.setLista(funcionarios);

    }

    /**
     * Método que grava os dados dos funcionarios no arquivo de dados
     */
    public static void GravarFuncionarios() throws IOException {

        File f = new File(caminhoArq_Funcionario);
        FileWriter fw = new FileWriter(f);

        for (Funcionario c : Funcionario.getLista()) {
            fw.write(c.getCod() + "," + c.getNome() + "," + c.getCpf() + "," + c.getRg() + ","
                    + c.getGenero() + "," + c.getDtnasc() + "," + c.getTel() + "," + c.getEc()
                    + "," + c.getEmail() + "," + c.getLogradouro() + "," + c.getComp() + ","
                    + c.getCep() + "," + c.getCidade() + "," + c.getUf() + "," + c.getCargo() + ","
                    + c.getBairro() + ";");
        }

        fw.close();
    }

    /**
     * Método que le os dados das vendas do arquivo para a memória
     */
    public static void LerVendas() throws IOException {

        ArrayList<Venda> Vendas = new ArrayList<Venda>();

        File f = new File(caminhoArq_Venda);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String conteudo = "";

        String line = "";
        while ((line = br.readLine()) != null) {
            conteudo += line;
        }
        if (conteudo.length() == 0) {
            Venda.lista = Vendas;
            return;
        }

        String[] registros = conteudo.split(";");

        for (String r : registros) {
            String[] campos = r.split(",", -1);

            Venda novo = new Venda();
            novo.setCod(campos[0]);
            novo.setDesc(campos[1]);
            novo.setNome(campos[2]);
            novo.setPag(campos[3]);
            novo.setQtd(campos[4]);
            novo.setValorUn(campos[5]);

            Vendas.add(novo);

        }

        Venda.lista = Vendas;

    }

    /**
     * Método que grava os dados das vendas no arquivo de dados
     */
    public static void GravarVendas() throws IOException {

        File f = new File(caminhoArq_Venda);
        FileWriter fw = new FileWriter(f);

        for (Venda c : Venda.lista) {
            fw.write(c.getCod() + "," + c.getDesc() + "," + c.getNome() + "," + c.getPag()
                    + "," + c.getQtd() + "," + c.getValorUn() + ";");
        }

        fw.close();

    }

    /**
     * Método que le os dados dos produtos do arquivo para a memória
     */
    public static void LerProdutos() throws IOException {

        ArrayList<Produto> Produtos = new ArrayList<Produto>();

        File f = new File(caminhoArq_Produto);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String conteudo = "";

        String line = "";
        while ((line = br.readLine()) != null) {
            conteudo += line;
        }
        if (conteudo.length() == 0) {
            Produto.setLista(Produtos);
            return;
        }

        String[] registros = conteudo.split(";");

        for (String r : registros) {
            String[] campos = r.split(",", -1);

            Produto novo = new Produto();
            novo.setCod(campos[0]);
            novo.setDesc(campos[1]);
            novo.setNome(campos[2]);
            novo.setQtd(campos[3]);
            novo.setEstTotal(campos[4]);
            novo.setValorUn(campos[5]);
            novo.setEstMin(campos[6]);
            Produtos.add(novo);

        }

        Produto.setLista(Produtos);

    }

    /**
     * Método que grava os dados dos produtos no arquivo de dados
     */
    public static void GravarProdutos() throws IOException {

        File f = new File(caminhoArq_Produto);
        FileWriter fw = new FileWriter(f);

        for (Produto c : Produto.getLista()) {
            fw.write(c.getCod() + "," + c.getDesc() + "," + c.getNome() + "," + "," + c.getQtd()
                    + "," + c.getEstTotal() + "," + c.getValorUn() + "," + c.getEstMin() + ";");
        }

        fw.close();

    }

    /**
     * Método que le os dados dos Usuarios do arquivo para a memória
     */
    public static void LerUsuarios() throws IOException {

        ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();

        File f = new File(caminhoArq_Usuario);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String conteudo = "";

        String line = "";
        while ((line = br.readLine()) != null) {
            conteudo += line;
        }
        if (conteudo.length() == 0) {
            Usuario.setLista(Usuarios);
            return;
        }

        String[] registros = conteudo.split(";");

        for (String r : registros) {
            String[] campos = r.split(",", -1);

            Usuario novo = new Usuario();
            novo.setUsuario(campos[0]);
            novo.setSenha(campos[1]);
            novo.setTipo(campos[2]);

            Usuarios.add(novo);

        }

        Usuario.setLista(Usuarios);

    }

    /**
     * Método que grava os dados dos usuarios no arquivo de dados
     */
    public static void GravarUsuarios() throws IOException {

        File f = new File(caminhoArq_Usuario);
        FileWriter fw = new FileWriter(f);

        for (Usuario u : Usuario.getLista()) {
            fw.write(u.getUsuario() + "," + u.getSenha() + "," + u.getTipo() + ";");
        }

        fw.close();

    }
 /**
     * Método que cadastra um cliente, inclusive no arquivo de dados
     *
     * @param c - cliente que será cadastrado
     */
    public static void addCliente(Cliente c) {

        Cliente.getLista().add(c);
        try {
            GravarClientes();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Método que cadastra um funcionário, inclusive no arquivo de dados
     *
     * @param f - funcionario que será cadastrado
     */
    public static void addFuncionario(Funcionario f) {

        Funcionario.getLista().add(f);
        try {
            GravarFuncionarios();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 /**
     * Método que cadastra um fornecedor, inclusive no arquivo de dados
     *
     * @param f - fornecedor que será cadastrado
     */
    public static void addFornecedor(Fornecedor f) {

        Fornecedor.getLista().add(f);
        try {
            GravarFornecedores();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 /**
     * Método que cadastra um produto, inclusive no arquivo de dados
     *
     * @param p - produto que será cadastrado
     */
    public static void addProduto(Produto p) {

        Produto.getLista().add(p);
        try {
            GravarProdutos();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 /**
     * Método que cadastra um venda, inclusive no arquivo de dados
     *
     * @param v - venda que será cadastrada
     */
    public static void addVenda(Venda v) {

        Venda.lista.add(v);
        try {
            GravarVendas();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 /**
     * Método que cadastra um usuário, inclusive no arquivo de dados
     *
     * @param u - usuario que será cadastrado
     */
    public static void addUsuario(Usuario u) {

        Usuario.getLista().add(u);
        try {
            GravarUsuarios();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //***********
    /** Método que remove um cliente do arquivo de dados
     * 
     * @param c - cliente que será removido
     */
    public static void removeCliente(Cliente c) {

        Cliente.getLista().remove(c);
        try {
            GravarClientes();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
/** Método que remove um funcionario do arquivo de dados
     * 
     * @param f - funcionario que será removido
     */
    public static void removeFuncionario(Funcionario f) {

        Funcionario.getLista().remove(f);
        try {
            GravarFuncionarios();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
/** Método que remove um fornecedor do arquivo de dados
     * 
     * @param f - fornecedor que será removido
     */
    public static void removeFornecedor(Fornecedor f) {

        Fornecedor.getLista().remove(f);
        try {
            GravarFornecedores();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
/** Método que remove um produto do arquivo de dados
     * 
     * @param p - produto que será removido
     */
    public static void removeProduto(Produto p) {

        Produto.getLista().remove(p);
        try {
            GravarProdutos();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
/** Método que remove uma venda do arquivo de dados
     * 
     * @param v - venda que será removida
     */
    public static void removeVenda(Venda v) {

        Venda.lista.remove(v);
        try {
            GravarVendas();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
/** Método que remove um usuario do arquivo de dados
     * 
     * @param u - usuario que será removido
     */
    public static void removeUsuario(Usuario u) {

        Usuario.getLista().remove(u);
        try {
            GravarUsuarios();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
