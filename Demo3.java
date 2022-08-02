
public class Demo3 {

	public static void main(String[] args) {
		int ch=1;
		switch(ch)
		{
			case 1:for(int i=1; i<10; i++) {
				if(i%2==0)
					continue;
				System.out.println(i);
			}
			break;
			case 2:System.out.println("All control statements are created");
			break;
			default: System.out.println("invalidoption");
			
		}
	}
}

