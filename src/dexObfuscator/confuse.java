package dexObfuscator;


import java.io.File;
import java.io.RandomAccessFile;

public class confuse extends Configuration{

	public static void main(String[] args) throws Exception {
		File dex = new File("classes.dex");
		RandomAccessFile randomAccessFile = new RandomAccessFile(dex, "rwd");
		DexFile dexFile = new DexFile();
		Configuration configuration = new Configuration(dexFile,randomAccessFile) ;
		dexFile.read();
	}
	

}
