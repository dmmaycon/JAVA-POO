/**
 *
 * @author Maycon de Moraes
 * @Date 30/03/2017
 * 
 * Classe Empresa.
 */
package classes.planilha;

public class Empresa {
    
    // Atributos
    private String sigla;
    private String nome;
    private String nacionalidade;
    
    // Método Construtor

    public Empresa(String sigla, String nome, String nacionalidade) {
        this.sigla = sigla;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    
    // Métodos Mutantes e Acessores

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
}
