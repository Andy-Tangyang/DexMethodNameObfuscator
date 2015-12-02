package dexconfuse;

import java.io.RandomAccessFile;

public class DexFile {
	DexHeader dexHeader = null;
	DexMapList dexMapList = null;
	
	public DexFile(RandomAccessFile randomAccessFile) throws Exception {
		// TODO Auto-generated constructor stub
		readHeader(randomAccessFile);
		readMap(randomAccessFile,this.dexHeader);
	}
	
	public void readHeader(RandomAccessFile randomAccessFile) throws Exception {
		this.dexHeader = new DexHeader(randomAccessFile);
	}
	
	public void readMap(RandomAccessFile randomAccessFile,DexHeader dexHeader) throws Exception{
		this.dexMapList = new DexMapList(randomAccessFile,this.dexHeader);
	}
}
