import java.io.FileInputStream;
public class Y1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		fis = new FileInputStream("c:/myfile.txt");
		int k;
		while((k=fis.read())!=-1) {
			System.out.println((char)k);
		}
		fis.close();
		}

	}


