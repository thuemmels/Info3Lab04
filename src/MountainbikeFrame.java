
public class MountainbikeFrame implements IFrame {
	private String fColor;
	private int fWeight;
	
	public MountainbikeFrame(int weight,String color) {
		this.fWeight = weight;
		this.fColor = color;
	}

	public String getfColor() {
		return fColor;
	}

	public int getfWeight() {
		return fWeight;
	}
}
