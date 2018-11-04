/**
 * Sous-classe concrète qui définit un maillon de la chaine.
 */
public class MaillonA extends Maillon {

    /**
     * Méthode affichant un message 
     * si le nombre passé en paramètre est pair
     * @return true, si la maillon a géré l'opération
     */
    public boolean operationSpec(int pNombre) {
        if(pNombre % 2 == 0) {
            System.out.println("MaillonA : " + pNombre + " : pair");
            return true;
        }
        return false;
    }
}