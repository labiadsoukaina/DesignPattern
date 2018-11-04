package composite;

public class Feuille extends Composant {

	public Feuille(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation() {
		String tab="";
		for(int i=0;i<niveau;i++) tab+="----";
		System.out.println(tab+" Feuille "+nom);
	}
	

}
