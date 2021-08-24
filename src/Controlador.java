import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controlador extends GerenciadorDeArquivo{

    @FXML
    private Button btnNovo;

    @FXML
    private TextField inputCampoArquivo;

    @FXML
    private Button btnAbrir;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnFechar;

    @FXML
    private ListView<String> outputListaArquivo;

    @FXML
    private TextArea inputTextoArquivo;

    @FXML
    void fechar(ActionEvent event) {
        this.salvar(null);
        System.exit(0);
    }

    
    @FXML
    void novo (ActionEvent event)  throws IOException{
        Arquivo arquivo = new Arquivo(this.inputCampoArquivo.getText());
        if(this.inputCampoArquivo.getText() != null){
            arquivo.novo();
        }
            
        this.inputCampoArquivo.setText("");
        
        this.arquivo = new Arquivo(arquivo.nome);
        this.arquivo.abrir();

        atualizarDiretorio(this.outputListaArquivo);
    }

    @FXML
    void excluir(ActionEvent event) {
        Arquivo arquivo = new Arquivo(outputListaArquivo.getSelectionModel().getSelectedItem());
        arquivo.excluir();
        
        this.inputTextoArquivo.setText("");
        atualizarDiretorio(this.outputListaArquivo);
    }

    @FXML
    void salvar(ActionEvent event) {
        if(!this.inputTextoArquivo.getText().equals("") && this.arquivo.nome != null){
            this.arquivo.conteudo = this.inputTextoArquivo.getText();
            this.arquivo.salvar();
        }
    }

    
    @FXML
    void selecaoItem(MouseEvent event) {
        this.arquivo = new Arquivo(outputListaArquivo.getSelectionModel().getSelectedItem());
        this.arquivo.abrir();

        this.inputTextoArquivo.setText(arquivo.conteudo);

        atualizarDiretorio(this.outputListaArquivo);
    }
    
}
