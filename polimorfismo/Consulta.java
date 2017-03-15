/**
 *
 * @author Maycon de Moraes
 * @date 07/03/2017
 */
package polimorfismo;

public class Consulta {

    public static void main(String[] args) {
       
        Doutor medico = new Doutor();
        SadObject pessoaTriste = new SadObject();
        
        HappyObject pessoaFeliz = new HappyObject();
        medico.examinar(pessoaFeliz);
        medico.observar(pessoaFeliz);
        
        
        medico.examinar(pessoaTriste);
        medico.observar(pessoaTriste);
        
        
        
    }
    
}
