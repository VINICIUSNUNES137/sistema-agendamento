package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class DialogEspecialidade extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;

    public DialogEspecialidade(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Especialidade especialidade) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        labelEspecialidade = new javax.swing.JLabel();
        textEspecialidade = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        textDescricao = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(250, 250, 250));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add (1).png"))); // NOI18N
        labelTitulo.setText("   Especialidades - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 10, 320, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " DETALHES DO PLANO DE SAÚDE ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 153, 255));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo.setText("Código: ");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(50, 40, 70, 20);

        textCodigo.setEditable(false);
        textCodigo.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.add(textCodigo);
        textCodigo.setBounds(50, 60, 80, 30);

        labelEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEspecialidade.setForeground(new java.awt.Color(51, 153, 255));
        labelEspecialidade.setText("Nome da Especialidade:");
        jPanel2.add(labelEspecialidade);
        labelEspecialidade.setBounds(50, 100, 180, 20);
        jPanel2.add(textEspecialidade);
        textEspecialidade.setBounds(50, 120, 200, 30);

        labelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDescricao.setForeground(new java.awt.Color(51, 153, 255));
        labelDescricao.setText("Descrição:");
        jPanel2.add(labelDescricao);
        labelDescricao.setBounds(50, 160, 180, 20);
        jPanel2.add(textDescricao);
        textDescricao.setBounds(50, 180, 470, 30);

        buttonCancelar.setBackground(new java.awt.Color(250, 250, 250));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(540, 270, 60, 60);

        buttonAdicionar.setBackground(new java.awt.Color(250, 250, 250));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/diskette.png"))); // NOI18N
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAdicionar);
        buttonAdicionar.setBounds(470, 270, 60, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 620, 350);

        setBounds(0, 0, 658, 479);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    public void gravar() {
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());

        if (validarCadastro()) {
            EspecialidadeDAO.gravar(especialidade);
            JOptionPane.showMessageDialog(
                    this,
                    "Especialidade cadastrada com sucesso!",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();

        }
    }

    private void atualizar() {
        especialidade.setNome(textEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());

        if (validarCadastro()) {
            EspecialidadeDAO.atualizar(especialidade);
            JOptionPane.showMessageDialog(
                    null,
                    "Especialidade atualizada com sucesso",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome da Especialidade",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            textEspecialidade.requestFocus();
            return false;
        }
        if (textDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha a descrição da Especialidade",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            textDescricao.requestFocus();
            return false;
        }

        return true;
    }

    private void preencherFormulario() {
        labelTitulo.setText("   Especialidade - " + tipoOperacao);
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar-texto.png")));
        textCodigo.setText(especialidade.getCodigo().toString());
        textEspecialidade.setText(especialidade.getNome());
        textDescricao.setText(especialidade.getDescricao());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textEspecialidade;
    // End of variables declaration//GEN-END:variables
}
