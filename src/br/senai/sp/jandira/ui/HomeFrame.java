/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282114
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaudeTeste();
        initPanels();
    }
    
    //atributos da classe
    PanelPlanosDeSaude panelPlanosDeSaude;
    
    //constantes da classe
    private final int POSICAO_X = 10;
    private final int POSICAO_Y = 210;
    private final int LARGURA = 1010;
    private final int ALTURA = 450;
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonEspecialidades1 = new javax.swing.JButton();
        buttonAgenda1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE AGENDAMENTO DE CONSULTAS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 15, 540, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doutora (4).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 64, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 70);

        buttonSair.setBackground(new java.awt.Color(250, 250, 250));
        buttonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 0, 51));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/opcao-de-sair.png"))); // NOI18N
        buttonSair.setText("SAIR");
        buttonSair.setToolTipText("");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(910, 110, 110, 60);

        buttonHome.setBackground(new java.awt.Color(234, 255, 255));
        buttonHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/silhueta-de-icone-de-casa.png"))); // NOI18N
        buttonHome.setToolTipText("");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 110, 70, 60);

        buttonPaciente.setBackground(new java.awt.Color(250, 250, 250));
        buttonPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/paciente.png"))); // NOI18N
        buttonPaciente.setText("PACIENTES");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(230, 110, 140, 60);

        buttonMedicos.setBackground(new java.awt.Color(250, 250, 250));
        buttonMedicos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/assistencia-medica.png"))); // NOI18N
        buttonMedicos.setText("MÉDICOS");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(380, 110, 140, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(250, 250, 250));
        buttonPlanosDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/estetoscopio (1).png"))); // NOI18N
        buttonPlanosDeSaude.setText("PLANOS DE SAÚDE");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(710, 110, 190, 60);

        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " HOME ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(71, 158, 255))); // NOI18N
        panelHome.setToolTipText("Planos de Saúde");
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 158, 255));
        jLabel3.setText("CONTATOS:");
        jLabel3.setToolTipText("");
        panelHome.add(jLabel3);
        jLabel3.setBounds(90, 200, 150, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 158, 255));
        jLabel4.setText("SISACON");
        jLabel4.setToolTipText("");
        panelHome.add(jLabel4);
        jLabel4.setBounds(80, 50, 230, 60);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(110, 110, 110));
        jLabel5.setText("SITE: www.sisacon.com.br");
        jLabel5.setToolTipText("");
        panelHome.add(jLabel5);
        jLabel5.setBounds(90, 270, 200, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(110, 110, 110));
        jLabel6.setText("Sistema para Agendameto de Consultas");
        jLabel6.setToolTipText("");
        panelHome.add(jLabel6);
        jLabel6.setBounds(80, 100, 350, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(110, 110, 110));
        jLabel8.setText("E-MAIL: suporte@sisacon.com.br");
        jLabel8.setToolTipText("");
        panelHome.add(jLabel8);
        jLabel8.setBounds(90, 230, 290, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(110, 110, 110));
        jLabel7.setText("TEL: (11) 95555-5555");
        jLabel7.setToolTipText("");
        panelHome.add(jLabel7);
        jLabel7.setBounds(90, 250, 200, 30);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 210, 1010, 450);

        buttonEspecialidades1.setBackground(new java.awt.Color(250, 250, 250));
        buttonEspecialidades1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonEspecialidades1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/estetoscopio.png"))); // NOI18N
        buttonEspecialidades1.setText("ESPECIALIDADES");
        buttonEspecialidades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidades1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades1);
        buttonEspecialidades1.setBounds(530, 110, 170, 60);

        buttonAgenda1.setBackground(new java.awt.Color(250, 250, 250));
        buttonAgenda1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/calendario.png"))); // NOI18N
        buttonAgenda1.setText("AGENDA");
        buttonAgenda1.setToolTipText("");
        buttonAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgenda1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda1);
        buttonAgenda1.setBounds(100, 110, 120, 60);

        setBounds(0, 0, 1042, 707);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
        panelHome.setVisible(true);
        panelPlanosDeSaude.setVisible(false);
        buttonPlanosDeSaude.setBackground(new java.awt.Color(250,250,250));
        buttonHome.setBackground(new java.awt.Color(234,255,255));
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed

        
        panelHome.setVisible(false);
        panelPlanosDeSaude.setVisible(true);
        buttonPlanosDeSaude.setBackground(new java.awt.Color(234,255,255));
        buttonHome.setBackground(new java.awt.Color(250,250,250));
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonEspecialidades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidades1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidades1ActionPerformed

    private void buttonAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgenda1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonEspecialidades1;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
    panelPlanosDeSaude = new PanelPlanosDeSaude();
    panelPlanosDeSaude.setBounds(
            POSICAO_X, 
            POSICAO_Y, 
            LARGURA, 
            ALTURA);
    getContentPane().add(panelPlanosDeSaude);
    panelPlanosDeSaude.setVisible(false);

    }

    

}
