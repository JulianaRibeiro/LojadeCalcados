package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Model.Cliente;
import Model.Funcionario;
import Model.Produto;

public class ConsultaProduto extends JDialog implements MouseListener,
		ActionListener {

	private static final long serialVersionUID = 6249073094554428394L;

	private JButton buttonBuscarNo, buttonBuscarCo;
	private JTextField tfId, tfNome;

	private ArrayList<Produto> dados;

	public ConsultaProduto() {

		this.setLayout(null);

		this.setSize(800, 400);
		this.setLocationRelativeTo(null);

		JPanel pp = new JPanel();
		pp.setBackground(Color.WHITE);
		this.add(pp);
		pp.setSize(800, 400);
		pp.setLocation(0, 0);

		int xl = 100;

		JLabel lId = new JLabel("Codigo Produto:");
		pp.add(lId);
		pp.setLayout(null);
		lId.setLocation(xl, 10);
		lId.setSize(150, 30);

		int xtf = lId.getX() + lId.getWidth() + 10;

		this.tfId = new JTextField();
		pp.add(tfId);
		tfId.setLocation(xtf, 10);
		tfId.setSize(200, 30);

		this.buttonBuscarCo = new JButton("Buscar");
		buttonBuscarCo.addActionListener(this);
		pp.add(buttonBuscarCo);
		buttonBuscarCo.setLocation(xtf + tfId.getWidth() + 10, 10);
		buttonBuscarCo.setSize(100, 30);

		JLabel lNome = new JLabel("Nome:");
		pp.add(lNome);
		lNome.setLocation(xl, 50);
		lNome.setSize(150, 30);

		this.tfNome = new JTextField();
		pp.add(tfNome);
		tfNome.setLocation(xtf, 50);
		tfNome.setSize(200, 30);

		this.buttonBuscarNo = new JButton("Buscar");
		buttonBuscarNo.addActionListener(this);
		pp.add(buttonBuscarNo);
		buttonBuscarNo.setLocation(xtf + tfNome.getWidth() + 10, 50);
		buttonBuscarNo.setSize(100, 30);

		JTable tc = new JTable();
		DefaultTableModel dtf = (new DefaultTableModel() {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});

		tc.setModel(dtf);
		tc.addMouseListener(this);
		
		dtf.addColumn("Codigo");
		dtf.addColumn("Nome");
		dtf.addColumn("Quantidade");
		dtf.addColumn("Estoque Total");

		this.dados = Produto.lista;

		for (Produto c : this.dados) {

			dtf.addRow(new Object[] { c.cod, c.nome, c.qtd, c.estTotal });
		}

		JScrollPane sp = new JScrollPane(tc);

		pp.add(sp);
		sp.setSize(800, 200);
		sp.setLocation(0, 100);

	}

	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			JTable target = (JTable) e.getSource();
			int row = target.getSelectedRow();

			Produto c = this.dados.get(row);

			CadastroProduto tela = new CadastroProduto(c);
			tela.setVisible(true);
		}
	}

	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(buttonBuscarCo)) {

			Produto cli = null;

			for (Produto c : Produto.lista) {
				if (c.cod.equals(tfId.getText())) {
					cli = c;
					break;
				}
			}
			if (cli == null) {
				JOptionPane.showMessageDialog(null, "Código inválido");
			} else {
				CadastroProduto tela = new CadastroProduto(cli);
				tela.setVisible(true);

			}

		} else if (e.getSource().equals(buttonBuscarNo)) {
			Produto cli = null;

			for (Produto c : Produto.lista) {
				if (c.nome.equals(tfNome.getText())) {
					cli = c;
					break;
				}
			}
			if (cli == null) {
				JOptionPane.showMessageDialog(null, "Nome inválido");
			} else {
				CadastroProduto tela = new CadastroProduto(cli);
				tela.setVisible(true);

			}

		}

	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
