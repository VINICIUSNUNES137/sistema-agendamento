package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    //CRIAR O GRAVAR EM ARQUIVO
    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282114\\java\\Medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282114\\java\\Medico_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDAO(Medico medico) {
        this.medicos.add(medico);
    }

    public MedicoDAO() {

    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m), medico);
                break;
            }
        }
        atualizarArquivo();
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static boolean excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo() == codigo) {
                medicos.remove(m);
                break;
            }
        }

        atualizarArquivo();
        return false;

    }

    public static void gravar(Medico medico) {

        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoMedico = medico.getMedicoSeparadoPorPontoEVirgula();

            bw.write(novoMedico);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "O um erro ao gravar. \n\nEntre em contato com o suporte. \n\n TEL: 3666-3666",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }

        medicos.add(medico);

    }

    public static ArrayList<Medico> listarTodos() {

        return medicos;
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void getListaMedicos() {

        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = "";

            linha = br.readLine();
            int i = 0;


            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Medico medico = new Medico(
                        Integer.valueOf(linhaVetor[0]), //codigo
                        linhaVetor[1], // nome
                        linhaVetor[2], // crm
                        linhaVetor[3], // telefone
                        linhaVetor[4], // email
                        linhaVetor[5] //data de nascimento.
                );

                medicos.add(medico);
                linha = br.readLine();
            }

            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro na leitura do arquvo");

        }
    }

    private static void atualizarArquivo() {
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            boolean criou = arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();

            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(
                    null,
                    "Ocorreu um erro ao criar o arquivo",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static DefaultTableModel getTableModel() {
        Object[][] dados = new Object[medicos.size()][3];

        int i = 0;

        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getCrm();
            i++;
        }

        String[] titulos = {"Código", "Nome do Médico", "CRM"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }

}
