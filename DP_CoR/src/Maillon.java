/**
 * Définit l'interface d'un maillon de la chaine.
 */
public abstract class Maillon {

    private Maillon suivant;
    
    /**
     * Fixe le maillon suivant dans la chaine
     * @param pSuivant
     */
    public void setSuivant(Maillon pSuivant) {
        suivant = pSuivant;
    }
    
    /**
     * Appelle le traitement sur le maillon courant
     * Puis demande au maillon suivant d'en faire autant,
     * si le maillon courant n'a pas géré l'opération.
     * @param pNombre
     * @return Si l'opération a été gérée.
     */
    public boolean operation(int pNombre) {
        if(operationSpec(pNombre)) {
        	return true;
        };
        
        if(suivant != null) {
            return suivant.operation(pNombre);
        }
        return false;
    }

    public abstract boolean operationSpec(int pNombre);
}