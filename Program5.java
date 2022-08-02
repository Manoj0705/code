
public class Program5 {
	int c,d;
	Program5(){
		c=1;
		d=2;
		System.out.println(c+" "+d);
	}
	Program5(int a,int b){
		c=a;
		d=b;
		System.out.println(c+" "+d);
	}
	public static void main(String[] args) {
		Program5 p1=new Program5();
		Program5 p2=new Program5(3,4);

	}

}
