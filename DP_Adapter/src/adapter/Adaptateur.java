package adapter;

import exten.ImplAdaptee;

public class Adaptateur extends ImplAdaptee implements Standard {

	@Override
	public void operation(int nb1, int nb2) {
		 int res=operation2(nb1,nb2);
		 operation3(res);
		
	}

}
