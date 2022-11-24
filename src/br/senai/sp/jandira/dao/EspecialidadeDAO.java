package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282114\\java\\Especialidade.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282114\\java\\Especialidade_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    } //construtor criado

    public EspecialidadeDAO() {
    }//construtor root

    public static void gravar(Especialidade especialidade) {

        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE
            );

            String novaEspecialidade = especialidade.getEspecialidadeSeparadoPorPontoEVirgula();

            bw.write(novaEspecialidade);
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "O um erro ao gravar. \n\nEntre em contato com o suporte. \n\n TEL: 3666-3666",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);

        }
        especialidades.add(especialidade);

    }

    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }
        atualizarArquivo();
    }

    public static boolean excluir(Integer codigo) {

        for (Especialidade e : especialidades) {

            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        atualizarArquivo();
        

        return false;
    }

    
    private static void atualizarArquivo() {
        //reconstruir um arquivo atualizado
        //sem o plano removido
        //PASSO 01 - Criando uma representação dos arquivos a serem manipulados
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            boolean criou = arquivoTemp.createNewFile();
            
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(
                    null, 
                    "Ocorreu um erro ao criar o arquivo", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public static void getListaEspecialidade() {

        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = "";

            linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Especialidade especialidade = new Especialidade(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                especialidades.add(especialidade);
                linha = br.readLine();
            }

            br.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro para essa ação");

        } 

    }
    

    public static DefaultTableModel getTableModel() {

        Object[][] dados = new Object[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        String[] titulos = {"Código", "Nome Da Especialidade", "Descrição"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }

}
