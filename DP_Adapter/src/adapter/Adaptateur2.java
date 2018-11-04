package adapter;

import exten.ImplAdaptee;

public class Adaptateur2 implements Standard {
	private ImplAdaptee adaptee=new ImplAdaptee();
	@Override
	public void operation(int nb1, int nb2) {
		int res=adaptee.operation2(nb1, nb2);
		adaptee.operation3(res);
		
		
		
	}

}
