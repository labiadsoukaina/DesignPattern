package composite;

import java.util.List;
import java.util.ArrayList;

public class Composite extends Composant {
	public Composite(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	private List<Composant> composants=new ArrayList<Composant>();

	@Override
	public void operation() {
		String tab="";
		for(int i=0;i<niveau;i++) tab+="----";
		System.out.println(tab+" Composite:"+nom);
		for(Composant c:composants) {
			c.operation();
		}
	}
	public void ajouter(Composant c) {
		c.niveau=this.niveau+1;
		composants.ajouter(c);
	}
	public void retirer(Composant c) {
		composants.retirer(c);
	}
	public List<Composant> getEnfant(){
		return composants;
	}
	
	

}
