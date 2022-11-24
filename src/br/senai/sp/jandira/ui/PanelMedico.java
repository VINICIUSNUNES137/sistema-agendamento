package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.awt.Dialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {


    public PanelMedico() {
        initComponents();
        criarTabelaMedicos();
    }
    
        int linha;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAdicionar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        scrollTableMedico = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, " MEDICOS ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(51, 153, 255))); // NOI18N
        setLayout(null);

        buttonAdicionar.setBackground(new java.awt.Color(250, 250, 250));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(800, 380, 60, 60);

        buttonEditar.setBackground(new java.awt.Color(250, 250, 250));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(870, 380, 60, 60);

        buttonExcluir.setBackground(new java.awt.Color(250, 250, 250));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/bin (1).png"))); // NOI18N
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(940, 380, 60, 60);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTableMedico.setViewportView(tableMedico);

        add(scrollTableMedico);
        scrollTableMedico.setBounds(30, 30, 960, 270);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        Dialog dialogMedico = new DialogMedico(
                null,
                true, 
                TipoOperacao.ADICIONAR, 
                null);
        dialogMedico.setVisible(true);

        criarTabelaMedicos();


    }//GEN-LAST:event_buttonAdicionarActionPerformed
 private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão do médico selecionado?",
                "Médico",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
         criarTabelaMedicos();
        }

    }
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed


                        linha = tableMedico.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor selecione a especialidade a ser alterada",
                "Especialidade",
                JOptionPane.WARNING_MESSAGE);
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

       linha = tableMedico.getSelectedRow();

        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione a especialidade a ser excluída",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane scrollTableMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables

    private Integer getCodigo() {

        String codigoStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);

    }

    private void editar() {
        Medico medico = MedicoDAO.getMedico(getCodigo());
        
        DialogMedico dialogMedico = new DialogMedico(null, 
                true, 
                TipoOperacao.ALTERAR, 
                medico);
        dialogMedico.setVisible(true);
    }

    
    private void criarTabelaMedicos() {

        tableMedico.setModel(MedicoDAO.getTableModel());

        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(500);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(357);

        tableMedico.getTableHeader().setReorderingAllowed(false);

        tableMedico.setDefaultEditor(Object.class, null);

    }

}
