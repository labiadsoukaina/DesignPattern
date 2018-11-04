import adapter.Adaptateur;
import adapter.Adaptateur2;
import adapter.StandImpl1;
import adapter.Standard;

public class Application {

	public static void main(String[] args) {
		Standard standard1=new StandImpl1();
		standard1.operation(7, 9);
		
		Standard standard2=new Adaptateur();
		standard2.operation(7, 9);

		Standard standard3=new Adaptateur2();
		standard3.operation(7, 9);
	}

}
