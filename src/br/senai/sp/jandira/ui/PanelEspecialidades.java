package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelEspecialidades extends javax.swing.JPanel {

    public PanelEspecialidades() {

        initComponents();
        criarTabelaEspecialidade();
    }

    int linha;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEspecialidades = new javax.swing.JPanel();
        scrollEspecialidade = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();

        setLayout(null);

        panelEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " ESPECIALIDADES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(71, 158, 255))); // NOI18N
        panelEspecialidades.setToolTipText("Planos de Saúde");
        panelEspecialidades.setLayout(null);

        tableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollEspecialidade.setViewportView(tableEspecialidade);

        panelEspecialidades.add(scrollEspecialidade);
        scrollEspecialidade.setBounds(30, 30, 960, 270);

        buttonExcluir.setBackground(new java.awt.Color(250, 250, 250));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/bin (1).png"))); // NOI18N
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        panelEspecialidades.add(buttonExcluir);
        buttonExcluir.setBounds(930, 380, 60, 60);

        buttonAdicionar.setBackground(new java.awt.Color(250, 250, 250));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        panelEspecialidades.add(buttonAdicionar);
        buttonAdicionar.setBounds(790, 380, 60, 60);

        buttonAtualizar.setBackground(new java.awt.Color(250, 250, 250));
        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });
        panelEspecialidades.add(buttonAtualizar);
        buttonAtualizar.setBounds(860, 380, 60, 60);

        add(panelEspecialidades);
        panelEspecialidades.setBounds(0, 0, 1010, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        DialogEspecialidade dialogEspecialiade = new DialogEspecialidade(
                null,
                true,
                TipoOperacao.ADICIONAR,
                null);
        dialogEspecialiade.setVisible(true);

        criarTabelaEspecialidade(); //refresh

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        linha = tableEspecialidade.getSelectedRow();

        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione a especialidade a ser excluída",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed

            linha = tableEspecialidade.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor selecione a especialidade a ser alterada",
                "Especialidade",
                JOptionPane.WARNING_MESSAGE);
        }
//        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão da Especialidade selecionada?",
                "Especialidade",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDAO.excluir(getCodigo());
            criarTabelaEspecialidade();
        }

    }

    private Integer getCodigo() {
        String codigoStr = tableEspecialidade.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);

    }

    private void editar() {
        //        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());

        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        DialogEspecialidade dialogEspecialidade = new DialogEspecialidade(
                null,
                true,
                TipoOperacao.ALTERAR,
                especialidade
        );
        dialogEspecialidade.setVisible(true);
        criarTabelaEspecialidade();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel panelEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidade;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidade() {
        tableEspecialidade.setModel(EspecialidadeDAO.getTableModel());
        tableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(400);
        tableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(457);
        tableEspecialidade.getTableHeader().setReorderingAllowed(false);
        tableEspecialidade.setDefaultEditor(Object.class, null);
    }

}
