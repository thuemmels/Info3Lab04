
public class Main {

	public static void main(String[] args) {
		BikeDirector director = new BikeDirector();
		BikeBuilder builder = new RacerBuilder();
		
		Bike racer = director.constructBike(builder, 28, 3, 10, "black and blue", 22);
		
		builder = new MountainbikeBuilder();
		Bike mountainbike = director.constructBike(builder,29, 7, 16, "black and green", 21);
		
		System.out.println(racer.toString());
		System.out.println(mountainbike.toString());
	}
}
