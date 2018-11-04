/**
 * Sous-classe concr�te qui d�finit un maillon de la chaine.
 */
public class MaillonB extends Maillon {

    /**
     * M�thode affichant un message 
     * si le nombre pass� en param�tre est inf�rieur � 2
     * @return true, si la maillon a g�r� l'op�ration
     */
    public boolean operationSpec(int pNombre) {
        if(pNombre < 2) {
            System.out.println("MaillonB : " + pNombre + " : < 2");
            return true;
        }
        return false;
    }
}