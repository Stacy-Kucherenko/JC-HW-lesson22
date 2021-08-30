package lviv.lgs.ua;

public class AmphibiaMain {
	
	public static void main(String[] args) {
		Amphibia eat = () -> System.out.println("I want eat");
		Amphibia sleep = () -> System.out.println("I want sleep");
		Amphibia swim = () -> System.out.println("I want swim");
		Amphibia walk = () -> System.out.println("I want walk");
		
		
		eat.desires();
		sleep.desires();
		swim.desires();
		walk.desires();
	}

}
