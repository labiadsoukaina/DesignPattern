/**
 * Sous-classe concrète qui définit un maillon de la chaine.
 */
public class MaillonB extends Maillon {

    /**
     * Méthode affichant un message 
     * si le nombre passé en paramètre est inférieur à 2
     * @return true, si la maillon a géré l'opération
     */
    public boolean operationSpec(int pNombre) {
        if(pNombre < 2) {
            System.out.println("MaillonB : " + pNombre + " : < 2");
            return true;
        }
        return false;
    }
}