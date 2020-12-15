package Cal01;

public class ifElse {

	public static void main(String[] args) {
		int x = 9;
		if(x==10)
			System.out.println("yes, it is 10");
		else
			System.out.println("no, it is not 10");
		if(x==10 || x==9)
			System.out.println("yes, it is either 10 or 9");
		else
			System.out.println("no, its neither 10 or 9");
		
		int score = 98;
				if(score >=90)
					System.out.println("it's top score");
				else if(score < 60 && score >50)
					System.out.println("try to make better");
				else if(score > 60 && score <90)
					System.out.println("not bad");
				else
					System.out.println("retry...");
	}

}
