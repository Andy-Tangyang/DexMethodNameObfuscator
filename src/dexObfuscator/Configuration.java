package dexObfuscator;

import java.io.RandomAccessFile;

public class Configuration {
	private static DexFile dexFile = null;
	private static RandomAccessFile randomAccessFile = null;
	public Configuration(){};
	public Configuration(DexFile dexFile,RandomAccessFile randomAccessFile){
		this.dexFile = dexFile;
		this.randomAccessFile = randomAccessFile;
	}
	
	public static DexFile getDexFile(){
		return dexFile;
	}
	
	public static RandomAccessFile getRandomAccessFile(){
		return randomAccessFile;
	}
	
	public static int getNum (byte[] buffer){
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
