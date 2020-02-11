
public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to Gharwale");
		System.out.println("Our consulting fee is ");
		
		Gharwale g = new Gharwale();
		ConsultingRequest r = new ConsultingRequest(ConsultingType.FLOORING_AND_CEILING, 350);
		
		//System.out.println(g.consultingFees(ConsultingType.MODULAR_KITCHEN) +" Rupees only");
	}
}
