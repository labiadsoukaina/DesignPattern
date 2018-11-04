
public class Application {
	 public static void main(String[] args) {
	        // Cr�ation des maillons
	        Maillon lMaillonA = new MaillonA();
	        Maillon lMaillonB = new MaillonB();
	        Maillon lMaillonC = new MaillonC();
	        
	        // D�finition de l'enchainement des maillons
	        lMaillonA.setSuivant(lMaillonB);
	        lMaillonB.setSuivant(lMaillonC);
	        
	        // Appel de la m�thode du premier maillon
	        // avec des valeurs diff�rentes
	        System.out.println("--> Appel de la m�thode avec param�tre '1' : ");
	        lMaillonA.operation(1);
	        System.out.println("--> Appel de la m�thode avec param�tre '2' : ");
	        lMaillonA.operation(2);
	        System.out.println("--> Appel de la m�thode avec param�tre '3' : ");
	        lMaillonA.operation(3);
	        System.out.println("--> Appel de la m�thode avec param�tre '4' : ");
	        lMaillonA.operation(4);
	        
	        // Affichage : 
	        // --> Appel de la m�thode avec param�tre '1' : 
	        // MaillonB : 1 : < 2
	        // --> Appel de la m�thode avec param�tre '2' : 
	        // MaillonA : 2 : pair
	        // --> Appel de la m�thode avec param�tre '3' : 
	        // MaillonC : 3 : > 2
	        // --> Appel de la m�thode avec param�tre '4' : 
	        // MaillonA : 4 : pair
	    }

}
