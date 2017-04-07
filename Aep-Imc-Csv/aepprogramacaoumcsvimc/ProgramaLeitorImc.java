/**
 *
 * @author Maycon de Moraes
 */
package aepprogramacaoumcsvimc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ProgramaLeitorImc {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Variaveis que arazenam a média
        float mediaImcGeral, mediaImcHomem, mediaImcMulher, totalImcHomem = 0, totalImcMulher, totalImcGeral = 0;
        float mediaIdadeGeral, mediaIdadeHomem, mediaIdadeMulher, totalIdadeHomem, totalIdadeMulher, totalIdadeGeral;
              
        
        /*
        Pessoa homem = new Homem(1, "masculino", "pedro", "junior", 20, 80.4f, 181.1f);
        Pessoa mulher = new Mulher(2, "feminino", "julia", "pedra", 20, 70.0f, 162.5f);
        */
        
        BufferedReader br = new BufferedReader(new FileReader("src/Lista/lista.csv"));
        String line = "";

        while ((line = br.readLine()) != null) {
            String[] row = line.split(";");
            if(row[0].equals("id")){
                System.out.println("LISTA DE PESSOAS");
            }else{
                if(row[1].equals("masculino")){
                    int id = Integer.parseInt(row[0]);
                    String sexo = row[1];
                    String nome = row[2];
                    String sobrenome = row[3];
                    int idade = Integer.parseInt(row[4]);
                    float peso = Float.parseFloat(row[5]);
                    float altura = Float.parseFloat(row[6]);

                    Pessoa homem = new Homem(id, sexo, nome, sobrenome, idade, peso, altura);

                    System.out.println("Nome: " + homem.getNome() + " está " + homem.ClassificaImc(homem.CalculaImc(peso, altura)));

                    totalImcGeral += homem.CalculaImc(peso, altura);
                    totalImcHomem += homem.CalculaImc(peso, altura);

                }else{
                    int id = Integer.parseInt(row[0]);
                    String sexo = row[1];
                    String nome = row[2];
                    String sobrenome = row[3];
                    int idade = Integer.parseInt(row[4]);
                    float peso = Float.parseFloat(row[5]);
                    float altura = Float.parseFloat(row[6]);

                    Pessoa mulher = new Mulher(id, sexo, nome, sobrenome, idade, peso, altura);

                    System.out.println("Nome: " + mulher.getNome() + " está " + mulher.ClassificaImc(mulher.CalculaImc(peso, altura)));

                    totalImcGeral += mulher.CalculaImc(peso, altura);
                    totalImcHomem += mulher.CalculaImc(peso, altura);
                }
            }
        }
        
        
    }
    
}
