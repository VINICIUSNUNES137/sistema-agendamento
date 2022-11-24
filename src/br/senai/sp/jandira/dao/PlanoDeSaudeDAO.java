package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    private static final String ARQUIVO = "C:\\Users\\22282114\\java\\PlanoDeSaude.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282114\\java\\PlanoDeSaude_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }//ver

    public PlanoDeSaudeDAO() {

    }//construtor root

    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }
            atualizarArquivo();
        }
    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE
            );

            String novoPlanoDeSaude = planoDeSaude.getPlanoDeSaudeSeparadoPorPontoEVirgula();

            bw.write(novoPlanoDeSaude);
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "O um erro ao gravar. \n\nEntre em contato com o suporte. \n\n TEL: 3666-3666",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);

        }
        planos.add(planoDeSaude);

    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (Objects.equals(p.getCodigo(), codigo)) {
                planos.remove(p);
                break;
            }
        }
        
        atualizarArquivo();
        
        return false;
    }//

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    } //entender :/

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;

    }

    public static void getListaPlanoDeSaude() {

        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = "";

            linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude(
                        Integer.valueOf(
                                linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                planos.add(novoPlanoDeSaude);
                linha = br.readLine();
            }

            br.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro para essa ação");

        }
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
            
            for(PlanoDeSaude e : planos) {
                bwTemp.write(e.getPlanoDeSaudeSeparadoPorPontoEVirgula());
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

    //GUI
    public static DefaultTableModel getTabelModel() {

        //matriz que receberá os planosDeSaude
        //que serão utilizados na tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        //for each para extrair cada objeto plano de saúde do
        //do arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        //Definir um vetor coom os nomes das colunas da tabela
        String[] titulos = {"Código", "Nome da Operadora", "Tipo do Plano"};

        //criar um modelo que será utilizado pela JTable
        //para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
