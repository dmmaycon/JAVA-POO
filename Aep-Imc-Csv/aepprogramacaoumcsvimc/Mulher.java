/**
 *
 * @author Maycon de Moraes
 */
package aepprogramacaoumcsvimc;


public class Mulher extends Pessoa {

    public Mulher(int id, String sexo, String nome, String sobrenome, int idade, float peso, float altura) {
        super(id, sexo, nome, sobrenome, idade, peso, altura);
    }
    
    @Override
   public String ClassificaImc(float imc){
        if(imc < 19.1){
            return "Abaixo do Peso";
        }else if(imc < 25.8){
            return "Peso normal";
        }else if(imc < 27.3){
            return "Marginalmente acima do peso";
        }else if(imc < 32.3){
            return "Acima do peso ideal";
        }else if(imc > 32.3){
            return "Obeso";
        }    
        return null;
    }
    
}
