import java.io.*;
public class Y3 {

	public static void main(String[] args) {
		File inf = new File ("D:\\testin.txt");
		File outf = new File ("D:\\testout.txt");
		FileReader ins = null;
		FileWriter outs = null;
		try {
			ins = new FileReader(inf);
			outs = new FileWriter(outf);
			int ch;
			while((ch = ins.read())!=-1) {
					outs.write(ch);
				}
		}catch(IOException e) {
			System.out.println(e);
			System.exit(-1);
		}
		finally {
			try {
				System.out.print("File is Written Successfully");
				ins.close();
				outs.close();
			}catch(IOException e) {
				
			}
		}
	}

}
