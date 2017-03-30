/**
 *
 * @author Maycon de Moraes
 * @Date 30/03/2017
 * 
 * Classe Empresa.
 */
package classes.planilha;


public class Aeroporto {
    // Atributos
    private String nome;
    private String sigla;
    private Localidade localidade;
  
    
    
    // Construtor

    public Aeroporto(String nome, String sigla, Localidade localidade) {
        this.nome = nome;
        this.sigla = sigla;
        this.localidade = localidade;
    }
    
    
    
    // Métodos Acessores e Mutantes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }
    
    
}
