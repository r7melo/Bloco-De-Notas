import java.io.File;
import java.util.ArrayList;
import java.util.List;

import interfaces.GerenciadorDeArquivoMetodos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class GerenciadorDeArquivo implements GerenciadorDeArquivoMetodos {

    public Arquivo arquivo;

    @Override
    public void atualizarDiretorio(ListView<String> listaview) {

        List<String> listaNomes = new ArrayList<String>();
        ObservableList<String> obsListaAquivos;
        File arquivos[] = new File(System.getProperty("user.dir")+"/src/notas").listFiles();

        for(int i = 0; i < arquivos.length; i++) {
            listaNomes.add(arquivos[i].getName());
        }
        
        obsListaAquivos = FXCollections.observableArrayList(listaNomes);
        listaview.setItems(obsListaAquivos);
    }
    
}
