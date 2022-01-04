import java.io.File;
import java.io.IOException;
public class ChuangJian {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File f = new File("c:/abc");
		f.mkdirs();
		for(int i =1;i<=1000;i++){
			f = new File("c:/abc/"+i+".txt");
			f.createNewFile();
		}
	}

}
