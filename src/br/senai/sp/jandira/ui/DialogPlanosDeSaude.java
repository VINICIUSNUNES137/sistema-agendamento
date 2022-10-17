/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class DialogPlanosDeSaude extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public DialogPlanosDeSaude(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;

        //PREENCHIMENTO CASO FOR ALTERAR
        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();
        }

    }

    private void preencherFormulario() {
        labelTitulo.setText("Planos de Saúde " + tipoOperacao);
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar-texto.png"))); // NOI18N
        textCodigo.setText(planoDeSaude.getCodigo().toString());
        textNomeDaOperadora.setText(planoDeSaude.getOperadora());
        textTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        labelNomeDaOperadora = new javax.swing.JLabel();
        textNomeDaOperadora = new javax.swing.JTextField();
        labelTipoDoPlano = new javax.swing.JLabel();
        textTipoDoPlano = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(250, 250, 250));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add (1).png"))); // NOI18N
        labelTitulo.setText(" Planos De Saúde - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 10, 320, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " DETALHES DO PLANO DE SAÚDE ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 153, 255));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(40, 40, 70, 30);

        textCodigo.setEditable(false);
        textCodigo.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.add(textCodigo);
        textCodigo.setBounds(40, 70, 110, 30);

        labelNomeDaOperadora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeDaOperadora.setForeground(new java.awt.Color(51, 153, 255));
        labelNomeDaOperadora.setText("Nome da Operadora:");
        jPanel2.add(labelNomeDaOperadora);
        labelNomeDaOperadora.setBounds(40, 100, 150, 30);
        jPanel2.add(textNomeDaOperadora);
        textNomeDaOperadora.setBounds(40, 130, 360, 30);

        labelTipoDoPlano.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTipoDoPlano.setForeground(new java.awt.Color(51, 153, 255));
        labelTipoDoPlano.setText("Tipo do Plano");
        jPanel2.add(labelTipoDoPlano);
        labelTipoDoPlano.setBounds(40, 160, 110, 30);
        jPanel2.add(textTipoDoPlano);
        textTipoDoPlano.setBounds(40, 190, 360, 30);

        buttonCancelar.setBackground(new java.awt.Color(250, 250, 250));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Botão para cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(550, 270, 60, 60);

        buttonSalvar.setBackground(new java.awt.Color(250, 250, 250));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/diskette.png"))); // NOI18N
        buttonSalvar.setToolTipText("Botão para salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(480, 270, 60, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 90, 620, 350);

        setBounds(0, 0, 656, 493);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        //criar um obj plano de saude

        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }


    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void gravar() {
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            JOptionPane.showMessageDialog(
                    this,
                    "Plano de Saúde cadastrado com sucesso!",
                    "Plano de Saúde",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        // TODO add your handling code here:
    }
    
    private void atualizar() {
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());
        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        JOptionPane.showMessageDialog(null, "Plano de Saúde foi atualizado com sucesso!", "Plano De Saúde ", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    private boolean validarCadastro() {
//        if (textNomeDaOperadora.getText().isEmpty() && textTipoDoPlano.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(
//                    this, 
//                    "Por favor preencha o nome da Operadora e Tipo do Plano", 
//                    "Plano de Saúde", 
//                    JOptionPane.ERROR_MESSAGE);
//            return false;
//        }

        if (textNomeDaOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome da Operadora",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
            textNomeDaOperadora.requestFocus();
            return false;
        }
        if (textTipoDoPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o Tipo Do Plano",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
            textTipoDoPlano.requestFocus();
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNomeDaOperadora;
    private javax.swing.JLabel labelTipoDoPlano;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textNomeDaOperadora;
    private javax.swing.JTextField textTipoDoPlano;
    // End of variables declaration//GEN-END:variables
}
