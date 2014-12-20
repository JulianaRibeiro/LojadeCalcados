package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TextLoader;

import Controller.Dados;
import Model.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 * @author Marri
 */
public class CadastroCliente extends BaseFrame implements ActionListener {

	/**
	 * Creates new form CadastroCliente
	 */
	public CadastroCliente(Cliente c) {
		atual = c;
		EhCadastro = false;
		initComponents();
		
		  textCod.setText(c.cod);
		  textNome.setText(c.nome);
		  textCPF.setText(c.cpf);
		  textRG.setText(c.rg);
		  radioMas.setSelected(c.genero.equals("Masculino"));
		  radioFem.setSelected(c.genero.equals("Feminino"));
		  textData.setText(c.dtnasc);
		  textTelefone.setText(c.tel);
		  comboEC.setSelectedItem(c.ec);
		  textEmail.setText(c.email);
		  textBairro.setText(c.bairro);
		  textLogradouro.setText(c.logradouro);
		  textCom.setText(c.comp);
		  textCEP.setText(c.cep);
		  textCidade.setText(c.cidade);
		  textUF.setText(c.uf);

	}

	public CadastroCliente() {
		atual = new Cliente();
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
		labelCodFun = new javax.swing.JLabel();
		labelNomeFun = new javax.swing.JLabel();
		labelSexo = new javax.swing.JLabel();
		labelRG = new javax.swing.JLabel();
		textRG = new javax.swing.JTextField();
		labelCPF = new javax.swing.JLabel();
		textCPF = new javax.swing.JTextField();
		radioFem = new javax.swing.JRadioButton();
		radioFem.setBackground(Color.WHITE);
		radioMas = new javax.swing.JRadioButton();
		radioMas.setBackground(Color.WHITE);
		textNome = new javax.swing.JTextField();
		textCod = new javax.swing.JTextField();
		labelEC = new javax.swing.JLabel();
		comboEC = new javax.swing.JComboBox();
		comboEC.setBackground(Color.WHITE);
		labelDP = new javax.swing.JLabel();
		labelNasc = new javax.swing.JLabel();
		textData = new javax.swing.JTextField();
		labelEn = new javax.swing.JLabel();
		labelLo = new javax.swing.JLabel();
		textLogradouro = new javax.swing.JTextField();
		labelBairro = new javax.swing.JLabel();
		textBairro = new javax.swing.JTextField();
		labelCom = new javax.swing.JLabel();
		textCom = new javax.swing.JTextField();
		labelCidade = new javax.swing.JLabel();
		textCidade = new javax.swing.JTextField();
		labelUF = new javax.swing.JLabel();
		textUF = new javax.swing.JTextField();
		labelCEP = new javax.swing.JLabel();
		textCEP = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		labelTel = new javax.swing.JLabel();
		textTelefone = new javax.swing.JTextField();
		labelEmail = new javax.swing.JLabel();
		textEmail = new javax.swing.JTextField();
		buttonCan = new javax.swing.JButton();
		buttonSalvar = new javax.swing.JButton();

		setTitle("Cadastro de Cliente");
		setBackground(new java.awt.Color(255, 204, 204));

		labelCodFun.setText("** Codigo: ");

		labelNomeFun.setText("** Nome: ");

		labelSexo.setText("Sexo: ");

		labelRG.setText("** RG: ");

		labelCPF.setText("** CPF: ");

		buttonGroup1.add(radioFem);
		radioFem.setText("Feminino");
		radioFem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				radioFemActionPerformed(evt);
			}
		});

		buttonGroup1.add(radioMas);
		radioMas.setText("Masculino");

		textCod.setVerifyInputWhenFocusTarget(false);

		labelEC.setText("Estado Civil: ");

		comboEC.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Solteiro", "Casado", "Divorciado", "Vi�vo" }));
		comboEC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				comboECActionPerformed(evt);
			}
		});

		labelDP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		labelDP.setText("Dados Pessoais: ");

		labelNasc.setText("** Data de Nascimento:");

		labelEn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		labelEn.setText("Endereco:");

		labelLo.setText("**Logradouro: ");

		labelBairro.setText("** Bairro: ");

		labelCom.setText("** Complemento: ");

		labelCidade.setText("Cidade: ");

		labelUF.setText("** UF: ");

		labelCEP.setText("** CEP: ");

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel1.setText("Contato: ");

		labelTel.setText("Telefone: ");

		labelEmail.setText("E-mail: ");

		buttonCan.setText("CANCELAR");
		buttonCan.addActionListener(this);

		buttonSalvar.setText("SALVAR");
		buttonSalvar.addActionListener(this);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(44, 44, 44)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		labelCodFun)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addGroup(
																																						layout.createSequentialGroup()
																																								.addGap(200,
																																										200,
																																										200)
																																								.addComponent(
																																										labelEC)
																																								.addPreferredGap(
																																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																								.addComponent(
																																										comboEC,
																																										javax.swing.GroupLayout.PREFERRED_SIZE,
																																										91,
																																										javax.swing.GroupLayout.PREFERRED_SIZE))
																																				.addComponent(
																																						textCod,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						114,
																																						javax.swing.GroupLayout.PREFERRED_SIZE)))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		labelNasc)
																																.addGap(18,
																																		18,
																																		18)
																																.addComponent(
																																		textData,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		104,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addGap(0,
																										0,
																										Short.MAX_VALUE)
																								.addComponent(
																										buttonCan)
																								.addGap(49,
																										49,
																										49)))
																.addComponent(
																		buttonSalvar)
																.addContainerGap(
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						labelDP)
																				.addComponent(
																						labelEn)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(215,
																										215,
																										215)
																								.addComponent(
																										labelNomeFun)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										textNome,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										379,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														labelCom)
																												.addComponent(
																														labelLo))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		textLogradouro,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		262,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		labelBairro)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		textBairro,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		106,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		labelCEP))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		textCom,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		145,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		labelCidade)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		textCidade,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		154,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		labelUF)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		textUF,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		35,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										textCEP,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										100,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										labelTel)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										textTelefone,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										127,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										labelEmail)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										textEmail,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										241,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										labelCPF)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										textCPF,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										166,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										labelRG)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										textRG,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										145,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										labelSexo)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										radioFem)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										radioMas)))
																.addContainerGap(
																		36,
																		Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(34, 34, 34)
								.addComponent(labelDP)
								.addGap(27, 27, 27)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(labelCodFun)
												.addComponent(
														textCod,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(labelNomeFun)
												.addComponent(
														textNome,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(labelCPF)
												.addComponent(
														textCPF,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(labelRG)
												.addComponent(
														textRG,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(labelSexo)
												.addComponent(radioFem)
												.addComponent(radioMas))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(labelNasc)
												.addComponent(
														textData,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														comboEC,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(labelEC))
								.addGap(27, 27, 27)
								.addComponent(labelEn)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		labelLo)
																.addGap(18, 18,
																		18)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						labelCidade)
																				.addComponent(
																						textCidade,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						25,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						labelUF)
																				.addComponent(
																						textUF,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						25,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						labelCom)
																				.addComponent(
																						textCom,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						25,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLabel1)
																.addGap(18, 18,
																		18)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						labelTel)
																				.addComponent(
																						textTelefone,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						25,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						labelEmail)
																				.addComponent(
																						textEmail,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						25,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		48,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						buttonCan)
																				.addComponent(
																						buttonSalvar))
																.addGap(20, 20,
																		20))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						textLogradouro,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						labelBairro)
																				.addComponent(
																						textBairro,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						25,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						labelCEP)
																				.addComponent(
																						textCEP,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						25,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18,
																		18)))));

		pack();
	}// </editor-fold>

	private void radioFemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void comboECActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args
	 *            the command line arguments
	 */

	// Variables declaration - do not modify
	private javax.swing.JButton buttonCan;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton buttonSalvar;
	private javax.swing.JComboBox comboEC;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTextField textLogradouro;
	private javax.swing.JLabel labelBairro;
	private javax.swing.JLabel labelCEP;
	private javax.swing.JLabel labelCPF;
	private javax.swing.JLabel labelCidade;
	private javax.swing.JLabel labelCodFun;
	private javax.swing.JLabel labelCom;
	private javax.swing.JLabel labelDP;
	private javax.swing.JLabel labelEC;
	private javax.swing.JLabel labelEmail;
	private javax.swing.JLabel labelEn;
	private javax.swing.JLabel labelLo;
	private javax.swing.JLabel labelNasc;
	private javax.swing.JLabel labelNomeFun;
	private javax.swing.JLabel labelRG;
	private javax.swing.JLabel labelSexo;
	private javax.swing.JLabel labelTel;
	private javax.swing.JLabel labelUF;
	private javax.swing.JRadioButton radioFem;
	private javax.swing.JRadioButton radioMas;
	private javax.swing.JTextField textBairro;
	private javax.swing.JTextField textCEP;
	private javax.swing.JTextField textCPF;
	private javax.swing.JTextField textCidade;
	private javax.swing.JTextField textCod;
	private javax.swing.JTextField textCom;
	private javax.swing.JTextField textData;
	private javax.swing.JTextField textEmail;
	private javax.swing.JTextField textNome;
	private javax.swing.JTextField textRG;
	private javax.swing.JTextField textTelefone;
	private javax.swing.JTextField textUF;

	Cliente atual;
	boolean EhCadastro;

	// End of variables declaration
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == buttonSalvar) {

			if ((textNome.getText().length() == 0)
					|| (textCPF.getText().length() == 0)
					|| (textCod.getText().length() == 0)
					|| (textRG.getText().length() == 0)
					|| (textData.getText().length() == 0)
					|| (textLogradouro.getText().length() == 0)
					|| (textCEP.getText().length() == 0)
					|| (textCidade.getText().length() == 0)
					|| (textUF.getText().length() == 0)) {

				JOptionPane.showMessageDialog(null,
						"Digite os campos obrigatorios **");
				return;
			} else
				JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");

			atual.nome = textNome.getText();
			atual.cod = textCod.getText();

			atual.cpf = textCPF.getText();
			atual.rg = textRG.getText();
			atual.genero = radioMas.isSelected() ? "Masculino" : "Feminino";
			atual.dtnasc = textData.getText();
			atual.tel = textTelefone.getText();
			atual.ec = String.valueOf(comboEC.getSelectedItem());
			atual.email = textEmail.getText();
			atual.logradouro = textLogradouro.getText();
			atual.comp = textCom.getText();
			atual.cep = textCEP.getText();
			atual.cidade = textCidade.getText();
			atual.bairro = textBairro.getText();
			atual.uf = textUF.getText();

			if (EhCadastro) {
				Dados.addCliente(atual);
			}else {
				try {
					Dados.GravarClientes();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			this.setVisible(false);
			
		}
		else {
			this.setVisible(false);
		}
		

	}
}