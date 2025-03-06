package Ejercicio7.EJ7;

/**
 *
 * @author Uniminuto Tibu
 */
public class KnifeEnemy implements Enemy{
    public void doActionStab(){
        System.out.println("Apuñalando.");
    }
    
    @Override
    public void doAction(){
        doActionStab();
    }
}
