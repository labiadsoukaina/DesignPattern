/**
 * D�finit l'interface d'un maillon de la chaine.
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
     * si le maillon courant n'a pas g�r� l'op�ration.
     * @param pNombre
     * @return Si l'op�ration a �t� g�r�e.
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