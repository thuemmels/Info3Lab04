
public class RacerFrame implements IFrame {
	private String fColor;
	private int fWeight;
	
	public RacerFrame(int weight,String color) {
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
