package Aplicação;

import Interface.Login;
import sun.rmi.runtime.Log;
import Interface.MenuPrincipal;

public class Inicio {
/** Classe que contém os métodos a serem executados*/
    public static void main(String[] args) {
        try {

            Dados.LerClientes();
            Dados.LerFornecedores();
            Dados.LerFuncionarios();
            Dados.LerVendas();
            Dados.LerProdutos();
            Dados.LerUsuarios();

            Login Programa = new Login();
            Programa.setVisible(true);

        } catch (Exception exceptionLaunched) {
            System.out.println("Menu Principal: " + exceptionLaunched.getMessage());
            exceptionLaunched.printStackTrace();
            System.exit(2);
        }
    }
}
