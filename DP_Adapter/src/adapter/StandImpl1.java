package adapter;

public class StandImpl1 implements Standard{

	@Override
	public void operation(int nb1, int nb2) {
		System.out.println("Standard : R�sultat="+nb1*nb2);
		
	}

}
