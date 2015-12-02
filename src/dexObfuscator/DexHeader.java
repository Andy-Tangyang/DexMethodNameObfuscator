package dexObfuscator;

import java.io.RandomAccessFile;

public class DexHeader {
	public String magic = null;
	public int checksum = 0;
	public byte[] signature = new byte[20];
	public int fileSize = 0;
    public int headerSize = 0;
    public int endianTag = 0;
    public int linkSize = 0;
    public int linkOff = 0;
    public int mapOff = 0;
    public int stringIdsSize = 0;
    public int stringIdsOff = 0;
    public int typeIdsSize = 0;
    public int typeIdsOff = 0;
    public int protoIdsSize = 0;
    public int protoIdsOff = 0;
    public int fieldIdsSize = 0;
    public int fieldIdsOff = 0;
    public int methodIdsSize = 0;
    public int methodIdsOff = 0;
    public int classDefsSize = 0;
    public int classDefsOff = 0;
    public int dataSize = 0;
    public int dataOff = 0;
	public DexHeader(RandomAccessFile randomAccessFile) throws Exception{
		// TODO Auto-generated constructor stub
		byte[] buffer = new byte[8];
		randomAccessFile.read(buffer,0,8);
		this.magic = new String(buffer);
		
		buffer = new byte[4];
		randomAccessFile.read(buffer,0,4);
		this.checksum = confuse.getNum(buffer);
		
		buffer = new byte[20];
		randomAccessFile.read(buffer,0,20);
		for(int i=0;i<20;i++){
			this.signature[i] = buffer[i];
		}
		
		buffer = new byte[4];
		randomAccessFile.read(buffer,0,4);
		this.fileSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.headerSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.endianTag = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.linkSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.linkOff = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.mapOff = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.stringIdsSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.typeIdsSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.typeIdsOff = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.protoIdsSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.protoIdsOff = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.fieldIdsSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.fieldIdsOff = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.methodIdsSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.methodIdsOff = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.classDefsSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.classDefsOff = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.dataSize = confuse.getNum(buffer);
		
		randomAccessFile.read(buffer,0,4);
		this.dataOff = confuse.getNum(buffer);
		
		if(1 == 0){
			System.out.println(magic);
			System.out.println(checksum);
			System.out.println(fileSize);
		}
		
		
	}
}
