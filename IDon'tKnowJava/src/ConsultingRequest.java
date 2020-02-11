
public class ConsultingRequest {

	private ConsultingType type;
	private int area;
	
	public ConsultingRequest(ConsultingType type, int area) {
		super();
		this.type = type;
		this.area = area;
	}

	public ConsultingType getType() {
		return type;
	}

	public void setType(ConsultingType type) {
		this.type = type;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	
}
