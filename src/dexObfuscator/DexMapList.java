package dexObfuscator;

import java.io.RandomAccessFile;
import java.util.ArrayList;

public class DexMapList {
	
	int mapSize = 0;
	byte[] buffer = null;
	ArrayList<DexMapItem> arrayList;
	
	public DexMapList(RandomAccessFile randomAccessFile,DexHeader dexHeader) throws Exception{
		// TODO Auto-generated constructor stub
		randomAccessFile.seek(dexHeader.mapOff);
		buffer = new byte[4];
		randomAccessFile.read(buffer,0,4);
		mapSize = confuse.getNum(buffer);
		arrayList = new ArrayList<>();
		for(int i = 0;i < mapSize;i++){
			buffer = new byte[2];
			randomAccessFile.read(buffer,0,2);
			short type = (short)confuse.getNum(buffer);
			randomAccessFile.read(buffer,0,2);
			short unused = (short)confuse.getNum(buffer);
			buffer = new byte[4];
			randomAccessFile.read(buffer,0,4);
			int size = confuse.getNum(buffer);
			randomAccessFile.read(buffer,0,4);
			int offset = confuse.getNum(buffer);
			DexMapItem item = new DexMapItem(type,unused,size,offset);
			arrayList.add(item);
		}
	}
}
