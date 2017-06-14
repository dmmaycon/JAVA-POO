/**
 *
 * @author Maycon de Moraes
 * @date 12/06/2017
 */
package Leitor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class LeitoraCsv {
    public BufferedReader br;
    public String line;
    public String caminhoArq;
    public String separador;
    public int qtdColunas;
    public ArrayList<String> arr;
    
    public LeitoraCsv(String caminhoArq, String separador, int qtdColunas) throws FileNotFoundException {
        this.caminhoArq = caminhoArq;
        this.separador = separador;
        this.qtdColunas = qtdColunas;
        this.arr = new ArrayList();
        
        
        this.br = new BufferedReader(new FileReader(caminhoArq));
    }
      
    public ArrayList lerArquivo() throws IOException{
        int cont = 0;
        this.line = "";
        String linhaFormada = "";
        while((line = this.br.readLine()) != null){
            String[] row = line.split(this.separador);
            for(int x = 0; x < this.qtdColunas; x++){
                linhaFormada += row[x] + " "; 
                //System.out.println("Linha: " + x +" Conteudo: " + row[x]);
            }
            
            this.arr.add(linhaFormada);
            linhaFormada = "";
            cont++;
        }
        return arr;
    } 
           
}