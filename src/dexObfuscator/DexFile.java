package dexObfuscator;

import java.io.RandomAccessFile;

public class DexFile extends Configuration {
	public DexFile(DexFile dexFile, RandomAccessFile randomAccessFile) {
		super(dexFile, randomAccessFile);
		// TODO Auto-generated constructor stub
	}
	public DexFile(){};
	
	DexHeader dexHeader = null;
	DexMapList dexMapList = null;


	public void readHeader() throws Exception {
		this.dexHeader = new DexHeader();
	}
	
	public void readMap() throws Exception{
		this.dexMapList = new DexMapList();
	}
	
	public void read() throws Exception{
		this.readHeader();
		this.readMap();
	}
	
	public DexHeader getDexHeader() {
		return this.dexHeader;
	}
}
