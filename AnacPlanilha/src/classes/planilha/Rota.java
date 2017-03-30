/**
 *
 * @author Maycon de Moraes
 * @Date 30/03/2017
 * 
 * Classe Empresa.
 */
package classes.planilha;

public class Rota {
    // Atributos
    private String categoria;
    private Aeroporto origem;
    private Aeroporto destino;
    
    // Construtor

    public Rota(String categoria, Aeroporto origem, Aeroporto destino) {
        this.categoria = categoria;
        this.origem = origem;
        this.destino = destino;
    }
    
    
    
    // Métodos Mutantes e Acessores

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }
    
    
    
}
