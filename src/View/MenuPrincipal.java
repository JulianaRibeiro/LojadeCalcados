package View;


import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = -8201084177335104544L;

	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu menuNovo = new JMenu("Novo");
	private final JMenu menuConsulta = new JMenu("Consulta");

	// menu Novo Cadastro
	private final JMenuItem NovoFuncionario = new JMenuItem("Funcionario");
	private final JMenuItem NovoFornecedor = new JMenuItem("Fornecedor");
	private final JMenuItem NovoProduto = new JMenuItem("Produto");
	private final JMenuItem NovoCliente = new JMenuItem("Cliente");
	private final JMenuItem NovaVenda = new JMenuItem("Venda");

	// menu Nova Consulta	
	private final JMenuItem ConsultaFuncionario = new JMenuItem("Funcionario");
	private final JMenuItem ConsultaFornecedor = new JMenuItem("Fornecedor");
	private final JMenuItem ConsultaProduto = new JMenuItem("Produto");
	private final JMenuItem ConsultaCliente = new JMenuItem("Cliente");
	private final JMenuItem ConsultaVenda = new JMenuItem("Venda");
	
	//Sair
	private final JMenuItem Sair = new JMenuItem("Sair");
	
	public MenuPrincipal() {
		super("Loja de Calcados");
		this.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize()
				.getWidth() * 0.7), (int) (Toolkit.getDefaultToolkit()
				.getScreenSize().getHeight() * 0.7));
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		makeMenus();
	}
	Color amareloClaro = new Color(255, 255, 160 );

	private void makeMenus() {
		
		menuBar.add(menuNovo);
		menuBar.setBackground(amareloClaro);
		menuNovo.add(NovoFuncionario);
		menuNovo.add(NovoFornecedor);
		menuNovo.add(NovoProduto);
		menuNovo.add(NovoCliente);
		menuNovo.add(NovaVenda);
		menuNovo.addSeparator();
		menuNovo.add(Sair);

		menuBar.add(menuConsulta);
		menuConsulta.add(ConsultaFuncionario);
		menuConsulta.add(ConsultaFornecedor);
		menuConsulta.add(ConsultaProduto);
		menuConsulta.add(ConsultaCliente);
		menuConsulta.add(ConsultaVenda);
		
		this.setJMenuBar(menuBar);

		NovoFuncionario.addActionListener(this); 
		NovoFornecedor.addActionListener(this); 
		NovoProduto.addActionListener(this); 
		NovoCliente.addActionListener(this); 
		NovaVenda.addActionListener(this); 
		Sair.addActionListener(this);
		
		ConsultaFuncionario.addActionListener(this); 
		ConsultaFornecedor.addActionListener(this); 
		ConsultaProduto.addActionListener(this); 
		ConsultaCliente.addActionListener(this); 
		ConsultaVenda.addActionListener(this); 
		

	}

	
	public void actionPerformed(ActionEvent eventSource) {
		if (eventSource.getSource() == NovoFuncionario) {
			CadastroFuncionario tela = new CadastroFuncionario();
			tela.setVisible(true);
		}
		else if (eventSource.getSource() == NovoFornecedor) {
			
			CadastroFornecedor tela = new CadastroFornecedor();
			tela.setVisible(true);
		}
		else if (eventSource.getSource() == NovoProduto) {
			
			CadastroProduto tela = new CadastroProduto();
			tela.setVisible(true);
		}
		else if (eventSource.getSource() == NovoCliente) {

			CadastroCliente tela = new CadastroCliente();
			tela.setVisible(true);
			
		}
		else if (eventSource.getSource() == NovaVenda) {
			CadastroVenda tela = new CadastroVenda();
			tela.setVisible(true);
		}
		else if(eventSource.getSource() == Sair) {
			this.setVisible(false);
			System.exit(0);
		}
		else if (eventSource.getSource() == ConsultaFuncionario) {
			ConsultaFuncionario tela = new ConsultaFuncionario();
			tela.setVisible(true);
		}
		else if (eventSource.getSource() == ConsultaFornecedor) {
			ConsultaFornecedor tela = new ConsultaFornecedor();
			tela.setVisible(true);
		}
		else if (eventSource.getSource() == ConsultaProduto) {
			ConsultaProduto tela = new ConsultaProduto();
			tela.setVisible(true);
		}
		else if (eventSource.getSource() == ConsultaCliente) {
			ConsultaCliente tela = new ConsultaCliente();
			tela.setVisible(true);
		}
		else if (eventSource.getSource() == ConsultaVenda) {
			ConsultaVenda tela = new ConsultaVenda();
			tela.setVisible(true);
		}		

	}
}
