package composite;

public abstract class Composant {
	protected String nom;
	protected int niveau;
	public Composant(String nom) {
		super();
		this.nom = nom;
	}
	public abstract void operation();

}
