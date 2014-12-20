package Controller;

import sun.rmi.runtime.Log;
import View.MenuPrincipal;


public class Inicio
	{

	public static void main(String[] args)
		{
		try
			{
			
			Dados.LerClientes();
			Dados.LerFornecedores();
			Dados.LerFuncionarios();
			Dados.LerVendas();
			Dados.LerProdutos();
			
			MenuPrincipal Programa = new MenuPrincipal();
			Programa.setVisible(true);
			
			}
		catch (Exception exceptionLaunched)
			{
			System.out.println("Menu Principal: " + exceptionLaunched.getMessage());
			exceptionLaunched.printStackTrace();
			System.exit(2);
			}
		}
	}
