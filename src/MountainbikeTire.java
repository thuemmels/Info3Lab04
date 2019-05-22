
public class MountainbikeTire implements ITire {
	
	private int tSize ;
	private int tWidth;
	public MountainbikeTire(int size,int width) {
		this.tSize = size;
		this.tWidth = width;
	}
	
	public int gettSize() {
		return tSize;
	}
	public int gettWidth() {
		return tWidth;
	}
}

