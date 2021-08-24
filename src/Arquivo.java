import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import interfaces.ArquivoMetodos;

public class Arquivo implements ArquivoMetodos{
    public String nome;
    public String conteudo = "";
    private String url;

    public Arquivo(String nome) {
        this.nome = nome;
        this.url = System.getProperty("user.dir")+"/src/notas/"+this.nome;
    }

    

    @Override
    public void novo() {
        try{
            if(!new File(this.url).exists()){
                FileWriter filewriter = new FileWriter(this.url);
                filewriter.close();
            }            
        }catch(IOException e){
            System.out.println(e);
        }
    }



    @Override
    public void salvar() {
        try{
            PrintWriter printwriter = new PrintWriter(new File(this.url));
            printwriter.print(this.conteudo);
            printwriter.close();       
        }catch(IOException e){
            System.out.println(e);
        }
    }



    @Override
    public void abrir() {
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(this.url));
            String linha = buffer.readLine();

            while(linha != null){
                this.conteudo += linha+"\n";
                linha = buffer.readLine();
            }
            buffer.close();
        }catch(IOException e){
            System.out.println(e);;
        }
    }



    @Override
    public void excluir() {
        try{
            File file  = new File(this.url);
            file.delete();
        }catch(Exception e){
            System.out.println(e);;
        }
    }


    
    @Override
    public String toString() {
        return this.url;
    }

}
