/**
 *
 * @author Maycon de Moraes
 */
package aepprogramacaoumcsvimc;


public class Homem extends Pessoa{

    public Homem(int id, String sexo, String nome, String sobrenome, int idade, float peso, float altura){
        super(id, sexo, nome, sobrenome, idade, peso, altura);
    }
    
    @Override
    public String ClassificaImc(float imc){
        if(imc < 20.7){
            return "Abaixo do Peso";
        }else if(imc < 26.4){
            return "Peso normal";
        }else if(imc < 27.8){
            return "Marginalmente acima do peso";
        }else if(imc < 31.1){
            return "Acima do peso ideal";
        }else if(imc > 31.1){
            return "Obeso";
        }    
        return null;
    }
        
        
}
    
    
