package classes01;

public class testInner {

	public static void main(String[] args) {
		outer o = new outer();
		o.outerMethod();
		
		outer.innerPublic i = o.new innerPublic();
		i.helloInnerPublic();
		outer.innerStaticPublic.helloInnerStaticPublic();
	}

}
