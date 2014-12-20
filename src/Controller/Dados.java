package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import jdk.nashorn.internal.runtime.ListAdapter;
import Model.*;

public class Dados {
	private final static String caminhoArq_Cliente = "clientes.txt";
	private final static String caminhoArq_Fornecedor = "fornecedores.txt";
	private final static String caminhoArq_Funcionario = "funcionarios.txt";
	private final static String caminhoArq_Venda = "vendas.txt";
	private final static String caminhoArq_Produto = "produtos.txt";

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
			Cliente.lista = clientes;
			return;
		}

		String[] registros = conteudo.split(";");

		for (String r : registros) {
			String[] campos = r.split(",", -1);

			Cliente novo = new Cliente();
			novo.cod = campos[0];
			novo.nome = campos[1];
			novo.cpf = campos[2];
			novo.rg = campos[3];
			novo.genero = campos[4];
			novo.dtnasc = campos[5];
			novo.tel = campos[6];
			novo.ec = campos[7];
			novo.email = campos[8];
			novo.logradouro = campos[9];
			novo.comp = campos[10];
			novo.cep = campos[11];
			novo.cidade = campos[12];
			novo.uf = campos[13];
			novo.bairro = campos[14];
			clientes.add(novo);

		}

		Cliente.lista = clientes;

	}

	public static void GravarClientes() throws IOException {

		File f = new File(caminhoArq_Cliente);
		FileWriter fw = new FileWriter(f);

		for (Cliente c : Cliente.lista) {
			fw.write(c.cod + "," + c.nome + "," + c.cpf + "," + c.rg + ","
					+ c.genero + "," + c.dtnasc + "," + c.tel + "," + c.ec
					+ "," + c.email + "," + c.logradouro + "," + c.comp + ","
					+ c.cep + "," + c.cidade + "," + c.uf + "," + c.bairro
					+ ";");
		}

		fw.close();

	}

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
			Fornecedor.lista = Fornecedores;
			return;
		}

		String[] registros = conteudo.split(";");

		for (String r : registros) {
			String[] campos = r.split(",", -1);

			Fornecedor novo = new Fornecedor();
			novo.cod = campos[0];
			novo.nome = campos[1];
			novo.tel = campos[2];
			novo.email = campos[3];
			novo.logradouro = campos[4];
			novo.comp = campos[5];
			novo.cep = campos[6];
			novo.cidade = campos[7];
			novo.uf = campos[8];
			novo.cnpj = campos[9];
			novo.bairro = campos[10];
			Fornecedores.add(novo);

		}

		Fornecedor.lista = Fornecedores;

	}

	public static void GravarFornecedores() throws IOException {

		File f = new File(caminhoArq_Fornecedor);
		FileWriter fw = new FileWriter(f);

		for (Fornecedor c : Fornecedor.lista) {
			fw.write(c.cod + "," + c.nome + "," + c.tel + "," + c.email + ","
					+ c.logradouro + "," + c.comp + "," + c.cep + ","
					+ c.cidade + "," + c.uf + "," + c.cnpj + "," + c.bairro + ";");
		}

		fw.close();

	}

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
			Funcionario.lista = funcionarios;
			return;
		}

		String[] registros = conteudo.split(";");

		for (String r : registros) {
			String[] campos = r.split(",", -1);

			Funcionario novo = new Funcionario();
			novo.cod = campos[0];
			novo.nome = campos[1];
			novo.cpf = campos[2];
			novo.rg = campos[3];
			novo.genero = campos[4];
			novo.dtnasc = campos[5];
			novo.tel = campos[6];
			novo.ec = campos[7];
			novo.email = campos[8];
			novo.logradouro = campos[9];
			novo.comp = campos[10];
			novo.cep = campos[11];
			novo.cidade = campos[12];
			novo.uf = campos[13];
			novo.cargo = campos[14];
			novo.bairro = campos[15];

			funcionarios.add(novo);

		}

		Funcionario.lista = funcionarios;

	}

	public static void GravarFuncionarios() throws IOException {

		File f = new File(caminhoArq_Funcionario);
		FileWriter fw = new FileWriter(f);

		for (Funcionario c : Funcionario.lista) {
			fw.write(c.cod + "," + c.nome + "," + c.cpf + "," + c.rg + ","
					+ c.genero + "," + c.dtnasc + "," + c.tel + "," + c.ec
					+ "," + c.email + "," + c.logradouro + "," + c.comp + ","
					+ c.cep + "," + c.cidade + "," + c.uf + "," + c.cargo + ","
					+ c.bairro + ";");
		}

		fw.close();
	}

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
			novo.cod = campos[0];
			novo.desc = campos[1];
			novo.nome = campos[2];
			novo.pag = campos[3];
			novo.qtd = campos[4];
			novo.valorUn = campos[5];

			Vendas.add(novo);

		}

		Venda.lista = Vendas;

	}

	public static void GravarVendas() throws IOException {

		File f = new File(caminhoArq_Venda);
		FileWriter fw = new FileWriter(f);

		for (Venda c : Venda.lista) {
			fw.write(c.cod + "," + c.desc + "," + c.nome +  "," + c.pag
					+ "," + c.qtd + "," + c.valorUn + ";");
		}

		fw.close();

	}

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
			Produto.lista = Produtos;
			return;
		}

		String[] registros = conteudo.split(";");

		for (String r : registros) {
			String[] campos = r.split(",", -1);

			Produto novo = new Produto();
			novo.cod = campos[0];
			novo.desc = campos[1];
			novo.nome = campos[2];
			novo.qtd = campos[3];
			novo.estTotal = campos[4];
			novo.valorUn = campos[5];
			novo.estMin = campos[6];
			Produtos.add(novo);

		}

		Produto.lista = Produtos;

	}

	public static void GravarProdutos() throws IOException {

		File f = new File(caminhoArq_Produto);
		FileWriter fw = new FileWriter(f);

		for (Produto c : Produto.lista) {
			fw.write(c.cod + "," + c.desc + "," + c.nome + "," + "," + c.qtd
					+ "," + c.estTotal + "," + c.valorUn + "," + c.estMin + ";");
		}

		fw.close();

	}

	public static void addCliente(Cliente c) {

		Cliente.lista.add(c);
		try {
			GravarClientes();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addFuncionario(Funcionario f) {

		Funcionario.lista.add(f);
		try {
			GravarFuncionarios();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addFornecedor(Fornecedor f) {

		Fornecedor.lista.add(f);
		try {
			GravarFornecedores();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addProduto(Produto p) {

		Produto.lista.add(p);
		try {
			GravarProdutos();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addVenda(Venda v) {

		Venda.lista.add(v);
		try {
			GravarVendas();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
