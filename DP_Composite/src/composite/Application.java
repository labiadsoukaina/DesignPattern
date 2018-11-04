package composite;

public class Application {
	public static void main(String[] args) {
		Composite racine=new Composite("composite1");
		Composite composite2=new Composite("compositeé");
		racine.ajouter(composite2);
		racine.ajouter(new Feuille("Fichire 11"));
		racine.ajouter(new Feuille("Fichire 12"));
		racine.ajouter(new Feuille("Fichire 13"));
		composite2.ajouter(new Feuille("Fichire 21"));
		composite2.ajouter(new Feuille("Fichire 22"));
		
		racine.operation();
	}

}
