/* 
*
 * @author Maycon de Moraes
 * @date 07/03/2017
 */
package polimorfismo;

public class Doutor {
    
    public void examinar(MoodyObject obj){
        System.out.println("Como você está se sentido hoje?");
        obj.queryMood();
    }
    
    public void observar(SadObject obj){
        obj.cry();
    }
    
    public void observar(HappyObject obj){
        obj.laugh();
    }
 
}
