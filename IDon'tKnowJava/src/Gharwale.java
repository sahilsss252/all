
public class Gharwale {

	private int modularKitchenConsultingFee = 2000;
	private int flooringAndCeilingConsultingFee = 1500;
	private int fullHomeRenovationConsultingFee = 2500;	
	
	public int consultingFees(ConsultingRequest request) {
		switch(request.getType()) {
		case MODULAR_KITCHEN:
			return modularKitchenConsultingFee * request.getArea();
		case FLOORING_AND_CEILING:
			return flooringAndCeilingConsultingFee * request.getArea();
		case FULL_HOME_RENOVATION:
			return fullHomeRenovationConsultingFee * request.getArea();
		}
		return 500; //no use of this return
	}
	/*public int consultingFees(ConsultingType type) {
		
		switch(type) {
		case MODULAR_KITCHEN:
			return modularKitchenConsultingFee;
		case FLOORING_AND_CEILING:
			return flooringAndCeilingConsultingFee;
		case FULL_HOME_RENOVATION:
			return fullHomeRenovationConsultingFee;
		}

		return 500;
	}*/
}
