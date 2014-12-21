package Interface;

import Aplicação.Dados;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
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

import Persistência.Cliente;
import Persistência.Usuario;
/** Classe que permite Consultar e Alterar os dados do Cliente*/
public class ConsultaCliente extends JDialog implements MouseListener, ActionListener {

    private static final long serialVersionUID = 2227060387001221294L;

    private JButton buttonBuscarNo, buttonBuscarCo, buttonExcluir;
    private JTextField tfId, tfNome;

    private JTable tc;
    private JPanel pp;
    private JScrollPane sp;

    private ArrayList<Cliente> dados;

    private Cliente clienteSelecionado = null;

    public ConsultaCliente() {

        this.setLayout(null);

        this.setSize(800, 400);
        this.setLocationRelativeTo(null);

        pp = new JPanel();
        pp.setBackground(Color.WHITE);
        this.add(pp);
        pp.setSize(800, 400);
        pp.setLocation(0, 0);

        int xl = 100;

        JLabel lId = new JLabel("Codigo Cliente:");
        pp.add(lId);
        pp.setLayout(null);
        lId.setLocation(xl, 10);
        lId.setSize(100, 30);

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

        preencherGrid();

        this.buttonExcluir = new JButton("Excluir");
        buttonExcluir.addActionListener(this);
        pp.add(buttonExcluir);
        buttonExcluir.setLocation(20, 315);
        buttonExcluir.setSize(100, 30);

    }

    public void mouseClicked(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        int row = target.getSelectedRow();

        clienteSelecionado = this.dados.get(row);

        if (e.getClickCount() == 2) {
            CadastroCliente tela = new CadastroCliente(clienteSelecionado);
            tela.setVisible(true);
        }
    }
/** Classe que coloca Clientes na JTable*/
    private void preencherGrid() {

        if (sp != null) {
            pp.remove(sp);
        }

        tc = new JTable();
        DefaultTableModel dtf = (new DefaultTableModel() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        });

        tc.setModel(dtf);
        tc.addMouseListener(this);

        dtf.addColumn("Codigo");
        dtf.addColumn("Nome");
        dtf.addColumn("CPF");
        dtf.addColumn("Telefone");
        dtf.addColumn("Email");

        this.dados = Cliente.getLista();

        for (Cliente c : this.dados) {

            dtf.addRow(new Object[]{c.getCod(), c.getNome(), c.getCpf(), c.getTel(), c.getEmail(), c.getCpf(), c.getTel(), c.getEmail()});
        }

        sp = new JScrollPane(tc);

        pp.add(sp);
        sp.setSize(800, 200);
        sp.setLocation(0, 100);
    }

    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(buttonBuscarCo)) {

            Cliente cli = null;

            for (Cliente c : Cliente.getLista()) {
                if (c.getCod().equals(tfId.getText())) {
                    cli = c;
                    break;
                }
            }
            if (cli == null) {
                JOptionPane.showMessageDialog(null, "Codigo invalido");
            } else {
                CadastroCliente tela = new CadastroCliente(cli);
                tela.setVisible(true);

            }

        } else if (e.getSource().equals(buttonBuscarNo)) {
            Cliente cli = null;

            for (Cliente c : Cliente.getLista()) {
                if (c.getNome().equals(tfNome.getText())) {
                    cli = c;
                    break;
                }
            }
            if (cli == null) {
                JOptionPane.showMessageDialog(null, "Nome inv�lido");
            } else {
                CadastroCliente tela = new CadastroCliente(cli);
                tela.setVisible(true);

            }

        } else if (e.getSource().equals(buttonExcluir)) {

            if (Usuario.getUsuarioLogado().getTipo().equalsIgnoreCase("f")){
                JOptionPane.showMessageDialog(this,"Você não tem permissão de acesso");
                return;
            }
            Dados.removeCliente(clienteSelecionado);
            preencherGrid();
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
