/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Aplicação.Dados;
import Persistência.Cliente;
import Persistência.Produto;
import Persistência.Venda;

/**
 *
 * @author Juliana
 */
public class CadastroVenda extends BaseFrame implements ActionListener {

    public CadastroVenda(Venda c) {
        atual = c;
        EhCadastro = false;
        initComponents();

        textCod.setText(c.getCod());
        textNomePro.setText(c.getNome());
        textDescricao.setText(c.getDesc());
        radioCartao.setSelected(c.getPag().equals("Cartao"));
        radioDinheiro.setSelected(c.getPag().equals("Dinheiro"));
        radioCrediario.setSelected(c.getPag().equals("Crediario"));
        radioCheque.setSelected(c.getPag().equals("Cheque"));
        textQuant.setText(c.getQtd());
        textValor.setText(c.getValorUn());
    }

    public CadastroVenda() {
        atual = new Venda();
        EhCadastro = true;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        textCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNomePro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textQuant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        radioCartao = new javax.swing.JRadioButton();
        radioCartao.setBackground(Color.WHITE);
        radioDinheiro = new javax.swing.JRadioButton();
        radioDinheiro.setBackground(Color.WHITE);
        radioCrediario = new javax.swing.JRadioButton();
        radioCrediario.setBackground(Color.WHITE);
        radioCheque = new javax.swing.JRadioButton();
        radioCheque.setBackground(Color.WHITE);
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        label1.setText("** Cadastrar Venda");

        jLabel1.setText("** Codigo da Venda:");

        jLabel2.setText("** Nome do Produto:");

        jLabel3.setText("** Quantidade:");

        jLabel4.setText("** Valor Unitario:");

        jLabel5.setText("Descricao:");

        textDescricao.setColumns(20);
        textDescricao.setRows(5);
        jScrollPane1.setViewportView(textDescricao);

        jLabel6.setText("Tipo de Pagamento:");

        buttonGroup1.add(radioCartao);
        radioCartao.setText("Cartao");
        radioCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCartaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioDinheiro);
        radioDinheiro.setText("Dinheiro");

        buttonGroup1.add(radioCrediario);
        radioCrediario.setText("Crediario");

        buttonGroup1.add(radioCheque);
        radioCheque.setText("Cheque");

        buttonSalvar.setText("SALVAR");
        buttonSalvar.addActionListener(this);

        buttonCancelar.setText("CANCELAR");
        buttonCancelar.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                        layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(
                                        layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(
                                                jLabel6)
                                        .addGap(29, 29,
                                                29)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(
                                                        radioCartao)
                                                .addComponent(
                                                        radioCrediario))
                                        .addGap(43, 43,
                                                43)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(
                                                        radioDinheiro)
                                                .addComponent(
                                                        radioCheque)))
                                .addGroup(
                                        layout.createSequentialGroup()
                                        .addGap(163,
                                                163,
                                                163)
                                        .addComponent(
                                                label1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(
                                        layout.createSequentialGroup()
                                        .addGap(20, 20,
                                                20)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        false)
                                                .addGroup(
                                                        layout.createSequentialGroup()
                                                        .addComponent(
                                                                jLabel5)
                                                        .addGap(18,
                                                                18,
                                                                18)
                                                        .addComponent(
                                                                jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                187,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(
                                                        layout.createSequentialGroup()
                                                        .addGroup(
                                                                layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(
                                                                        jLabel1)
                                                                .addComponent(
                                                                        jLabel2))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(
                                                                layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(
                                                                        textCod,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        84,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(
                                                                        textNomePro,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        206,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(
                                                        layout.createSequentialGroup()
                                                        .addComponent(
                                                                jLabel3)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(
                                                                textQuant,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                44,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(58,
                                                                58,
                                                                58)
                                                        .addComponent(
                                                                jLabel4)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(
                                                                textValor))))
                                .addGroup(
                                        layout.createSequentialGroup()
                                        .addGap(91, 91,
                                                91)
                                        .addComponent(
                                                buttonCancelar)
                                        .addGap(34, 34,
                                                34)
                                        .addComponent(
                                                buttonSalvar)))
                        .addContainerGap(130, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                        layout.createSequentialGroup()
                        .addComponent(label1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(
                                layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(
                                        textCod,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(
                                layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(
                                        textNomePro,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(
                                layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(
                                        textValor,
                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(
                                        layout.createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(
                                                jLabel3)
                                        .addComponent(
                                                textQuant,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(
                                                jLabel4)))
                        .addGroup(
                                layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(
                                        layout.createSequentialGroup()
                                        .addGap(26, 26,
                                                26)
                                        .addComponent(
                                                jLabel5))
                                .addGroup(
                                        layout.createSequentialGroup()
                                        .addGap(18, 18,
                                                18)
                                        .addComponent(
                                                jScrollPane1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(
                                layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(radioCartao)
                                .addComponent(radioDinheiro))
                        .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(
                                layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioCrediario)
                                .addComponent(radioCheque))
                        .addGap(18, 18, 18)
                        .addGroup(
                                layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonCancelar)
                                .addComponent(buttonSalvar))
                        .addContainerGap(20, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    private void radioCartaoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField textQuant;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioCartao;
    private javax.swing.JRadioButton radioDinheiro;
    private javax.swing.JRadioButton radioCrediario;
    private javax.swing.JRadioButton radioCheque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textDescricao;
    private java.awt.Label label1;
    private javax.swing.JTextField textCod;
    private javax.swing.JTextField textNomePro;
    private javax.swing.JTextField textValor;

    Venda atual;
    boolean EhCadastro;

	// End of variab
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonSalvar) {

            if ((textNomePro.getText().length() == 0)
                    || (!radioCartao.isSelected()
                    && !radioDinheiro.isSelected()
                    && !radioCrediario.isSelected() && !radioCheque
                    .isSelected())
                    || (textCod.getText().length() == 0)
                    || (textQuant.getText().length() == 0)
                    || (textValor.getText().length() == 0)) {

                JOptionPane.showMessageDialog(null,
                        "Digite os campos obrigatorios **");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
            }

            atual.setNome(textNomePro.getText());
            atual.setCod(textCod.getText());
            atual.setDesc(textDescricao.getText());
            atual.setPag(radioCartao.isSelected() ? "Cartao" : radioDinheiro
                    .isSelected() ? "Dinheiro"
                            : radioCrediario.isSelected() ? "Crediario" : "Cheque");
            atual.setQtd(textQuant.getText());
            atual.setValorUn(textValor.getText());

            if (EhCadastro) {
                Dados.addVenda(atual);
            } else {
                try {
                    Dados.GravarVendas();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
            this.setVisible(false);
        }

        Produto prod = null;

        for (Produto p : Produto.getLista()) {

            if (p.getNome().equals(textNomePro.getText())) {
                int qtd_est;
                qtd_est = Integer.parseInt(p.getEstTotal())
                        - Integer.parseInt(textQuant.getText());
                p.setEstTotal(Integer.toString(qtd_est));
                prod = p;
                break;

            }
        }
        if (prod == null) {
            JOptionPane.showMessageDialog(null, "Produto nao encontrado");
            return;
        } else {
            try {
                Dados.GravarProdutos();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        if (e.getSource() == buttonCancelar) {
            this.setVisible(false);
        }

    }
}
