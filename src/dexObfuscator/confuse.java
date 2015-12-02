package dexObfuscator;


import java.io.File;
import java.io.RandomAccessFile;

public class confuse {
	public static void main(String[] args) throws Exception {
		File dex = new File("classes.dex");
		RandomAccessFile randomAccessFile = new RandomAccessFile(dex, "rwd");
		DexFile dexFile = new DexFile(randomAccessFile);
	}
	
	static int getNum (byte[] buffer){
		int r = 0;
		int lens = buffer.length;
		for(int i = lens-1;i >= 0;i--){
			r <<= 8;
			r = r + (((int)buffer[i]) & 0xff);
		}
		System.out.printf("%08X\n", r);
		return r;
	}
}
