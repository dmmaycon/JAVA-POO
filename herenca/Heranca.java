/**
 *
 * @author Maycon de Moraes
 * @date 07/03/2017
 */
package herenca;

public class Heranca {

    public static void main(String[] args) {
        MoodyObject moody = new MoodyObject();
        HappyObject feliz = new HappyObject();
        SadObject triste = new SadObject();
        
        
        System.out.println("Qual seu humor neste momento ?" );
        moody.queryMood();
        System.out.println("--------------------------------");
        System.out.println("Qual seu humor neste momento ?" );
        feliz.queryMood();
        feliz.laugh();
        System.out.println("--------------------------------");
        System.out.println("Qual seu humor neste momento ?" );
        triste.queryMood();
        triste.cry();
        System.out.println("--------------------------------");
        
        
        
    }
    
}
