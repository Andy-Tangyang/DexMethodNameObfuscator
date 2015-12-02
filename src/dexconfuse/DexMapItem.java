package dexconfuse;

public class DexMapItem {
	private short type = 0;
	private short unused = 0;
	private int size = 0;
	private int offset = 0;
	
	public DexMapItem(short type,short unused,int size,int offset) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.unused = unused;
		this.size = size;
		this.offset = offset;
	}
}
