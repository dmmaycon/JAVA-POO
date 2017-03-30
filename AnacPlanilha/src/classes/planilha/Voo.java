/**
 *
 * @author Maycon de Moraes
 * @Date 30/03/2017
 * 
 * Classe Empresa.
 */
package classes.planilha;

public class Voo {
    
    // Atributos
    private String naturesa;
    private String grupoVoo;
    private Passageiro passageiros;
    private Correio carga;
    
    
    
    // Construtor
    
     public Voo(String naturesa, String grupoVoo, Passageiro passageiros, Correio carga) {
        this.naturesa = naturesa;
        this.grupoVoo = grupoVoo;
        this.passageiros = passageiros;
        this.carga = carga;
    }
    
    //Métodos Acessor e Mutante

    public String getNaturesa() {
        return naturesa;
    }

    public void setNaturesa(String naturesa) {
        this.naturesa = naturesa;
    }

    public String getGrupoVoo() {
        return grupoVoo;
    }

    public void setGrupoVoo(String grupoVoo) {
        this.grupoVoo = grupoVoo;
    }

    public Passageiro getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Passageiro passageiros) {
        this.passageiros = passageiros;
    }

    public Correio getCarga() {
        return carga;
    }

    public void setCarga(Correio carga) {
        this.carga = carga;
    }
     

    
    
}
