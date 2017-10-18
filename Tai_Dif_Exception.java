
package tpp;

/**
 * Une exception qui ce declenche seulement si la taille des deux tableaux à sommer est differente
 * 
 * @author BELKIHEL Meriem
 * @version 1.1
 */
public class Tai_Dif_Exception extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tai_Dif_Exception(){
        System.out.println("ERREUR !!!!!!! Tableaux pas de même taille !");
    }
}