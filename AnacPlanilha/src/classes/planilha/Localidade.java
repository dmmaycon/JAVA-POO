/**
 *
 * @author Maycon de Moraes
 * @Date 30/03/2017
 * 
 * Classe Empresa.
 */
package classes.planilha;


public class Localidade {
    //Atributos
    private String cidade;
    private String regiao;
    private String uf;
    private String pais;
    private String continente;
    
    
    
    //Construtor
    public Localidade(String cidade, String regiao, String uf, String pais, String continente) {
        this.cidade = cidade;
        this.regiao = regiao;
        this.uf = uf;
        this.pais = pais;
        this.continente = continente;
    }

    // Métodos Acessores e Mutantes
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
    
    
}
