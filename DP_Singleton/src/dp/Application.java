package dp;

public class Application {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			Singleton s=Singleton.getInstance();
			s.traiter("T"+i);
		}
		

	}

}
