
public class RacerTire implements ITire {

	private int tSize ;
	private int tWidth;
	public RacerTire(int size,int width) {
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
