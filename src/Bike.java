
public abstract class Bike {
	protected ITire tires;
	protected IFrame frame;
	protected IGear gear;
	protected String type;
	
	public void setTire(ITire tire) {
		this.tires = tire;
	}
	
	public void setFrame(IFrame frame) {
		this.frame = frame;
	}
	
	public void setGear(IGear gear) {
		this.gear = gear;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "Typ des Fahrrads: "+this.type+ "\nReifenbreite: " + tires.gettWidth() + "\nReifengröße: " + tires.gettSize()
		+ "\nGewicht des Rahmens: " + frame.getfWeight() + "\nFarbe des Rahmens: " + frame.getfColor()
		+ "\nAnzahl der Gänge: " + gear.getgCount();
	}
}
