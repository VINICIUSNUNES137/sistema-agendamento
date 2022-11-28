package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.awt.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class DialogMedico extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private DefaultListModel<String> listaEspecialidadesModel = new DefaultListModel<>();
    private Especialidade especialidade = new Especialidade();
    private ArrayList<Especialidade> especialidadesNSelecionadas = EspecialidadeDAO.listarTodos();
    private ArrayList<String> especialidades = new ArrayList<>();

    private DefaultListModel<String> listaDasEspecialidadesDoMedico = new DefaultListModel<>();
    private ArrayList<String> selecionadas = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadas = new ArrayList<>();

    public DialogMedico(java.awt.Frame parent, boolean modal, TipoOperacao tipoOperacao, Medico medico) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        atualizarListasEspecialidades();

        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();
            atualizarListasEspecialidades();
        }

    }

    private void preencherFormulario() {
        labelTitulo.setText("   Medico - " + tipoOperacao);
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar-texto.png"))); // NOI18N
        textCodigoMedico.setText(medico.getCodigo().toString());
        textNome.setText(medico.getNome());
        textCrm.setText(medico.getCrm());
        textEmail1.setText(medico.getEmail());
        textTelefone.setText(medico.getTelefone());
        textDataDeNascimento.setText(medico.getDataDeNascimento());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelMedico = new javax.swing.JPanel();
        labelCodigoMedico = new javax.swing.JLabel();
        textCodigoMedico = new javax.swing.JTextField();
        labelCrm = new javax.swing.JLabel();
        textCrm = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textDataDeNascimento = new javax.swing.JTextField();
        labelDataDeNascimento = new javax.swing.JLabel();
        labelListaDeEspecialidade = new javax.swing.JLabel();
        scrollListaDeEspecialidade = new javax.swing.JScrollPane();
        listaEspecialidade = new javax.swing.JList<>();
        labelEspecialidadeMedico = new javax.swing.JLabel();
        scrollEspecialidadeMedico = new javax.swing.JScrollPane();
        listaEspecialidadeMedico = new javax.swing.JList<>();
        buttonEnviarEspecialidade = new javax.swing.JButton();
        buttonVoltarEspecialidade = new javax.swing.JButton();
        buttonCancelarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();
        textEmail1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(250, 250, 250));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add (1).png"))); // NOI18N
        labelTitulo.setText("   MEDICOS - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 10, 320, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 70);

        panelMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " DETALHES DOS MEDICOS ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(51, 153, 255))); // NOI18N
        panelMedico.setForeground(new java.awt.Color(51, 153, 255));
        panelMedico.setToolTipText("");
        panelMedico.setLayout(null);

        labelCodigoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCodigoMedico.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigoMedico.setText("Código: ");
        panelMedico.add(labelCodigoMedico);
        labelCodigoMedico.setBounds(50, 40, 70, 20);

        textCodigoMedico.setEditable(false);
        textCodigoMedico.setBackground(new java.awt.Color(255, 204, 51));
        panelMedico.add(textCodigoMedico);
        textCodigoMedico.setBounds(50, 60, 80, 30);

        labelCrm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCrm.setForeground(new java.awt.Color(51, 153, 255));
        labelCrm.setText("CRM:");
        panelMedico.add(labelCrm);
        labelCrm.setBounds(140, 40, 70, 20);

        textCrm.setBackground(new java.awt.Color(250, 250, 250));
        panelMedico.add(textCrm);
        textCrm.setBounds(140, 60, 140, 30);

        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(51, 153, 255));
        labelNome.setText("Nome do médico(a):");
        panelMedico.add(labelNome);
        labelNome.setBounds(290, 40, 140, 20);

        textNome.setBackground(new java.awt.Color(250, 250, 250));
        panelMedico.add(textNome);
        textNome.setBounds(290, 60, 480, 30);

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(51, 153, 255));
        labelTelefone.setText("Telefone:");
        panelMedico.add(labelTelefone);
        labelTelefone.setBounds(50, 110, 70, 20);

        textTelefone.setBackground(new java.awt.Color(250, 250, 250));
        panelMedico.add(textTelefone);
        textTelefone.setBounds(50, 130, 160, 30);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(51, 153, 255));
        labelEmail.setText("E-MAIL:");
        panelMedico.add(labelEmail);
        labelEmail.setBounds(220, 110, 70, 20);

        textDataDeNascimento.setBackground(new java.awt.Color(250, 250, 250));
        textDataDeNascimento.setToolTipText("dd/mm/yyyy");
        panelMedico.add(textDataDeNascimento);
        textDataDeNascimento.setBounds(590, 130, 150, 30);

        labelDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataDeNascimento.setForeground(new java.awt.Color(51, 153, 255));
        labelDataDeNascimento.setText("Data de Nascimento:");
        panelMedico.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(590, 110, 150, 20);

        labelListaDeEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelListaDeEspecialidade.setForeground(new java.awt.Color(51, 153, 255));
        labelListaDeEspecialidade.setText("Lista de Especialidade:");
        panelMedico.add(labelListaDeEspecialidade);
        labelListaDeEspecialidade.setBounds(60, 210, 160, 20);

        listaEspecialidade.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollListaDeEspecialidade.setViewportView(listaEspecialidade);

        panelMedico.add(scrollListaDeEspecialidade);
        scrollListaDeEspecialidade.setBounds(60, 236, 230, 180);

        labelEspecialidadeMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEspecialidadeMedico.setForeground(new java.awt.Color(51, 153, 255));
        labelEspecialidadeMedico.setText("Especialidades do Médico:");
        panelMedico.add(labelEspecialidadeMedico);
        labelEspecialidadeMedico.setBounds(420, 220, 190, 20);

        listaEspecialidadeMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollEspecialidadeMedico.setViewportView(listaEspecialidadeMedico);

        panelMedico.add(scrollEspecialidadeMedico);
        scrollEspecialidadeMedico.setBounds(420, 240, 230, 180);

        buttonEnviarEspecialidade.setBackground(new java.awt.Color(250, 250, 250));
        buttonEnviarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/right-arrow-blue.png"))); // NOI18N
        buttonEnviarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarEspecialidadeActionPerformed(evt);
            }
        });
        panelMedico.add(buttonEnviarEspecialidade);
        buttonEnviarEspecialidade.setBounds(320, 260, 80, 40);

        buttonVoltarEspecialidade.setBackground(new java.awt.Color(250, 250, 250));
        buttonVoltarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/right-arrow-red.png"))); // NOI18N
        buttonVoltarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarEspecialidadeActionPerformed(evt);
            }
        });
        panelMedico.add(buttonVoltarEspecialidade);
        buttonVoltarEspecialidade.setBounds(320, 330, 80, 40);

        buttonCancelarMedico.setBackground(new java.awt.Color(250, 250, 250));
        buttonCancelarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarMedicoActionPerformed(evt);
            }
        });
        panelMedico.add(buttonCancelarMedico);
        buttonCancelarMedico.setBounds(740, 480, 60, 60);

        buttonAdicionarMedico.setBackground(new java.awt.Color(250, 250, 250));
        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/diskette.png"))); // NOI18N
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        panelMedico.add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(670, 480, 60, 60);

        textEmail1.setBackground(new java.awt.Color(250, 250, 250));
        textEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmail1ActionPerformed(evt);
            }
        });
        panelMedico.add(textEmail1);
        textEmail1.setBounds(220, 130, 360, 30);

        getContentPane().add(panelMedico);
        panelMedico.setBounds(0, 80, 820, 550);

        setBounds(0, 0, 838, 675);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarMedicoActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarMedicoActionPerformed

    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed

        ///GRAVAR
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed

    private void textEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmail1ActionPerformed

    private void buttonEnviarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarEspecialidadeActionPerformed
        java.util.List<String> especialidadesDoMedico = listaEspecialidade.getSelectedValuesList();

        for (String e : especialidadesDoMedico) {
            selecionadas.add(e);
        }
        for (Especialidade e : especialidadesNSelecionadas) {
            if (especialidadesDoMedico.contains(e.getNome())) {
                especialidadesSelecionadas.add(e);
            }
        }

        listaDasEspecialidadesDoMedico.clear();
        listaDasEspecialidadesDoMedico.addAll(selecionadas);
        listaEspecialidadeMedico.setModel(listaDasEspecialidadesDoMedico);

        int[] excluir = listaEspecialidade.getSelectedIndices();
        for (int e : excluir) {
            listaEspecialidadesModel.remove(e);
            especialidades.remove(e);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnviarEspecialidadeActionPerformed

    private void buttonVoltarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarEspecialidadeActionPerformed

        java.util.List<String> removerEspecialidades = listaEspecialidadeMedico.getSelectedValuesList();

        for (String e : removerEspecialidades) {
            especialidades.add(e);
        }
        for (Especialidade e : especialidadesNSelecionadas) {
            if (removerEspecialidades.contains(e.getNome())) {
                especialidadesSelecionadas.remove(e);
            }
        }

        listaEspecialidadesModel.clear();
        listaEspecialidadesModel.addAll(especialidades);
        listaEspecialidade.setModel(listaEspecialidadesModel);

        int[] excluir = listaEspecialidadeMedico.getSelectedIndices();
        for (int e : excluir) {
            listaDasEspecialidadesDoMedico.remove(e);
            selecionadas.remove(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarEspecialidadeActionPerformed

    private void atualizar() {
        medico.setNome(textNome.getText());
        medico.setCrm(textCrm.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail1.getText());
        medico.setDataDeNascimento(textDataDeNascimento.getText());
        medico.setEspecialidades(especialidadesSelecionadas);
        MedicoDAO.atualizar(medico);
        
        
        if (validarCadastro()) {
            MedicoDAO.atualizar(medico);
            JOptionPane.showMessageDialog(
                    null,
                    "Plano de Saúde foi atualizado com sucesso!",
                    "Plano De Saúde ",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

    }

    private void gravar() {
        Medico medico = new Medico();
        medico.setNome(textNome.getText());
        medico.setCrm(textCrm.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail1.getText());
        medico.setDataDeNascimento(textDataDeNascimento.getText());
        medico.setEspecialidades(especialidadesSelecionadas);

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);
            JOptionPane.showMessageDialog(
                    this,
                    "Médico cadastrado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

        // TODO add your handling code here:
    }

    private boolean validarCadastro() {

        if (textNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o campo Nome",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            textNome.requestFocus();
            return false;
        }
        if (textCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o campo CRM",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            textCrm.requestFocus();
            return false;
        }
        if (textTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o campo Telefone",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            textTelefone.requestFocus();
            return false;
        }

        if (textDataDeNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o campo Telefone",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            textDataDeNascimento.requestFocus();
            return false;
        }

        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonCancelarMedico;
    private javax.swing.JButton buttonEnviarEspecialidade;
    private javax.swing.JButton buttonVoltarEspecialidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCodigoMedico;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadeMedico;
    private javax.swing.JLabel labelListaDeEspecialidade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaEspecialidade;
    private javax.swing.JList<String> listaEspecialidadeMedico;
    private javax.swing.JPanel panelMedico;
    private javax.swing.JScrollPane scrollEspecialidadeMedico;
    private javax.swing.JScrollPane scrollListaDeEspecialidade;
    private javax.swing.JTextField textCodigoMedico;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textDataDeNascimento;
    private javax.swing.JTextField textEmail1;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables

    private void atualizarListasEspecialidades() {
        especialidades = EspecialidadeDAO.getListaDeNomes();
        listaEspecialidadesModel.addAll(especialidades);
        listaEspecialidade.setModel(listaEspecialidadesModel);
        if (tipoOperacao == TipoOperacao.ADICIONAR) {

        } else {
            especialidadesSelecionadas = medico.getEspecialidades();
            selecionadas = medico.getListaDeEspecialidadesDoMedico();
            listaDasEspecialidadesDoMedico.clear();
            listaDasEspecialidadesDoMedico.addAll(selecionadas);
            listaEspecialidadeMedico.setModel(listaDasEspecialidadesDoMedico);

            int i = 0;
            for (String e : selecionadas) {
                if (especialidades.contains(e)) {
                    especialidades.remove(e);
                }
            }
            listaEspecialidadesModel.clear();
            listaEspecialidadesModel.addAll(especialidades);

        }

    }
}
